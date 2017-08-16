package com.xhhy.domain;

import java.io.Serializable;
//人事部管理
public class PemaBean implements Serializable{
	private int pemaId;			
	private ResumeBean pemaResumeId;//关联简历表
	private int pemaType;		//档案状态
	private String pemaMoney;	//薪酬标准
	private String pemaBank;	//开户行
	private int pemaBankid;		//银行卡号
	private int pemaInsuranceid;//社保卡号
	private String pemaReg;		//登记人
	private String pemaTime;	//建党时间
	private String pemaFamily;	//家庭关系信息
	private String pemaRemark;	//备注
	private int pemaLjsc;		//逻辑删除
	public int getPemaId() {
		return pemaId;
	}
	public void setPemaId(int pemaId) {
		this.pemaId = pemaId;
	}
	
	
	public ResumeBean getPemaResumeId() {
		return pemaResumeId;
	}
	public void setPemaResumeId(ResumeBean pemaResumeId) {
		this.pemaResumeId = pemaResumeId;
	}
	public int getPemaType() {
		return pemaType;
	}
	public void setPemaType(int pemaType) {
		this.pemaType = pemaType;
	}
	public String getPemaMoney() {
		return pemaMoney;
	}
	public void setPemaMoney(String pemaMoney) {
		this.pemaMoney = pemaMoney;
	}
	public String getPemaBank() {
		return pemaBank;
	}
	public void setPemaBank(String pemaBank) {
		this.pemaBank = pemaBank;
	}
	public int getPemaBankid() {
		return pemaBankid;
	}
	public void setPemaBankid(int pemaBankid) {
		this.pemaBankid = pemaBankid;
	}
	public int getPemaInsuranceid() {
		return pemaInsuranceid;
	}
	public void setPemaInsuranceid(int pemaInsuranceid) {
		this.pemaInsuranceid = pemaInsuranceid;
	}
	public String getPemaReg() {
		return pemaReg;
	}
	public void setPemaReg(String pemaReg) {
		this.pemaReg = pemaReg;
	}
	public String getPemaTime() {
		return pemaTime;
	}
	public void setPemaTime(String pemaTime) {
		this.pemaTime = pemaTime;
	}
	public String getPemaFamily() {
		return pemaFamily;
	}
	public void setPemaFamily(String pemaFamily) {
		this.pemaFamily = pemaFamily;
	}
	public String getPemaRemark() {
		return pemaRemark;
	}
	public void setPemaRemark(String pemaRemark) {
		this.pemaRemark = pemaRemark;
	}
	public int getPemaLjsc() {
		return pemaLjsc;
	}
	public void setPemaLjsc(int pemaLjsc) {
		this.pemaLjsc = pemaLjsc;
	}

	
	
	
}
