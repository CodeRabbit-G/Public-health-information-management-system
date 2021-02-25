package com.xnxy17jk2.biz.commonly.hypertension.service;

import java.util.List;

import com.xnxy17jk2.biz.commonly.hypertension.dao.HypertensionDao;
import com.xnxy17jk2.entity.Hypertension;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.commonly.hypertension.service
 * @类名: HypertensionService
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月7日 下午6:57:10
 */
public class HypertensionService {
	private HypertensionDao dao = new HypertensionDao();
	
	public List<Hypertension> query() {
		return dao.findAll();
	}
	
	public List<Hypertension> query(int curPage,int pageSize) {
		return dao.findRange(curPage,pageSize);
	}
	
	public List<Hypertension> search(String factor,String content) {
		return dao.findCondition(factor,content);
	}
	
	public int getCount() {
		return dao.getCount();
	}
	
	public void delete(String id) {
		dao.delete(id);
	}
	
	public Hypertension findById(String id) {
		return dao.findById(id);
	}
	
	public Boolean save(Hypertension hypertension) {
		return dao.insert(hypertension);
	}
	
	public Boolean update(Hypertension hypertension) {
		return dao.update(hypertension);
	}
}