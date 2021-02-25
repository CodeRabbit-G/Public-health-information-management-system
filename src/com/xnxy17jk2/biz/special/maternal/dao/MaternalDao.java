package com.xnxy17jk2.biz.special.maternal.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.Maternal;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.special.maternal.dao
 * @类名: MaternalDao
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月7日 下午8:51:46
 */
public class MaternalDao extends BaseDao<Maternal> {

	// 插入
	public Boolean insert(Maternal maternal) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
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
	public Boolean update(Maternal maternal) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
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
