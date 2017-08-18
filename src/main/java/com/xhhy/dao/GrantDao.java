package com.xhhy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xhhy.domain.GrantBean;
import com.xhhy.domain.UserBean;

public interface GrantDao {

	public void add(@Param("pmPositionId") int id,@Param("pmMenuId") String id2);
	
	public List<GrantBean> queryAll();
	
	public GrantBean queryById(int id);
	
	public void delete(@Param("pmPositionId") int id);
}
