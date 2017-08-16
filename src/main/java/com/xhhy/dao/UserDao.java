package com.xhhy.dao;

import java.util.List;
import java.util.Map;

import com.xhhy.domain.UserBean;
import com.xhhy.util.PageUtil;

public interface UserDao {
	//添加
	public void insertUser(UserBean user);
	//修改
	public void updateUser(UserBean user);
	//删除
	public void deleteUser(int id);
	//查询单个
	public UserBean queryUserById(int id);
	//查询全部
	public List<UserBean> queryAll();
	//查询分页信息
	public List<UserBean> queryUserByPageUtil(PageUtil<UserBean> pageUtil);
	//计数
	public List<UserBean> queryCount();
	//模糊查询
	public List<UserBean> queryUserByMap(Map key);
	//添加（后加）
	public void insertUserRen(UserBean user);
	//修改（后加）
	public void updateUserRen(UserBean user);
}
