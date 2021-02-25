package com.xnxy17jk2.biz.education.personal.service;

import java.util.List;

import com.xnxy17jk2.biz.education.personal.dao.PersonalDao;
import com.xnxy17jk2.entity.Personal;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.education.personal.service
 * @类名: Personal
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月7日 下午9:46:37
 */
public class PersonalService {
	private PersonalDao dao = new PersonalDao();
	
	public List<Personal> query() {
		return dao.findAll();
	}
	
	public List<Personal> query(int curPage,int pageSize) {
		return dao.findRange(curPage,pageSize);
	}
	
	public List<Personal> search(String factor,String content) {
		return dao.findCondition(factor,content);
	}
	
	public int getCount() {
		return dao.getCount();
	}
	
	public void delete(String id) {
		dao.delete(id);
	}
	
	public Personal findById(String id) {
		return dao.findById(id);
	}
	
	public Boolean save(Personal personal) {
		return dao.insert(personal);
	}
	
	public Boolean update(Personal personal) {
		return dao.update(personal);
	}
}
