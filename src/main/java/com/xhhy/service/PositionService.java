package com.xhhy.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.xhhy.domain.GrantBean;
import com.xhhy.domain.MenuBean;
import com.xhhy.domain.PositionBean;

public interface PositionService {

	public void add(PositionBean position);
	
	public void update(PositionBean position);
	
	public void delete(int id);
	
	public List<PositionBean> queryAll();
	
	public PositionBean queryById(int id);
	
	public List<PositionBean> queryByMenu();
	
	public Page queryByPageHelper(int nowPage, int pageSize, Map keys);
	
	public List<MenuBean> queryMenus(int id);
	
	public void grant(int id,String[] ids);

}
