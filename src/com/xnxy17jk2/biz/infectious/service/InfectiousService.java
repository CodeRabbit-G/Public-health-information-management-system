package com.xnxy17jk2.biz.infectious.service;

import java.util.List;

import com.xnxy17jk2.biz.infectious.dao.InfectiousDao;
import com.xnxy17jk2.entity.Infectious;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.infected.service
 * @����: Infected
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����9:48:09
 */
public class InfectiousService {
	private InfectiousDao dao = new InfectiousDao();
	
	public List<Infectious> query() {
		return dao.findAll();
	}
	
	public List<Infectious> query(int curPage,int pageSize) {
		return dao.findRange(curPage,pageSize);
	}
	
	public List<Infectious> search(String factor,String content) {
		return dao.findCondition(factor,content);
	}
	
	public int getCount() {
		return dao.getCount();
	}
	
	public void delete(String id) {
		dao.delete(id);
	}
	
	public Infectious findById(String id) {
		return dao.findById(id);
	}
	
	public Boolean save(Infectious infectious) {
		return dao.insert(infectious);
	}
	
	public Boolean update(Infectious infectious) {
		return dao.update(infectious);
	}
}
