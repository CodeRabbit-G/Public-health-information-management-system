package com.xnxy17jk2.biz.special.elderly.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.Elderly;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.special.elderly.dao
 * @类名: ElderlyDaoDao
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月7日 下午8:51:25
 */
public class ElderlyDao extends BaseDao<Elderly> {

	// 插入
	public Boolean insert(Elderly elderly) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
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
	public Boolean update(Elderly elderly) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
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
