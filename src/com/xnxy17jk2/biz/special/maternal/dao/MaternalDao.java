package com.xnxy17jk2.biz.special.maternal.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.Maternal;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.special.maternal.dao
 * @����: MaternalDao
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����8:51:46
 */
public class MaternalDao extends BaseDao<Maternal> {

	// ����
	public Boolean insert(Maternal maternal) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn, "insert into TAB_Maternal values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
					new Object[] { 
							maternal.getId(),
							maternal.getName(),
							maternal.getrId(),
							maternal.getBirthday(),
							maternal.getPhone(),
							maternal.getAddress(),
							maternal.getExpected(),
							maternal.getDeliveryRecord(),
							maternal.getOneVisit(),
							maternal.getGestationalAge(),
							maternal.getTwoVisit(),
							maternal.getPostpartumVisit(),
							maternal.getPostpartum42Day(),
							maternal.getDeliveryMode(),
							maternal.getDeliveryDate(),
							maternal.getBabyName(),
							maternal.getBabySex(),
							maternal.getHusband(),
							maternal.getHealthCard(),
							maternal.getRegistrationDate()
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
	public Boolean update(Maternal maternal) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn,"update TAB_Maternal set name=?,rId=?,birthday=?,phone=?,address=?,expected=?,"
					+ "deliveryRecord=?,onevisit=?,gestationalAge=?,twoVisit=?,postpartumVisit=?,postpartum42Day=?,"
					+ "deliveryMode=?,deliveryDate=?,babyName=?,babySex=?,husband=?,healthCard=?,registrationDate=? where id=?",
					new Object[]{
							maternal.getName(),
							maternal.getrId(),
							maternal.getBirthday(),
							maternal.getPhone(),
							maternal.getAddress(),
							maternal.getExpected(),
							maternal.getDeliveryRecord(),
							maternal.getOneVisit(),
							maternal.getGestationalAge(),
							maternal.getTwoVisit(),
							maternal.getPostpartumVisit(),
							maternal.getPostpartum42Day(),
							maternal.getDeliveryMode(),
							maternal.getDeliveryDate(),
							maternal.getBabyName(),
							maternal.getBabySex(),
							maternal.getHusband(),
							maternal.getHealthCard(),
							maternal.getRegistrationDate(),
							maternal.getId()
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
