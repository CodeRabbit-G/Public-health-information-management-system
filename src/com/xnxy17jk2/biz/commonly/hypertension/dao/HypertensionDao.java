package com.xnxy17jk2.biz.commonly.hypertension.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.Hypertension;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.commonly.hypertension.dao
 * @����: HypertensionDao
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����6:54:12
 */
public class HypertensionDao extends BaseDao<Hypertension> {

	// ����
	public Boolean insert(Hypertension hypertension) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn, "insert into tab_hypertension values(?,?,?,?,?,?,?,?,?,?)",
					new Object[] { 
							hypertension.getId(),
							hypertension.getName(),
							hypertension.getrId(),
							hypertension.getSex(),
							hypertension.getBirthday(),
							hypertension.getPhone(),
							hypertension.getAddress(),
							hypertension.getBloodPressure(),
							hypertension.getGrade(),
							hypertension.getTestDate()
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
	public Boolean update(Hypertension hypertension) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn,
					"update tab_hypertension set name=?,rId=?,sex=?,birthday=?,phone=?,address=?,bloodpressure=?,grade=?,testdate=? where id=?",
					new Object[] { 
							hypertension.getName(),
							hypertension.getrId(),
							hypertension.getSex(),
							hypertension.getBirthday(),
							hypertension.getPhone(),
							hypertension.getAddress(),
							hypertension.getBloodPressure(),
							hypertension.getGrade(),
							hypertension.getTestDate(),
							hypertension.getId()
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
}
