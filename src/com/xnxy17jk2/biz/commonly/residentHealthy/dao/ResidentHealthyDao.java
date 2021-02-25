package com.xnxy17jk2.biz.commonly.residentHealthy.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.ResidentHealthy;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.commonly.residentHealthy.dao
 * @����: ResidentHealthyDao
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����3:19:19
 */
public class ResidentHealthyDao extends BaseDao<ResidentHealthy> {

	// ����
	public Boolean insert(ResidentHealthy residentHealthy) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn, "insert into tab_residentHealthy values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
					new Object[] { 
							residentHealthy.getId(),
							residentHealthy.getName(),
							residentHealthy.getrId(),
							residentHealthy.getSex(),
							residentHealthy.getBirthday(),
							residentHealthy.getPhone(),
							residentHealthy.getAddress(),
							residentHealthy.getPulse(),
							residentHealthy.getHeight(),
							residentHealthy.getWeight(),
							residentHealthy.getBloodPressure(),
							residentHealthy.getHealtAssessment(),
							residentHealthy.getResponsibleDoctor(),
							residentHealthy.getAllergy(),
							residentHealthy.getDisease(),
							residentHealthy.getSurgery(),
							residentHealthy.getFamily(),
							residentHealthy.getDisability()
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
	public Boolean update(ResidentHealthy residentHealthy) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn,
					"update tab_residentHealthy set name=?,rid=?,sex=?,birthday=?,phone=?,address=?,"
					+ "pulse=?,height=?,weight=?,bloodpressure=?,healtassessment=?,responsibledoctor=?,"
					+ "allergy=?,disease=?,surgery=?,family=?,disability=? where id=?",
					new Object[] { 
							residentHealthy.getName(),
							residentHealthy.getrId(),
							residentHealthy.getSex(),
							residentHealthy.getBirthday(),
							residentHealthy.getPhone(),
							residentHealthy.getAddress(),
							residentHealthy.getPulse(),
							residentHealthy.getHeight(),
							residentHealthy.getWeight(),
							residentHealthy.getBloodPressure(),
							residentHealthy.getHealtAssessment(),
							residentHealthy.getResponsibleDoctor(),
							residentHealthy.getAllergy(),
							residentHealthy.getDisease(),
							residentHealthy.getSurgery(),
							residentHealthy.getFamily(),
							residentHealthy.getDisability(),
							residentHealthy.getId()
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