package com.xnxy17jk2.biz.special.childrenHealthy.service;

import java.util.List;

import com.xnxy17jk2.biz.special.childrenHealthy.dao.ChildrenHealthyDao;
import com.xnxy17jk2.entity.ChildrenHealthy;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.special.childrenHealthy.service
 * @类名: ChildrenHealthyService
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月7日 下午8:50:03
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

