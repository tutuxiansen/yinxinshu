package com.xhhy.dao;

import java.util.List;
import java.util.Map;

import com.xhhy.domain.PositionBean;


public interface PositionDao {
	
	public void add(PositionBean position);
	
	public void update(PositionBean position);
	
	public void delete(int id);
	
	public List<PositionBean> queryAll();
	
	public PositionBean queryById(int id);
	
	public List<PositionBean> queryByMap(Map key);
}
