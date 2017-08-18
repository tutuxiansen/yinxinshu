package com.xhhy.service;

import java.util.List;

import com.xhhy.domain.DeptBean;

public interface DeptService {

public void add(DeptBean dept);
	
	public void update(DeptBean dept);
	
	public void delete(int id);
	
	public List<DeptBean> queryByTop();
	
	public List<DeptBean> queryAll();
	
	public DeptBean queryById(int id);
	
	public List<DeptBean> queryAlls();
}
