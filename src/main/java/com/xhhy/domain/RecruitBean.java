package com.xhhy.domain;

import java.io.Serializable;
import java.util.Date;
//职位发布类
public class RecruitBean implements Serializable{
	private int recruitId;
	/*private DeptBean recruitDept;*/
	private int recruitType;
	private int recruitNum;
	private String recruitName;
	private String recruitCode;
	private String recruitClass;
	private String recruitReg;
	private Date recruitStarttime;
	private Date recruitDeadline;
	private String recruitDescribe;
	private String recruitRement;
	private int recruitLjsc;
	public int getRecruitId() {
		return recruitId;
	}
	public void setRecruitId(int recruitId) {
		this.recruitId = recruitId;
	}
	/*public DeptBean getRecruitDept() {
		return recruitDept;
	}
	public void setRecruitDept(DeptBean recruitDept) {
		this.recruitDept = recruitDept;
	}*/
	public int getRecruitType() {
		return recruitType;
	}
	public void setRecruitType(int recruitType) {
		this.recruitType = recruitType;
	}
	public int getRecruitNum() {
		return recruitNum;
	}
	public void setRecruitNum(int recruitNum) {
		this.recruitNum = recruitNum;
	}
	public String getRecruitName() {
		return recruitName;
	}
	public void setRecruitName(String recruitName) {
		this.recruitName = recruitName;
	}
	public String getRecruitCode() {
		return recruitCode;
	}
	public void setRecruitCode(String recruitCode) {
		this.recruitCode = recruitCode;
	}
	public String getRecruitClass() {
		return recruitClass;
	}
	public void setRecruitClass(String recruitClass) {
		this.recruitClass = recruitClass;
	}
	public String getRecruitReg() {
		return recruitReg;
	}
	public void setRecruitReg(String recruitReg) {
		this.recruitReg = recruitReg;
	}
	public Date getRecruitStarttime() {
		return recruitStarttime;
	}
	public void setRecruitStarttime(Date recruitStarttime) {
		this.recruitStarttime = recruitStarttime;
	}
	public Date getRecruitDeadline() {
		return recruitDeadline;
	}
	public void setRecruitDeadline(Date recruitDeadline) {
		this.recruitDeadline = recruitDeadline;
	}
	public String getRecruitDescribe() {
		return recruitDescribe;
	}
	public void setRecruitDescribe(String recruitDescribe) {
		this.recruitDescribe = recruitDescribe;
	}
	public String getRecruitRement() {
		return recruitRement;
	}
	public void setRecruitRement(String recruitRement) {
		this.recruitRement = recruitRement;
	}
	public int getRecruitLjsc() {
		return recruitLjsc;
	}
	public void setRecruitLjsc(int recruitLjsc) {
		this.recruitLjsc = recruitLjsc;
	}
	
	
	
	
}
