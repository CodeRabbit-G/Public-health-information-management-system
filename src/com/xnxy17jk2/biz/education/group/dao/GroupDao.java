package com.xnxy17jk2.biz.education.group.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.Group;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.education.group.dao
 * @����: Group
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����9:46:05
 */
public class GroupDao extends BaseDao<Group> {

	// ����
	public Boolean insert(Group group) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn, "insert into TAB_Group values(?,?,?,?,?,?,?,?)",
					new Object[] { 
							group.getId(),
							group.getEduDate(),
							group.getEduTheme(),
							group.getEduType(),
							group.getEduPlace(),
							group.getEduObject(),
							group.getEduNumber(),
							group.getEduContent()
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
	public Boolean update(Group group) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn,"update TAB_Group set eduDate=?,eduTheme=?,eduType=?,eduPlace=?,eduObject=?,eduNumber=?,eduContent=? where id=?",
					new Object[]{
							group.getEduDate(),
							group.getEduTheme(),
							group.getEduType(),
							group.getEduPlace(),
							group.getEduObject(),
							group.getEduNumber(),
							group.getEduContent(),
							group.getId()
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

