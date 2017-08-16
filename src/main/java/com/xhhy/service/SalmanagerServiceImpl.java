package com.xhhy.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xhhy.dao.SalmanagerDao;
import com.xhhy.domain.SalmanagerBean;
import com.xhhy.service.SalmanagerService;
@Service("salmanagerServiceImpl")
@Transactional
public class SalmanagerServiceImpl implements SalmanagerService{
	@Autowired
	private SalmanagerDao salmanagerDao;
	
	public void insertUser(SalmanagerBean salManager) {
		salmanagerDao.insertUser(salManager);
	}
	public SalmanagerDao getSalmanagerDao() {
		return salmanagerDao;
	}
	public void setSalmanagerDao(SalmanagerDao salmanagerDao) {
		this.salmanagerDao = salmanagerDao;
	}
	public List<SalmanagerBean> queryAll() {
		return salmanagerDao.queryAll();
	}
//薪酬标准管理
	public Page queryUserByPageHelper(int nowPage, int pageSize, Map keys) {
		Page<SalmanagerBean> page = PageHelper.startPage(nowPage, pageSize, true);
		salmanagerDao.queryUserByMap(keys);
		return page;
	}
//薪酬标准审批
	public Page queryUserByPageHelperShenpi(int nowPage, int pageSize, Map keys) {
		Page<SalmanagerBean> page = PageHelper.startPage(nowPage, pageSize, true);
		salmanagerDao.queryUserByMapShenpi(keys);
		return page;
	}
//薪酬发放管理	
	public Page queryUserByPageHelperFafang(int nowPage, int pageSize, Map keys) {
		Page<SalmanagerBean> page = PageHelper.startPage(nowPage, pageSize, true);
		salmanagerDao.queryUserByMapShenpi(keys);
		return page;
	}
	
	public SalmanagerBean queryUserById(int id) {
		return salmanagerDao.queryUserById(id);
	}
	public SalmanagerBean queryNameById(int id) {
		return salmanagerDao.queryNameById(id);
	}
	public String deleteUser(int id) {
		return salmanagerDao.deleteUser(id);
	}
	public void updateUser(SalmanagerBean salManager) {
		salmanagerDao.updateUser(salManager);
	}

}
