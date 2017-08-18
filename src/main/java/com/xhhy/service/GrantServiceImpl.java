package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xhhy.dao.GrantDao;
import com.xhhy.domain.GrantBean;
@Service
@Transactional
public class GrantServiceImpl implements GrantService{
	@Autowired
	private GrantDao grantDao;
	public void add(int id,String ids[]) {
		if(ids!=null){
			for(String i : ids){
				grantDao.add(id, i);
			}
		}
	}

	public List<GrantBean> queryAll() {
		return grantDao.queryAll();
	}

	public GrantBean queryById(int id) {
		return grantDao.queryById(id);
	}

	public void delete(int id) {
		grantDao.delete(id);
	}

	public GrantDao getGrantDao() {
		return grantDao;
	}

	public void setGrantDao(GrantDao grantDao) {
		this.grantDao = grantDao;
	}

}
