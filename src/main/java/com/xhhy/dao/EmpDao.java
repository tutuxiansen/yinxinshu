package com.xhhy.dao;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.xhhy.domain.EmpBean;
import com.xhhy.util.PageUtil;

public interface EmpDao {
	
	public List<EmpBean> queryAll();	
	public List<EmpBean> queryByIf(EmpBean empBean);	
	
	public List<EmpBean> queryEmpByPageUtil(PageUtil<EmpBean> pageUtil);
	
    public List<EmpBean> queryEmpByPageHelper(int nowPage);
    
    public int queryCount(EmpBean user);
    
    public Page queryEmpByPageHelper(Map keys);
    
    public List<EmpBean> queryEmpByMap(Map key);
    
    public List<Map<String, Object>> queryEmpByEducation(Map key);
    
    public List<Map<String, Object>> queryEmpByEducationShowDept(Map key);
    
    public List<EmpBean> queryEmpByDept(EmpBean empBean);
}
