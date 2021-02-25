package com.xnxy17jk2.biz.education.personal.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.Personal;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.education.personal.dao
 * @类名: Personal
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月7日 下午9:46:29
 */
public class PersonalDao extends BaseDao<Personal> {

	// 插入
	public Boolean insert(Personal personal) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
			conn.setAutoCommit(false);
			qr.update(conn, "insert into TAB_Personal values(?,?,?,?,?,?,?,?,?,?)",
					new Object[] { 
							personal.getId(),
							personal.getName(),
							personal.getrId(),
							personal.getBirthday(),
							personal.getPhone(),
							personal.getEduDoctor(),
							personal.getEduDate(),
							personal.getEduMode(),
							personal.getEduTheme(),
							personal.getEduContent()
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
	public Boolean update(Personal personal) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
			conn.setAutoCommit(false);
			qr.update(conn,"update TAB_Personal set name=?,rId=?,birthday=?,phone=?,eduDoctor=?,eduDate=?,eduMode=?,eduTheme=?,eduContent=? where id=?",
					new Object[]{
							personal.getName(),
							personal.getrId(),
							personal.getBirthday(),
							personal.getPhone(),
							personal.getEduDoctor(),
							personal.getEduDate(),
							personal.getEduMode(),
							personal.getEduTheme(),
							personal.getEduContent(),
							personal.getId()
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
