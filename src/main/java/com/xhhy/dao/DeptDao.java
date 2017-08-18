package com.xhhy.dao;

import java.util.List;

import com.xhhy.domain.DeptBean;

public interface DeptDao {

	public void add(DeptBean dept);
	
	public void update(DeptBean dept);
	
	public void delete(int id);
	
	public List<DeptBean> queryAll();
	
	public List<DeptBean> queryByTop();
	
	public DeptBean queryById(int id);
	
	public List<DeptBean> queryAlls();
}
