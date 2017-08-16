package com.xhhy.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xhhy.dao.LoginDao;
import com.xhhy.domain.UserBean;
import com.xhhy.service.LoginService;
@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService {
	
	@Autowired 
	private LoginDao loginDao;
	
	public UserBean queryUser(Map map) {
		return loginDao.queryUser(map);
	}

	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	public UserBean queryByuserName(String userUserName) {
		return loginDao.queryByuserName(userUserName);
	}

	
}
