package com.xhhy.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xhhy.dao.UserDao;
import com.xhhy.domain.UserBean;
import com.xhhy.util.PageUtil;
@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	public void insertUser(UserBean user) {
		userDao.insertUser(user);
	}

	public void updateUser(UserBean user) {
		userDao.updateUser(user);
	}

	public void deleteUser(int id) {
		userDao.deleteUser(id);
	}

	public UserBean queryUserById(int id) {
		return userDao.queryUserById(id);
	}

	public List<UserBean> queryAll() {
		return userDao.queryAll();
	}


	public List<UserBean> queryUserByPageHelper(int nowPage) {
		// 设置分页参数
		// startPage 方法， 第一个参数为 目标页,第二个参数 分页单位
		//PageHelper.startPage(nowPage, 5);
		// 当前方法 有三个参数 (1) 目标页 (2) 分页单位 (3) 是否统计条数，为true就统计条数，为false就不统计条数
		// page相当与自己定义的pageUtil
		Page<UserBean> page = PageHelper.startPage(nowPage, 5, true);// 不仅仅做了 topN查询，并且优先统计了条数
		userDao.queryAll();// 查询数据库, 查询之后，PageHelper 会自动封装数据到 返回的 Page对象中
		List<UserBean> users = page.getResult();// 获取查询的 结果集合
						return users;
	}

	public Page queryUserByPageHelper(int nowPage, int pageSize, Map keys) {
		// 设置分页信息
		//Page<UserBean> page = PageHelper.startPage(nowPage, pageSize, true);
		Page<UserBean> page = PageHelper.startPage(nowPage, pageSize, true);
		// 调用dao
		userDao.queryUserByMap(keys);// 查询完毕之后，page对象 就自动拥有了分页信息 和 目标的集合列表
		return page;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<UserBean> queryCount() {
		return userDao.queryCount();
	}
}
