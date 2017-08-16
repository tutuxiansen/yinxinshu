package com.xhhy.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xhhy.dao.PositionDao;
import com.xhhy.domain.PositionBean;
import com.xhhy.domain.UserBean;
@Service
@Transactional
public class PositionServiceImpl implements PositionService {
	@Autowired
	private PositionDao pd;
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
	
}
