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
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.user.dao
 * @类名: UserDao
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月9日 下午9:47:38
 */
public class UserDao extends BaseDao<User> {
	
	// 用户名查询
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
	
	// 插入
	public Boolean insert(User user) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
			conn.setAutoCommit(false);
			qr.update(conn, "insert into TAB_User values(?,?,?,?)",
					new Object[] { 
							user.getId(),
							user.getName(),
							MD5Util.md5(user.getPassword()),
							user.getRights()
							});
			// 提交事务
			conn.commit();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			// 回滚事务
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

	// 修改
	public Boolean update(User user) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
			conn.setAutoCommit(false);
			qr.update(conn,"update TAB_User set name=?,password=?,rights=? where id=?",
					new Object[]{
							user.getName(),
							user.getPassword(),
							user.getRights(),
							user.getId()
							});
			// 提交事务
			conn.commit();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			// 回滚事务
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
