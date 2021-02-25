package com.xnxy17jk2.biz.commonly.resident.dao;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.Resident;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.commonly.resident.dao
 * @类名: ResidentDao
 * @说明: ResidentDao
 * @作者: Guo_SY
 * @创建时间: 2020年4月29日 下午8:55:10
 */
public class ResidentDao extends BaseDao<Resident> {

	// 插入
	public Boolean insert(Resident resident) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
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
	public Boolean update(Resident resident) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
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
