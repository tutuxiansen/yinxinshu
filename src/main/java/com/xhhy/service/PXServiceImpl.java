package com.xhhy.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xhhy.dao.PXDao;
import com.xhhy.domain.PXBean;

@Service("pXService")
@Transactional
public class PXServiceImpl implements PXService {
	@Autowired
	private PXDao pXDao;

	public PXDao getpXDao() {
		return pXDao;
	}

	public void setpXDao(PXDao pXDao) {
		this.pXDao = pXDao;
	}

	public void insertPX(PXBean px) {
		pXDao.insertPX(px);
	}

	public void updatePX(PXBean px) {
		pXDao.updatePX(px);
	}

	public void updatePX2(PXBean px) {
		pXDao.updatePX2(px);
	}

	public void deletePX(int id) {
		pXDao.deletePX(id);
	}

	public PXBean queryPXById(int id) {
		return pXDao.queryPXById(id);
	}

	// 培训计划
	public Page queryByPageHelper(int nowPage, int pageSize, Map keys) {

		// PageHelper.orderBy("user_age");
		Page<PXBean> page = PageHelper.startPage(nowPage, pageSize, true);

		pXDao.queryPXByMap(keys);
		return page;
	}

	public List<PXBean> queryAll() {
		return pXDao.queryAll();
	}

	// 培训复核
	public Page queryByPageHelper2(int nowPage, int pageSize, Map keys) {
		Page<PXBean> page = PageHelper.startPage(nowPage, pageSize, true);
		pXDao.queryPXByMap2(keys);
		return page;

	}

	public void insertPX2(PXBean px) {

		pXDao.insertPX2(px);
	}

	public void updatePX3(PXBean px) {
       pXDao.updatePX3(px);
		
	}

	public void updatePX4(PXBean px) {
		pXDao.updatePX4(px);
		
	}

	public Page queryByPageHelper3(int nowPage, int pageSize, Map keys) {
		Page<PXBean> page = PageHelper.startPage(nowPage, pageSize, true);
		pXDao.queryPXByMap3(keys);
		return page;
		
		
	
	}

	public void updatePX5(PXBean px) {
		pXDao.updatePX5(px);
		
	}

}
