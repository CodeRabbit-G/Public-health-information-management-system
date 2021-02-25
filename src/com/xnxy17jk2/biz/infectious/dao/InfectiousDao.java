package com.xnxy17jk2.biz.infectious.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.Infectious;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.infected.dao
 * @����: Infected
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����9:47:18
 */
public class InfectiousDao extends BaseDao<Infectious> {

	// ����
	public Boolean insert(Infectious infectious) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn, "insert into TAB_Infectious values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
					new Object[] { 
							infectious.getId(),
							infectious.getName(),
							infectious.getrId(),
							infectious.getBirthday(),
							infectious.getPhone(),
							infectious.getAddress(),
							infectious.getStartDate(),
							infectious.getDiagnosisDate(),
							infectious.getCardType(),
							infectious.getType(),
							infectious.getCategory(),
							infectious.getOccupation(),
							infectious.getDoctorReport(),
							infectious.getRegistrationDate()
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
	public Boolean update(Infectious infectious) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn,"update TAB_Infectious set name=?,rId=?,birthday=?,phone=?,address=?,startDate=?,"
					+ "diagnosisDate=?,cardType=?,type=?,category=?,occupation=?,doctorReport=?,registrationDate=? where id=?",
					new Object[]{
							infectious.getName(),
							infectious.getrId(),
							infectious.getBirthday(),
							infectious.getPhone(),
							infectious.getAddress(),
							infectious.getStartDate(),
							infectious.getDiagnosisDate(),
							infectious.getCardType(),
							infectious.getType(),
							infectious.getCategory(),
							infectious.getOccupation(),
							infectious.getDoctorReport(),
							infectious.getRegistrationDate(),
							infectious.getId()
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

