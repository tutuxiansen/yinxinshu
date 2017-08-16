package com.xhhy.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.xhhy.domain.EmpBean;
import com.xhhy.util.PageUtil;

public interface EmpService {

	public List<EmpBean> queryAll();	//��ѯȫ��
	
	public List<EmpBean> queryByIf(EmpBean empBean);	//����������ѯ
	//TODO:��ҳ��ѯ
	public List<EmpBean> queryEmpByPageUtil(PageUtil<EmpBean> pageUtil);
	
    public List<EmpBean> queryEmpByPageHelper(int nowPage);
    
    public Page queryEmpByPageHelper(int nowPage, int pageSize, Map keys);
    
    public List<EmpBean> queryEmpByMap(Map key);
   
    public List<Map<String, Object>> queryEmpByEducation(Map key);
    
    public List<Map<String, Object>> queryEmpByEducationShowDept(Map key);
    
    public List<EmpBean> queryEmpByDept(EmpBean empBean);
}
