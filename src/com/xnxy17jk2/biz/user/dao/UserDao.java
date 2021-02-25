package com.xnxy17jk2.biz.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.xnxy17jk2.entity.User;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;
import com.xnxy17jk2.util.MD5Util;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.user.dao
 * @����: UserDao
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��9�� ����9:47:38
 */
public class UserDao extends BaseDao<User> {
	
	// �û�����ѯ
	public User queryByName(String name) {
		try {
			String sql = "select * from TAB_User where name=?";
			QueryRunner run = new QueryRunner(JdbcUtil.getDataSource());
			User user = (User)run.query(sql,new BeanHandler(User.class),new Object[]{name});
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	// ����
	public Boolean insert(User user) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn, "insert into TAB_User values(?,?,?,?)",
					new Object[] { 
							user.getId(),
							user.getName(),
							MD5Util.md5(user.getPassword()),
							user.getRights()
							});
			// �ύ����
			conn.commit();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			// �ع�����
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			return false;
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// �޸�
	public Boolean update(User user) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn,"update TAB_User set name=?,password=?,rights=? where id=?",
					new Object[]{
							user.getName(),
							user.getPassword(),
							user.getRights(),
							user.getId()
							});
			// �ύ����
			conn.commit();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			// �ع�����
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			return false;
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
