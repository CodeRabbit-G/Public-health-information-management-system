package com.xnxy17jk2.biz.education.personal.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.Personal;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.education.personal.dao
 * @����: Personal
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����9:46:29
 */
public class PersonalDao extends BaseDao<Personal> {

	// ����
	public Boolean insert(Personal personal) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn, "insert into TAB_Personal values(?,?,?,?,?,?,?,?,?,?)",
					new Object[] { 
							personal.getId(),
							personal.getName(),
							personal.getrId(),
							personal.getBirthday(),
							personal.getPhone(),
							personal.getEduDoctor(),
							personal.getEduDate(),
							personal.getEduMode(),
							personal.getEduTheme(),
							personal.getEduContent()
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
	public Boolean update(Personal personal) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn,"update TAB_Personal set name=?,rId=?,birthday=?,phone=?,eduDoctor=?,eduDate=?,eduMode=?,eduTheme=?,eduContent=? where id=?",
					new Object[]{
							personal.getName(),
							personal.getrId(),
							personal.getBirthday(),
							personal.getPhone(),
							personal.getEduDoctor(),
							personal.getEduDate(),
							personal.getEduMode(),
							personal.getEduTheme(),
							personal.getEduContent(),
							personal.getId()
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
