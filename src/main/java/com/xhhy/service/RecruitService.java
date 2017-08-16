package com.xhhy.service;

import java.util.List;

import com.xhhy.domain.RecruitBean;

public interface RecruitService {
	
	public void insertRecruit(RecruitBean recruit);
	public void updateRecruit(RecruitBean recruit);
	public void deleteRecruit(int id);
	public void deleteByljsc(int id);
	public RecruitBean queryRecruitById(int id);
	public List<RecruitBean> queryRecruitAll();

}
