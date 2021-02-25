package com.xnxy17jk2.biz.special.childrenHealthy.service;

import java.util.List;

import com.xnxy17jk2.biz.special.childrenHealthy.dao.ChildrenHealthyDao;
import com.xnxy17jk2.entity.ChildrenHealthy;

/**
 * @��Ŀ����: publicHealth
 * @����: com.xnxy17jk2.biz.special.childrenHealthy.service
 * @����: ChildrenHealthyService
 * @����: ��˵��
 * @����: Guo_SY
 * @����ʱ��: 2020��5��7�� ����8:50:03
 */
public class ChildrenHealthyService {
	private ChildrenHealthyDao dao = new ChildrenHealthyDao();
	
	public List<ChildrenHealthy> query() {
		return dao.findAll();
	}
	
	public List<ChildrenHealthy> query(int curPage,int pageSize) {
		return dao.findRange(curPage,pageSize);
	}
	
	public List<ChildrenHealthy> search(String factor,String content) {
		return dao.findCondition(factor,content);
	}
	
	public int getCount() {
		return dao.getCount();
	}
	
	public void delete(String id) {
		dao.delete(id);
	}
	
	public ChildrenHealthy findById(String id) {
		return dao.findById(id);
	}
	
	public Boolean save(ChildrenHealthy childrenHealthy) {
		return dao.insert(childrenHealthy);
	}
	
	public Boolean update(ChildrenHealthy childrenHealthy) {
		return dao.update(childrenHealthy);
	}
}

