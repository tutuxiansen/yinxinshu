package com.xhhy.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.xhhy.domain.UserBean;
import com.xhhy.util.PageUtil;

public interface UserService {
	public void insertUser(UserBean user);

	public void updateUser(UserBean user);

	public void deleteUser(int id);

	public UserBean queryUserById(int id);

	public List<UserBean> queryAll();

	public List<UserBean> queryCount();
	

	public List<UserBean> queryUserByPageHelper(int nowPage);

	public Page queryUserByPageHelper(int nowPage, int pageSize, Map keys);
   //修改
	public void updateUserRen(UserBean user);
	
}
