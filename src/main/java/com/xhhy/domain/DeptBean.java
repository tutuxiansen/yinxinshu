package com.xhhy.domain;

import java.io.Serializable;

public class DeptBean implements Serializable{

	private int deptId;
	private String deptCode;
	private String deptSimplicityName;
	private String deptName;
	private int deptTop;
	private String deptAddress;
	private String deptIntroduction;
	private String deptRemark;
	private int deptState;
	private DeptBean top;
	
	
	
	public DeptBean getTop() {
		return top;
	}
	public void setTop(DeptBean top) {
		this.top = top;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptSimplicityName() {
		return deptSimplicityName;
	}
	public void setDeptSimplicityName(String deptSimplicityName) {
		this.deptSimplicityName = deptSimplicityName;
	}
	public int getDeptTop() {
		return deptTop;
	}
	public void setDeptTop(int deptTop) {
		this.deptTop = deptTop;
	}
	public String getDeptAddress() {
		return deptAddress;
	}
	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}
	public String getDeptIntroduction() {
		return deptIntroduction;
	}
	public void setDeptIntroduction(String deptIntroduction) {
		this.deptIntroduction = deptIntroduction;
	}
	public String getDeptRemark() {
		return deptRemark;
	}
	public void setDeptRemark(String deptRemark) {
		this.deptRemark = deptRemark;
	}
	public int getDeptState() {
		return deptState;
	}
	public void setDeptState(int deptState) {
		this.deptState = deptState;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
}
