package com.xhhy.dao;

import java.util.Map;
import com.xhhy.domain.UserBean;

public interface LoginDao {
	//查询用户名和密码
		public UserBean queryUser(Map map);
	//通过名字查询个人信息
		public UserBean queryByuserName(String userUserName);
}
