package com.xnxy17jk2.biz.commonly.diabetes.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.Diabetes;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.commonly.diabetes.dao
 * @����: DiabetesDao
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����6:59:27
 */
public class DiabetesDao extends BaseDao<Diabetes> {

	// ����
	public Boolean insert(Diabetes diabetes) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn, "insert into TAB_Diabetes values(?,?,?,?,?,?,?,?,?)",
					new Object[] { 
							diabetes.getId(),
							diabetes.getName(),
							diabetes.getrId(),
							diabetes.getSex(),
							diabetes.getBirthday(),
							diabetes.getPhone(),
							diabetes.getAddress(),
							diabetes.getType(),
							diabetes.getTestDate()
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
	public Boolean update(Diabetes diabetes) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// ��������
			conn.setAutoCommit(false);
			qr.update(conn,"update TAB_Diabetes set name=?,rId=?,sex=?,birthday=?,phone=?,address=?,type=?,testdate=? where id=?",
					new Object[]{
							diabetes.getName(),
							diabetes.getrId(),
							diabetes.getSex(),
							diabetes.getBirthday(),
							diabetes.getPhone(),
							diabetes.getAddress(),
							diabetes.getType(),
							diabetes.getTestDate(),
							diabetes.getId()
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
