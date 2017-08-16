package com.xhhy.dao;

import java.util.List;
import java.util.Map;

import com.xhhy.domain.PXBean;

public interface PXDao {
	//添加（培训计划）
	public void insertPX(PXBean px);
	//添加（培训复核）
	public void insertPX2(PXBean px);
    //提交审核修改（培训计划）
	public void updatePX(PXBean px);
	//list的修改（培训计划）
	public void updatePX2(PXBean px);
	
	
	//审核通过      的修改（培训复核）
	public void updatePX3(PXBean px);
	
	//驳回修改（培训复核）
	public void updatePX4(PXBean px);

	//培训反馈的修改（培训考核和反馈）
	public void updatePX5(PXBean px);
	
	public void deletePX(int id);

	public PXBean queryPXById(int id);

	public List<PXBean> queryAll();
	
	//==查询1（培训计划）
	public List<PXBean> queryPXByMap(Map keys);
    
	//==查询2（培训复核）
	public List<PXBean> queryPXByMap2(Map keys);
	
	//==培训考核和反馈
	public List<PXBean> queryPXByMap3(Map keys);
	
	public int queryCount(PXBean px);

}
