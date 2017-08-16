package com.xhhy.dao;

import java.util.List;
import java.util.Map;

import com.xhhy.domain.SalmanagerBean;

public interface SalmanagerDao {
	//插入查询
	public void insertUser(SalmanagerBean salManager);
	
	//查询所有
	public List<SalmanagerBean>queryAll();
	
	//分页查询+模糊查询
	public List<SalmanagerBean> queryUserByMap(Map key);
	
	//预先修改查询
	public SalmanagerBean queryUserById(int id);
	//修改查询
	public void updateUser(SalmanagerBean user);
	
	//研发工程师查询
	public SalmanagerBean queryNameById(int id);
	
	//删除数据查询
	public String deleteUser(int id);
	//薪酬标准审批
	public List<SalmanagerBean> queryUserByMapShenpi(Map key);
	//薪酬发放管理
	public List<SalmanagerBean> queryUserByMapFafang(Map key);
}
