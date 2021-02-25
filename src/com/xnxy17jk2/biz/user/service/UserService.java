package com.xnxy17jk2.biz.user.service;

import java.util.List;

import com.xnxy17jk2.biz.user.dao.UserDao;
import com.xnxy17jk2.entity.User;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.user.service
 * @����: UserService
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��9�� ����10:06:12
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
