package com.xhhy.service;

import java.util.List;
import java.util.Map;

import com.xhhy.domain.UserBean;

public interface LoginService {
	//��ѯ�û���������
	public UserBean queryUser(Map map);
	//ͨ���˺Ż�ø�����Ϣ
	public UserBean queryByuserName(String userUserName);
}
