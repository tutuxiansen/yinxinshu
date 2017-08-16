package com.xhhy.dao;

import java.util.List;

import com.xhhy.domain.ReserveTalentBean;

public interface ReserveTalentDao {
	
	public List<ReserveTalentBean> queryAll();
	
	public List<ReserveTalentBean> queryByName(ReserveTalentBean bean);
	
}
