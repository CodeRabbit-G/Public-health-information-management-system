package com.xnxy17jk2.biz.commonly.hypertension.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.Hypertension;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.commonly.hypertension.dao
 * @类名: HypertensionDao
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月7日 下午6:54:12
 */
public class HypertensionDao extends BaseDao<Hypertension> {

	// 插入
	public Boolean insert(Hypertension hypertension) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
			conn.setAutoCommit(false);
			qr.update(conn, "insert into tab_hypertension values(?,?,?,?,?,?,?,?,?,?)",
					new Object[] { 
							hypertension.getId(),
							hypertension.getName(),
							hypertension.getrId(),
							hypertension.getSex(),
							hypertension.getBirthday(),
							hypertension.getPhone(),
							hypertension.getAddress(),
							hypertension.getBloodPressure(),
							hypertension.getGrade(),
							hypertension.getTestDate()
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
	public Boolean update(Hypertension hypertension) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
			conn.setAutoCommit(false);
			qr.update(conn,
					"update tab_hypertension set name=?,rId=?,sex=?,birthday=?,phone=?,address=?,bloodpressure=?,grade=?,testdate=? where id=?",
					new Object[] { 
							hypertension.getName(),
							hypertension.getrId(),
							hypertension.getSex(),
							hypertension.getBirthday(),
							hypertension.getPhone(),
							hypertension.getAddress(),
							hypertension.getBloodPressure(),
							hypertension.getGrade(),
							hypertension.getTestDate(),
							hypertension.getId()
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
