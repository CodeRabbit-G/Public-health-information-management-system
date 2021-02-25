package com.xnxy17jk2.biz.commonly.diabetes.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.Diabetes;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.commonly.diabetes.dao
 * @类名: DiabetesDao
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月7日 下午6:59:27
 */
public class DiabetesDao extends BaseDao<Diabetes> {

	// 插入
	public Boolean insert(Diabetes diabetes) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
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
	public Boolean update(Diabetes diabetes) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
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
