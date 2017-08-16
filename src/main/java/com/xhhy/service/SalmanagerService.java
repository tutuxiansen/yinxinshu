package com.xhhy.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.xhhy.domain.SalmanagerBean;

public interface SalmanagerService {
	//插入薪酬信息
	public void insertUser(SalmanagerBean salManager);
	//查询所有信息
	public List<SalmanagerBean>  queryAll();
	//分页查询+模糊查询-----薪酬标准管理
	public Page queryUserByPageHelper(int nowPage, int pageSize, Map keys);
	//修改查询
	public SalmanagerBean queryUserById(int id);
	public void updateUser(SalmanagerBean user);
	//研发工程师查询
	public SalmanagerBean queryNameById(int id);
	//删除查询
	public String deleteUser(int id);
	
	//分页查询+模糊查询 ---薪酬标准审批
	public Page queryUserByPageHelperShenpi(int nowPage, int pageSize, Map keys);
	
	//分页查询+模糊查询 ---薪酬发放管理
	public Page queryUserByPageHelperFafang(int nowPage, int pageSize, Map keys);
}
