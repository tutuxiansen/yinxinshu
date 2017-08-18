package com.xhhy.dao;

import java.util.List;
import java.util.Map;

import com.xhhy.domain.PemaBean;
import com.xhhy.util.PageUtil;

public interface ReserveTalentDao {
	
	
	public int queryCount(PemaBean emp);

	public List<PemaBean> queryEmpByPageUtil(PageUtil<PemaBean> pageUtil);
	
	public List<PemaBean> queryEmpByMap(Map key);
	
}
