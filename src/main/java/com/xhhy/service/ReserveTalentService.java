package com.xhhy.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.xhhy.domain.PemaBean;
import com.xhhy.util.PageUtil;

public interface ReserveTalentService {
	
	public List<PemaBean> queryEmpByPageUtil(PageUtil<PemaBean> pageUtil);

	public Page<PemaBean> queryEmpByPageHelper(int nowPage, int i, Map map);
}
