package com.xhhy.dao;

import java.util.List;
import java.util.Map;

import com.xhhy.domain.SalmanagerBean;
import com.xhhy.domain.UserBean;

public interface LoginDao {
	//��ѯ�û���������
		public UserBean queryUser(Map map);
	//ͨ�����ֲ�ѯ������Ϣ
		public UserBean queryByuserName(String username);
}
