package com.xhhy.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xhhy.dao.MenuDao;
import com.xhhy.dao.PositionDao;
import com.xhhy.domain.MenuBean;
import com.xhhy.domain.PositionBean;
import com.xhhy.domain.UserBean;
@Service
@Transactional
public class MenuServiceImpl implements MenuService {
	@Autowired
	private MenuDao md;
	public void add(MenuBean menu) {
		md.add(menu);
	}

	public void update(MenuBean menu) {
		md.update(menu);
	}

	public void delete(int id) {
		md.delete(id);
	}

	public List<MenuBean> queryAll() {
		return md.queryAll();
	}

	public MenuBean queryById(int id) {
		return md.queryById(id);
	}
	public Page queryByPageHelper(int nowPage, int pageSize, Map keys) {
		Page<MenuBean> page = PageHelper.startPage(nowPage, pageSize, true);
		md.queryByMap(keys);
		return page;
	}

	public MenuDao getMd() {
		return md;
	}

	public void setMd(MenuDao md) {
		this.md = md;
	}

	public List<MenuBean> queryByTop() {
		return md.queryByTop();
	}

	
	
}
