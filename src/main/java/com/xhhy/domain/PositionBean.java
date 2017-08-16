package com.xhhy.domain;

import java.io.Serializable;
import java.util.List;

public class PositionBean implements Serializable{

	private int  positionId;
	private String  positionCode;
	private String  positionName;
	private int  positionClass;
	private int deptId;
	private int menuId;
	private String positionDescribe;
	private String positionRemark;
	private int positionState;
	private DeptBean deptBean;
	private List<MenuBean> menuBean;
	
	public DeptBean getDeptBean() {
		return deptBean;
	}
	public void setDeptBean(DeptBean deptBean) {
		this.deptBean = deptBean;
	}
	
	public List<MenuBean> getMenuBean() {
		return menuBean;
	}
	public void setMenuBean(List<MenuBean> menuBean) {
		this.menuBean = menuBean;
	}
	public int getPositionState() {
		return positionState;
	}
	public void setPositionState(int positionState) {
		this.positionState = positionState;
	}
	public int getPositionId() {
		return positionId;
	}
	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}
	public String getPositionCode() {
		return positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public int getPositionClass() {
		return positionClass;
	}
	public void setPositionClass(int positionClass) {
		this.positionClass = positionClass;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getPositionDescribe() {
		return positionDescribe;
	}
	public void setPositionDescribe(String positionDescribe) {
		this.positionDescribe = positionDescribe;
	}
	public String getPositionRemark() {
		return positionRemark;
	}
	public void setPositionRemark(String positionRemark) {
		this.positionRemark = positionRemark;
	}
}
