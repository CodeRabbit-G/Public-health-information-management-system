package com.xnxy17jk2.biz.user.service;

import java.util.List;

import com.xnxy17jk2.biz.user.dao.UserDao;
import com.xnxy17jk2.entity.User;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.user.service
 * @类名: UserService
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月9日 下午10:06:12
 */
public class UserService {
	UserDao dao = new UserDao();
	
	public User login(String name) {
		return dao.queryByName(name);
	}
	
	public Boolean save(User user) {
		return dao.insert(user);
	}
	
	public Boolean update(User user) {
		return dao.update(user);
	}
	
	public List<User> query() {
		return dao.findAll();
	}
	
	public List<User> query(int curPage,int pageSize) {
		return dao.findRange(curPage,pageSize);
	}
	
	public List<User> search(String factor,String content) {
		return dao.findCondition(factor,content);
	}
	
	public int getCount() {
		return dao.getCount();
	}
	
	public void delete(String id) {
		dao.delete(id);
	}
	
	public User findById(String id) {
		return dao.findById(id);
	}
	
}
