/*package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xhhy.dao.PemaDao;
import com.xhhy.domain.PemaBean;
@Service("pemaService")
@Transactional
public class PemaServiceImp implements PemaService{
	@Autowired
	private PemaDao pemaDao;
	
	public PemaDao getPemaDao() {
		return pemaDao;
	}

	public void setPemaDao(PemaDao pemaDao) {
		this.pemaDao = pemaDao;
	}
	//添加
	public void insertPema(PemaBean pema) {
		pemaDao.insertPema(pema);
		
	}
	//修改
	public void updatePema(PemaBean pema) {
		pemaDao.updatePema(pema);
		
	}
	//删除
	public void deletePema(int id) {
		pemaDao.deletePema(id);
	}
	//逻辑删除
	public void pemaByljsc(int id) {
		pemaDao.pemaByljsc(id);
	}
	//基于ID查询
	public PemaBean querypemaById(int id) {
		return pemaDao.querypemaById(id);
	}
	//列表查询
	public List<PemaBean> queryPemaAll() {
		return pemaDao.queryPemaAll();
	}

}*/
