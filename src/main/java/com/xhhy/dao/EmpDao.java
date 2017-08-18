package com.xhhy.dao;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.xhhy.domain.PemaBean;
import com.xhhy.util.PageUtil;

public interface EmpDao {
	
	public List<PemaBean> queryAll();	
	public List<PemaBean> queryByIf(PemaBean empBean);	
	
	public List<PemaBean> queryEmpByPageUtil(PageUtil<PemaBean> pageUtil);
	
    public List<PemaBean> queryEmpByPageHelper(int nowPage);
    
    public int queryCount(PemaBean user);
    
    public Page queryEmpByPageHelper(Map keys);
    
    public List<PemaBean> queryEmpByMap(Map key);
    
    public List<Map<String, Object>> queryEmpByEducation(Map key);
    
    public List<Map<String, Object>> queryEmpByEducationShowDept(Map key);
    
    public List<PemaBean> queryEmpByDept(PemaBean empBean);
}
