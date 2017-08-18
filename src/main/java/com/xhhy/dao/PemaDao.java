package com.xhhy.dao;

import java.util.List;
import java.util.Map;

import com.xhhy.domain.PemaBean;
import com.xhhy.domain.ResumeBean;

public interface PemaDao {
			
	public void insertPema(PemaBean pema);//添加
	public void updatePema(PemaBean pema);//修改
	public void pemaByHf(int id);//恢复
	public void deletePema(int id);//删除
	public void pemaByljsc(int id);//逻辑删除
	public PemaBean queryPemaById(int id);//查询基于ID
	public List<PemaBean> queryPemaAll();//查询所有
	public List<ResumeBean> queryInterviewByMap(Map keys);//分页
	public List<ResumeBean> queryInterviewByMap2(Map keys);//分页

}
