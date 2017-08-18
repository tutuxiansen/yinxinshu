package com.xhhy.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xhhy.dao.ReserveTalentDao;
import com.xhhy.domain.PemaBean;
import com.xhhy.util.PageUtil;


@Service
@Transactional
public class ReserveTalentServiceImpl implements ReserveTalentService{

	@Autowired
	private ReserveTalentDao dao;
	

	public ReserveTalentDao getDao() {
		return dao;
	}

	public void setDao(ReserveTalentDao dao) {
		this.dao = dao;
	}

	public List<PemaBean> queryEmpByPageUtil(PageUtil<PemaBean> pageUtil) {
		
		PemaBean emp = pageUtil.getT();
		int totalCount = dao.queryCount(emp);
		int totalPage = totalCount % pageUtil.getPageSize() == 0 ? totalCount / pageUtil.getPageSize() : totalCount / pageUtil.getPageSize() + 1;
		pageUtil.setTotalCount(totalCount);
		pageUtil.setTotalPage(totalPage);
		
		List<PemaBean> emps = dao.queryEmpByPageUtil(pageUtil);
		
		pageUtil.setObjs(emps);
		return emps;
	}

	public Page<PemaBean> queryEmpByPageHelper(int nowPage, int pageSize, Map map) {
		Page<PemaBean> page = PageHelper.startPage(nowPage, pageSize, true);
		dao.queryEmpByMap(map);
		return page;
	}

	
}
