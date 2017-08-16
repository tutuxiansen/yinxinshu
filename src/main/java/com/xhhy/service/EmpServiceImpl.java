package com.xhhy.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xhhy.dao.EmpDao;
import com.xhhy.domain.EmpBean;
import com.xhhy.service.EmpService;
import com.xhhy.util.PageUtil;

@Service
@Transactional
public class EmpServiceImpl  implements EmpService{

	@Autowired
	private EmpDao empDao;
	
	public List<EmpBean> queryAll() {
		return empDao.queryAll();
	}

	public List<EmpBean> queryByIf(EmpBean empBean) {
		return empDao.queryByIf(empBean);
	}
	public EmpDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	public List<EmpBean> queryEmpByPageUtil(PageUtil<EmpBean> pageUtil) {
		
		EmpBean emp = pageUtil.getT();
		int totalCount = empDao.queryCount(emp);
		int totalPage = totalCount % pageUtil.getPageSize() == 0 ? totalCount / pageUtil.getPageSize() : totalCount / pageUtil.getPageSize() + 1;
		pageUtil.setTotalCount(totalCount);
		pageUtil.setTotalPage(totalPage);
		
		List<EmpBean> emps = empDao.queryEmpByPageUtil(pageUtil);
		
		pageUtil.setObjs(emps);
		
		return emps;
	}

	public List<EmpBean> queryEmpByPageHelper(int nowPage) {
		Page<EmpBean> page = PageHelper.startPage(nowPage, 5, true);
		empDao.queryAll();
		List<EmpBean> users = page.getResult();
		return users;
	}

	public Page queryEmpByPageHelper(int nowPage, int pageSize, Map keys) {
		
		Page<EmpBean> page = PageHelper.startPage(nowPage, pageSize, true);
		empDao.queryEmpByMap(keys);
		return page;
	}

	public List<EmpBean> queryEmpByMap(Map key) {
		
		List<EmpBean> emps = empDao.queryEmpByMap(key);
		
		return emps;
	}

	public List queryEmpByEducation(Map key) {
		
		return empDao.queryEmpByEducation(key);
	}

	public List<Map<String, Object>> queryEmpByEducationShowDept(Map key) {
		
		return empDao.queryEmpByEducationShowDept(key);
	}

	public List<EmpBean> queryEmpByDept(EmpBean empBean) {
		return empDao.queryEmpByDept(empBean);
	}

	



}
