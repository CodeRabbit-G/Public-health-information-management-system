package com.xnxy17jk2.biz.education.group.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xnxy17jk2.entity.Group;
import com.xnxy17jk2.util.BaseDao;
import com.xnxy17jk2.util.JdbcUtil;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.education.group.dao
 * @类名: Group
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月7日 下午9:46:05
 */
public class GroupDao extends BaseDao<Group> {

	// 插入
	public Boolean insert(Group group) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
			conn.setAutoCommit(false);
			qr.update(conn, "insert into TAB_Group values(?,?,?,?,?,?,?,?)",
					new Object[] { 
							group.getId(),
							group.getEduDate(),
							group.getEduTheme(),
							group.getEduType(),
							group.getEduPlace(),
							group.getEduObject(),
							group.getEduNumber(),
							group.getEduContent()
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
	public Boolean update(Group group) {
		Connection conn = null;
		try {
			conn = JdbcUtil.getDataSource().getConnection();
			QueryRunner qr = new QueryRunner();
			// 开启事务
			conn.setAutoCommit(false);
			qr.update(conn,"update TAB_Group set eduDate=?,eduTheme=?,eduType=?,eduPlace=?,eduObject=?,eduNumber=?,eduContent=? where id=?",
					new Object[]{
							group.getEduDate(),
							group.getEduTheme(),
							group.getEduType(),
							group.getEduPlace(),
							group.getEduObject(),
							group.getEduNumber(),
							group.getEduContent(),
							group.getId()
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

