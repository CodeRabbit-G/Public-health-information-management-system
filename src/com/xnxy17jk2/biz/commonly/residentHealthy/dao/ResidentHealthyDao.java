package com.xnxy17jk2.biz.commonly.residentHealthy.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.ResidentHealthy;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.commonly.residentHealthy.dao
 * @类名: ResidentHealthyDao
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月7日 下午3:19:19
 */
public class ResidentHealthyDao extends BaseDao<ResidentHealthy> {

	// 插入
	public Boolean insert(ResidentHealthy residentHealthy) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
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
	public Boolean update(ResidentHealthy residentHealthy) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
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
}