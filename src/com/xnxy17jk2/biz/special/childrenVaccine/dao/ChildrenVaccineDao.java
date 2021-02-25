package com.xnxy17jk2.biz.special.childrenVaccine.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.ChildrenVaccine;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.special.childrenVaccine.dao
 * @类名: ChildrenVaccineDao
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月7日 下午8:51:06
 */
public class ChildrenVaccineDao extends BaseDao<ChildrenVaccine> {

	// 插入
	public Boolean insert(ChildrenVaccine childrenVaccine) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
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
	public Boolean update(ChildrenVaccine childrenVaccine) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
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
