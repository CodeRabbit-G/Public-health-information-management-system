package com.xnxy17jk2.biz.special.maternal.service;

import java.util.List;

import com.xnxy17jk2.biz.special.maternal.dao.MaternalDao;
import com.xnxy17jk2.entity.Maternal;

/**
 * @项目名称: publicHealth
 * @包名: com.xnxy17jk2.biz.special.maternal.service
 * @类名: MaternalService
 * @描述: 类说明
 * @作者: Guo_SY
 * @创建时间: 2020年5月7日 下午8:51:51
 */
public class MaternalService {
	private MaternalDao dao = new MaternalDao();
	
	public List<Maternal> query() {
		return dao.findAll();
	}
	
	public List<Maternal> query(int curPage,int pageSize) {
		return dao.findRange(curPage,pageSize);
	}
	
	public List<Maternal> search(String factor,String content) {
		return dao.findCondition(factor,content);
	}
	
	public int getCount() {
		return dao.getCount();
	}
	
	public void delete(String id) {
		dao.delete(id);
	}
	
	public Maternal findById(String id) {
		return dao.findById(id);
	}
	
	public Boolean save(Maternal maternal) {
		return dao.insert(maternal);
	}
	
	public Boolean update(Maternal maternal) {
		return dao.update(maternal);
	}
}

