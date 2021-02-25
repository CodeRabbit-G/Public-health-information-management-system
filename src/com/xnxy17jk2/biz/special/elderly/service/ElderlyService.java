package com.xnxy17jk2.biz.special.elderly.service;

import java.util.List;

import com.xnxy17jk2.biz.special.elderly.dao.ElderlyDao;
import com.xnxy17jk2.entity.Elderly;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.special.elderly.service
 * @����: ElderlyService
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����8:51:33
 */
public class ElderlyService {
	private ElderlyDao dao = new ElderlyDao();
	
	public List<Elderly> query() {
		return dao.findAll();
	}
	
	public List<Elderly> query(int curPage,int pageSize) {
		return dao.findRange(curPage,pageSize);
	}
	
	public List<Elderly> search(String factor,String content) {
		return dao.findCondition(factor,content);
	}
	
	public int getCount() {
		return dao.getCount();
	}
	
	public void delete(String id) {
		dao.delete(id);
	}
	
	public Elderly findById(String id) {
		return dao.findById(id);
	}
	
	public Boolean save(Elderly elderly) {
		return dao.insert(elderly);
	}
	
	public Boolean update(Elderly elderly) {
		return dao.update(elderly);
	}
}

