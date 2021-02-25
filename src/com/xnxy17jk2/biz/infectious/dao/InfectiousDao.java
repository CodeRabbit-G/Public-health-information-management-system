package com.xnxy17jk2.biz.infectious.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.Infectious;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.infected.dao
 * @类名: Infected
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月7日 下午9:47:18
 */
public class InfectiousDao extends BaseDao<Infectious> {

	// 插入
	public Boolean insert(Infectious infectious) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
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
			// 提交事务
			conn.commit();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			// 回滚事务
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

	// 修改
	public Boolean update(Infectious infectious) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
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
			// 提交事务
			conn.commit();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			// 回滚事务
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

