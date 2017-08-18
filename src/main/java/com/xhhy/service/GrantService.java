package com.xhhy.service;

import java.util.List;

import com.xhhy.domain.GrantBean;

public interface GrantService {

	public void add(int id,String ids[]);
	
	public List<GrantBean> queryAll();
	
	public GrantBean queryById(int id);
	
	public void delete(int id);
}
