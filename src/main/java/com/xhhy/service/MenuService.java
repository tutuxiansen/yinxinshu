package com.xhhy.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.xhhy.domain.MenuBean;

public interface MenuService {

	public void add(MenuBean menu);
	
	public void update(MenuBean menu);
	
	public List<MenuBean> menuAlls();
	
	public void delete(int menu);
	
	public List<MenuBean> menuAll();
	
	public List<MenuBean> queryAll();
	
	public List<MenuBean> queryByTop();
	
	public MenuBean queryById(int id);
	
	public Page queryByPageHelper(int nowPage, int pageSize, Map keys);
}
