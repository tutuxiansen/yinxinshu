package com.xhhy.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.xhhy.domain.PXBean;

public interface PXService {
	//添加（培训计划）
	public void insertPX(PXBean px);
	
	//添加（培训复核）
	public void insertPX2(PXBean px);
	
    //提交审核修改，（培训计划）
	public void updatePX(PXBean px);
	
	public void updatePX2(PXBean px);
	
    //培训复核（审核通过）  修改
	public void updatePX3(PXBean px);
	
	//培训复核（驳回）  修改
   public void updatePX4(PXBean px);
   
   //培训的审核和反馈
   public void updatePX5(PXBean px);
   
	public void deletePX(int id);

	public PXBean queryPXById(int id);
   
	public List<PXBean> queryAll();
   //培训计划
	public Page queryByPageHelper(int nowPage,int pageSize,Map keys);
	//审核复核
	public Page queryByPageHelper2(int nowPage,int pageSize,Map keys);
	//培训的审核和结果
    public Page queryByPageHelper3(int nowPage,int pageSize,Map keys);
}
