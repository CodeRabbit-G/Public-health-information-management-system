package com.xnxy17jk2.biz.commonly.resident.dao;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.Resident;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.commonly.resident.dao
 * @����: ResidentDao
 * @˵��: ResidentDao
 * @����: Guo_SY
 * @����ʱ��: 2020��4��29�� ����8:55:10
 */
public class ResidentDao extends BaseDao<Resident> {

	// ����
	public Boolean insert(Resident resident) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn, "insert into TAB_Resident values(?,?,?,?,?,?,?,?,?,?,?,?)",
					new Object[] { 
							resident.getId(), 
							resident.getName(), 
							resident.getrId(), 
							resident.getSex(),
							resident.getNation(), 
							resident.getBirthday(), 
							resident.getPhone(), 
							resident.getAddress(),
							resident.getProvince(), 
							resident.getDiploma(), 
							resident.getOccupation(),
							resident.getMarriage() 
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
	public Boolean update(Resident resident) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn,"update TAB_Resident set name=?,rId=?,sex=?,nation=?,birthday=?,"
					+ "phone=?,address=?,province=?,diploma=?,occupation=?,marriage=? where id=?",
					new Object[]{
						resident.getName(),
						resident.getrId(),
						resident.getSex(),
						resident.getNation(),
						resident.getBirthday(),
						resident.getPhone(),
						resident.getAddress(),
						resident.getProvince(),
						resident.getDiploma(),
						resident.getOccupation(),
						resident.getMarriage(),
						resident.getId()
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
