package com.xhhy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xhhy.dao.MenuDao;
import com.xhhy.dao.PositionDao;
import com.xhhy.domain.GrantBean;
import com.xhhy.domain.MenuBean;
import com.xhhy.domain.PositionBean;
import com.xhhy.domain.UserBean;

@Service
@Transactional
public class PositionServiceImpl implements PositionService {
	@Autowired
	private PositionDao pd;
	@Autowired
	private MenuDao md;
	@Autowired
	private GrantService grant;

	public void add(PositionBean position) {
		pd.add(position);
	}

	public void update(PositionBean position) {
		pd.update(position);
	}

	public void delete(int id) {
		pd.delete(id);
	}

	public List<PositionBean> queryAll() {
		return pd.queryAll();
	}

	public PositionBean queryById(int id) {
		return pd.queryById(id);
	}

	public Page queryByPageHelper(int nowPage, int pageSize, Map keys) {
		Page<PositionBean> page = PageHelper.startPage(nowPage, pageSize, true);
		pd.queryByMap(keys);
		return page;
	}

	public PositionDao getPd() {
		return pd;
	}

	public void setPd(PositionDao pd) {
		this.pd = pd;
	}

	public List<PositionBean> queryByMenu() {
		return pd.queryByMenu();
	}

	//
	public List<MenuBean> queryMenus(int id) {
		// 第一步查询所有菜单
		List<MenuBean> menus1 = md.menuAll();
		// 第二步 根据角色id查询这个角色对应的所有的菜单
		List<MenuBean> menus2 = md.menusByPositionId(id);
		for (MenuBean m : menus1) {
			boolean flag = false;
			for (MenuBean mm : menus2) {
				if (m.getMenuId() == mm.getMenuId()) {
					flag = true;
					break;
				}
			}
			m.setFlag(flag);
		}
		return menus1;
	}

	public void grant(int id, String[] ids) {
		// 第一步根据角色Id删除中间数据
		grant.delete(id);
		grant.add(id, ids);
	}
}
