package com.xnxy17jk2.biz.special.childrenVaccine.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.ChildrenVaccine;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.special.childrenVaccine.dao
 * @����: ChildrenVaccineDao
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����8:51:06
 */
public class ChildrenVaccineDao extends BaseDao<ChildrenVaccine> {

	// ����
	public Boolean insert(ChildrenVaccine childrenVaccine) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn, "insert into TAB_ChildrenVaccine values(?,?,?,?,?,?,?,?,?,?)",
					new Object[] { 
							childrenVaccine.getId(),
							childrenVaccine.getName(),
							childrenVaccine.getrId(),
							childrenVaccine.getSex(),
							childrenVaccine.getBirthday(),
							childrenVaccine.getRelatives(),
							childrenVaccine.getPhone(),
							childrenVaccine.getAddress(),
							childrenVaccine.getInoculationDate(),
							childrenVaccine.getInoculationContent()
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
	public Boolean update(ChildrenVaccine childrenVaccine) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn,"update TAB_ChildrenVaccine set name=?,rId=?,sex=?,birthday=?,relatives=?,phone=?,address=?,inoculationDate=?,inoculationContent=? where id=?",
					new Object[]{
							childrenVaccine.getName(),
							childrenVaccine.getrId(),
							childrenVaccine.getSex(),
							childrenVaccine.getBirthday(),
							childrenVaccine.getRelatives(),
							childrenVaccine.getPhone(),
							childrenVaccine.getAddress(),
							childrenVaccine.getInoculationDate(),
							childrenVaccine.getInoculationContent(),
							childrenVaccine.getId()
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
