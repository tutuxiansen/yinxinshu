package com.xhhy.domain;

import java.io.Serializable;

public class UserBean implements Serializable{
	private int userId; //用户主键
	private String userCode; //用户编码
	private String userUserName; //登录账号
	private String userPassWord; //登陆密码
	private int deptId; //部门
	private int positionId;//职位
	private String userName; //名字
	private String userIdCard; //身份证
	private long userPhone; //电话
	private String userEmail; //邮箱
	private String userAddress;	//地址
	private int userState;
	private DeptBean deptBean;
	private PositionBean positionBean;
	private String userSex;
	private String userTouxiang;
	private String userBeizhu;
	
	public PositionBean getPositionBean() {
		return positionBean;
	}
	public void setPositionBean(PositionBean positionBean) {
		this.positionBean = positionBean;
	}
	public DeptBean getDeptBean() {
		return deptBean;
	}
	public void setDeptBean(DeptBean deptBean) {
		this.deptBean = deptBean;
	}
	public int getUserState() {
		return userState;
	}
	public void setUserState(int userState) {
		this.userState = userState;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserUserName() {
		return userUserName;
	}
	public void setUserUserName(String userUserName) {
		this.userUserName = userUserName;
	}
	
	public String getUserPassWord() {
		return userPassWord;
	}
	public void setUserPassWord(String userPassWord) {
		this.userPassWord = userPassWord;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getPositionId() {
		return positionId;
	}
	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserIdCard() {
		return userIdCard;
	}
	public void setUserIdCard(String userIdCard) {
		this.userIdCard = userIdCard;
	}
	public long getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserTouxiang() {
		return userTouxiang;
	}
	public void setUserTouxiang(String userTouxiang) {
		this.userTouxiang = userTouxiang;
	}
	public String getUserBeizhu() {
		return userBeizhu;
	}
	public void setUserBeizhu(String userBeizhu) {
		this.userBeizhu = userBeizhu;
	}
	
}
