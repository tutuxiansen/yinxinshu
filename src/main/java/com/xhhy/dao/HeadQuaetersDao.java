package com.xhhy.dao;

import java.util.List;
import java.util.Map;

import com.xhhy.domain.HeadQuaetersBean;

public interface HeadQuaetersDao {
	
	
	public List<Map<String, String>> queryAll(Map map);
	
	public List<HeadQuaetersBean> queryAllByYear(Map map);
	
	public List<HeadQuaetersBean> queryAllByMonth(Map map);
	
	public List<HeadQuaetersBean> queryByIf(Map map);
}
