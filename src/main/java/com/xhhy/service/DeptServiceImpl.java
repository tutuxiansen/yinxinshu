package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xhhy.dao.DeptDao;
import com.xhhy.domain.DeptBean;
@Service
@Transactional
public class DeptServiceImpl implements DeptService{
	@Autowired
	private DeptDao deptDao;
	
	public void add(DeptBean dept) {
		deptDao.add(dept);
	}

	public void update(DeptBean dept) {
		deptDao.update(dept);
	}

	public void delete(int id) {
		deptDao.delete(id);
	}

	public List<DeptBean> queryAll() {
		return deptDao.queryAll();
	}

	public List<DeptBean> queryByTop() {
		return deptDao.queryByTop();
	}
	
	public DeptBean queryById(int id) {
		return deptDao.queryById(id);
	}
	
	public DeptDao getDeptDao() {
		return deptDao;
	}

	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}

	public List<DeptBean> queryAlls() {
		return deptDao.queryAlls();
	}
}
