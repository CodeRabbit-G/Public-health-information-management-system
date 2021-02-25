package com.xnxy17jk2.biz.education.personal.service;

import java.util.List;

import com.xnxy17jk2.biz.education.personal.dao.PersonalDao;
import com.xnxy17jk2.entity.Personal;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.education.personal.service
 * @����: Personal
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����9:46:37
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
