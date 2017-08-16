package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xhhy.dao.RecruitDao;
import com.xhhy.domain.RecruitBean;
@Service("recruitService")
@Transactional
public class RecruitServiceImp implements RecruitService{
	@Autowired
	private RecruitDao recruitDao;
	public void insertRecruit(RecruitBean recruit) {
		recruitDao.insertRecruit(recruit);
	}

	public void updateRecruit(RecruitBean recruit) {
		recruitDao.updateRecruit(recruit);
	}

	public void deleteRecruit(int id) {	
		recruitDao.deleteRecruit(id);
	}

	public void deleteByljsc(int id) {
		recruitDao.deleteByljsc(id);
		
	}
	public RecruitBean queryRecruitById(int id) {
		return  recruitDao.queryRecruitById(id);
	}

	public List<RecruitBean> queryRecruitAll() {
		return recruitDao.queryRecruitAll();
	}

	public RecruitDao getRecruitDao() {
		return recruitDao;
	}

	public void setRecruitDao(RecruitDao recruitDao) {
		this.recruitDao = recruitDao;
	}


	
	
}
