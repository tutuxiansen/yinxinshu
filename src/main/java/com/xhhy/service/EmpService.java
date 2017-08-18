package com.xhhy.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.xhhy.domain.PemaBean;
import com.xhhy.util.PageUtil;

public interface EmpService {

	public List<PemaBean> queryAll();	//
	
	public List<PemaBean> queryByIf(PemaBean empBean);	//����������ѯ
	//TODO:��ҳ��ѯ
	public List<PemaBean> queryEmpByPageUtil(PageUtil<PemaBean> pageUtil);
	
    public List<PemaBean> queryEmpByPageHelper(int nowPage);
    
    public Page queryEmpByPageHelper(int nowPage, int pageSize, Map keys);
    
    public List<PemaBean> queryEmpByMap(Map key);
   
    public List<Map<String, Object>> queryEmpByEducation(Map key);
    
    public List<Map<String, Object>> queryEmpByEducationShowDept(Map key);
    
    public List<PemaBean> queryEmpByDept(PemaBean empBean);
}
