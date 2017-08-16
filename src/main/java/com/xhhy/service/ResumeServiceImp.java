package com.xhhy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xhhy.dao.ResumeDao;
import com.xhhy.domain.ResumeBean;
@Service("resumeService")
@Transactional
public class ResumeServiceImp implements ResumeService{
	@Autowired
	private ResumeDao resumeDao;
	public ResumeDao getResumeDao() {
		return resumeDao;
	}
	
	public void setResumeDao(ResumeDao resumeDao) {
		this.resumeDao = resumeDao;
	}
	public void insertResume(ResumeBean resume) {
		resumeDao.insertResume(resume);;
	}

	public void updateResume(ResumeBean resume) {
		resumeDao.updateResume(resume);
	}

	public void deleteResume(int id) {
		resumeDao.deleteResume(id);
	}

	public void resumeByljsc(int id) {
		resumeDao.resumeByljsc(id);
	}

	public ResumeBean queryResumeById(int id) {
		return resumeDao.queryResumeById(id);
	}

	public List<ResumeBean> queryResumeAll() {
		return resumeDao.queryResumeAll();
	}


	public void updateByType(ResumeBean resume) {
		resumeDao.updateByType(resume);
	}
					//面试管理
	//面试结果登记
	public void updateInterview(ResumeBean resume) {
		resumeDao.updateInterview(resume);
	}
	//逻辑删除
	public void interviewByljsc(int id) {
		// TODO Auto-generated method stub
		
	}
	//查询列表
	public List<ResumeBean> queryInterviewAll() {
		return resumeDao.queryInterviewAll();
	}
	//基于ID查询
	public ResumeBean queryInterviewById(int id) {
		return resumeDao.queryInterviewById(id);
	}

				//录用管理
	public List<ResumeBean> queryInterviewAll2() {
		return resumeDao.queryInterviewAll2();
	}

	public void updateInterview2(ResumeBean resume) {
			resumeDao.updateInterview2(resume);
	}

	
	
}
