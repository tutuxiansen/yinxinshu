package com.xhhy.service;

import java.util.List;
import java.util.Map;

import com.xhhy.domain.UserBean;

public interface LoginService {
	//查询用户名和密码
	public UserBean queryUser(Map map);
	//通过账号获得个人信息
	public UserBean queryByuserName(String userUserName);
}
