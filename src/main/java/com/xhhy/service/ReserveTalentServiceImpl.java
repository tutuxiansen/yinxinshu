package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xhhy.dao.ReserveTalentDao;
import com.xhhy.domain.ReserveTalentBean;
import com.xhhy.service.ReserveTalentService;


@Service
@Transactional
public class ReserveTalentServiceImpl implements ReserveTalentService{

	@Autowired
	private ReserveTalentDao dao;
	
	public List<ReserveTalentBean> queryAll() {
		return dao.queryAll();
	}

	public List<ReserveTalentBean> queryByName(ReserveTalentBean bean) {
		return dao.queryByName(bean);
	}

	public ReserveTalentDao getDao() {
		return dao;
	}

	public void setDao(ReserveTalentDao dao) {
		this.dao = dao;
	}

	
}
