package com.xhhy.dao;

import java.util.List;
import java.util.Map;

import com.xhhy.domain.SalmanagerBean;

public interface SalmanagerDao {
	//�����ѯ
	public void insertUser(SalmanagerBean salManager);
	
	//��ѯ����
	public List<SalmanagerBean>queryAll();
	
	//��ҳ��ѯ+ģ����ѯ
	public List<SalmanagerBean> queryUserByMap(Map key);
	
	//Ԥ���޸Ĳ�ѯ
	public SalmanagerBean queryUserById(int id);
	//�޸Ĳ�ѯ
	public void updateUser(SalmanagerBean user);
	
	//�з�����ʦ��ѯ
	public SalmanagerBean queryNameById(int id);
	
	//ɾ�����ݲ�ѯ
	public String deleteUser(int id);
	//н���׼����
	public List<SalmanagerBean> queryUserByMapShenpi(Map key);
	//н�귢�Ź���
	public List<SalmanagerBean> queryUserByMapFafang(Map key);
}
