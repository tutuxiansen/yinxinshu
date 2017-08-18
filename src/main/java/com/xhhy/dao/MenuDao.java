package com.xhhy.dao;

import java.util.List;
import java.util.Map;

import com.xhhy.domain.MenuBean;


public interface MenuDao {
	
	public void add(MenuBean menu);
	
	public void update(MenuBean menu);
	
	public void delete(int id);
	
	public List<MenuBean> queryAll();
	
	public List<MenuBean> menuAll();
	
	public List<MenuBean> menuAlls();
	
	public List<MenuBean> queryByTop();
	
	public MenuBean queryById(int id);
	
	public List<MenuBean> queryByMap(Map key);
	
	public List<MenuBean> menusByPositionId(int id);
}
