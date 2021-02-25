package com.xnxy17jk2.biz.special.elderly.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.Elderly;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.special.elderly.dao
 * @����: ElderlyDaoDao
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����8:51:25
 */
public class ElderlyDao extends BaseDao<Elderly> {

	// ����
	public Boolean insert(Elderly elderly) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn, "insert into TAB_Elderly values(?,?,?,?,?,?,?,?,?,?,?,?)",
					new Object[] { 
							elderly.getId(),
							elderly.getName(),
							elderly.getrId(),
							elderly.getSex(),
							elderly.getBirthday(),
							elderly.getPhone(),
							elderly.getAddress(),
							elderly.getTestDate(),
							elderly.getSelfCare(),
							elderly.getHealthy(),
							elderly.getHypertension(),
							elderly.getDiabetes()
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
	public Boolean update(Elderly elderly) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn,"update TAB_Elderly set name=?,rId=?,sex=?,birthday=?,phone=?,address=?,testDate=?,"
					+ "selfCare=?,healthy=?,hypertension=?,diabetes=? where id=?",
					new Object[]{
							elderly.getName(),
							elderly.getrId(),
							elderly.getSex(),
							elderly.getBirthday(),
							elderly.getPhone(),
							elderly.getAddress(),
							elderly.getTestDate(),
							elderly.getSelfCare(),
							elderly.getHealthy(),
							elderly.getHypertension(),
							elderly.getDiabetes(),
							elderly.getId()
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
