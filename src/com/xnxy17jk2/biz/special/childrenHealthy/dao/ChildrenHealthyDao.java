package com.xnxy17jk2.biz.special.childrenHealthy.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.ChildrenHealthy;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.special.childrenHealthy.dao
 * @����: ChildrenHealthyDao
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����8:49:39
 */
public class ChildrenHealthyDao extends BaseDao<ChildrenHealthy> {

	// ����
	public Boolean insert(ChildrenHealthy childrenHealthy) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn, "insert into TAB_ChildrenHealthy values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",
					new Object[] { 
							childrenHealthy.getId(),
							childrenHealthy.getName(),
							childrenHealthy.getrId(),
							childrenHealthy.getSex(),
							childrenHealthy.getBirthday(),
							childrenHealthy.getPhone(),
							childrenHealthy.getAddress(),
							childrenHealthy.getInfirmity(),
							childrenHealthy.getInfirmityFactor(),
							childrenHealthy.getVisit(),
							childrenHealthy.getOneYears(),
							childrenHealthy.getTwoYears(),
							childrenHealthy.getSixYears(),
							childrenHealthy.getMother(),
							childrenHealthy.getFather()
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
	public Boolean update(ChildrenHealthy childrenHealthy) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn,"update TAB_ChildrenHealthy set name=?,rId=?,sex=?,birthday=?,phone=?,address=?,"
					+ "infirmity=?,infirmityFactor=?,visit=?,oneYears=?,twoYears=?,sixYears=?,mother=?,father=? where id=?",
					new Object[]{
							childrenHealthy.getName(),
							childrenHealthy.getrId(),
							childrenHealthy.getSex(),
							childrenHealthy.getBirthday(),
							childrenHealthy.getPhone(),
							childrenHealthy.getAddress(),
							childrenHealthy.getInfirmity(),
							childrenHealthy.getInfirmityFactor(),
							childrenHealthy.getVisit(),
							childrenHealthy.getOneYears(),
							childrenHealthy.getTwoYears(),
							childrenHealthy.getSixYears(),
							childrenHealthy.getMother(),
							childrenHealthy.getFather(),
							childrenHealthy.getId()
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
