package com.xhhy.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xhhy.dao.HeadQuaetersDao;
import com.xhhy.domain.HeadQuaetersBean;
import com.xhhy.service.HeadeQuaetersService;

@Service
@Transactional
public class HeadeQuaetersServiceImpl implements HeadeQuaetersService{
	
	@Autowired
	private HeadQuaetersDao dao;
	
	public List<HeadQuaetersBean> queryAllByYear(Map map) {
		
		return dao.queryAllByYear(map);
	}

	public List<HeadQuaetersBean> queryAllByMonth(Map map) {
		
		return dao.queryAllByMonth(map);
	}

	public List<HeadQuaetersBean> queryByIf(Map map) {
		
		return dao.queryByIf(map);
	}

	public HeadQuaetersDao getDao() {
		return dao;
	}

	public void setDao(HeadQuaetersDao dao) {
		this.dao = dao;
	}

	public List<Map<String,String>> queryAll(Map map) {
		
		return dao.queryAll(map);
	}
	
	
	
}
