package com.xhhy.service;

import java.util.List;

import com.xhhy.domain.ReserveTalentBean;

public interface ReserveTalentService {
	
	
	public List<ReserveTalentBean> queryAll();
	
	public List<ReserveTalentBean> queryByName(ReserveTalentBean bean);
}
