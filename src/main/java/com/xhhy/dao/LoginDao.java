package com.xhhy.dao;

import java.util.Map;
import com.xhhy.domain.UserBean;

public interface LoginDao {
	//��ѯ�û���������
		public UserBean queryUser(Map map);
	//ͨ�����ֲ�ѯ������Ϣ
		public UserBean queryByuserName(String userUserName);
}
