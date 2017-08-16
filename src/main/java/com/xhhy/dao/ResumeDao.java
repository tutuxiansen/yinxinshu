package com.xhhy.dao;

import java.util.List;

import com.xhhy.domain.ResumeBean;


public interface ResumeDao{
						//简历管理
	public void insertResume(ResumeBean resume);//简历添加
	public void updateResume(ResumeBean resume);//简历修改
	public void updateByType(ResumeBean resume);//简历状态修改
	public void deleteResume(int id);//
	public void resumeByljsc(int id);//逻辑删除
	public ResumeBean queryResumeById(int id);//基于ID查询
	public List<ResumeBean> queryResumeAll();//列表查询
						//面试管理
	public void updateInterview(ResumeBean resume);//面试结果登记
	public void interviewByljsc(int id);//逻辑删除
	public ResumeBean queryInterviewById(int id);//基于ID查询
	public List<ResumeBean> queryInterviewAll();//列表查询
						//录用管理
	public List<ResumeBean> queryInterviewAll2();//列表查询
	public void updateInterview2(ResumeBean resume);//面试结果
	
}
