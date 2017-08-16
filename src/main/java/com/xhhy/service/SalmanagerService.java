package com.xhhy.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.xhhy.domain.SalmanagerBean;

public interface SalmanagerService {
	//����н����Ϣ
	public void insertUser(SalmanagerBean salManager);
	//��ѯ������Ϣ
	public List<SalmanagerBean>  queryAll();
	//��ҳ��ѯ+ģ����ѯ-----н���׼����
	public Page queryUserByPageHelper(int nowPage, int pageSize, Map keys);
	//�޸Ĳ�ѯ
	public SalmanagerBean queryUserById(int id);
	public void updateUser(SalmanagerBean user);
	//�з�����ʦ��ѯ
	public SalmanagerBean queryNameById(int id);
	//ɾ����ѯ
	public String deleteUser(int id);
	
	//��ҳ��ѯ+ģ����ѯ ---н���׼����
	public Page queryUserByPageHelperShenpi(int nowPage, int pageSize, Map keys);
	
	//��ҳ��ѯ+ģ����ѯ ---н�귢�Ź���
	public Page queryUserByPageHelperFafang(int nowPage, int pageSize, Map keys);
}
