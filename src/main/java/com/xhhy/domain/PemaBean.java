package com.xhhy.domain;

import java.io.Serializable;
import java.util.List;
//人事部管理
public class PemaBean implements Serializable{
	private int pemaId;			
	private ResumeBean pema_resume;//关联简历表
	private int pemaResumeId;	//关联ID
	private String pemaCode;	//档案编码
	private int pemaType;		//审核状态
	private int pemaInterview;  //档案状态
	private String pemaMoney;	//薪酬标准
	private String pemaBank;	//开户行
	private String pemaBankid;		//银行卡号
	private String pemaInsuranceid;//社保卡号
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
	
	
	
	
	
	public int getPemaInterview() {
		return pemaInterview;
	}
	public void setPemaInterview(int pemaInterview) {
		this.pemaInterview = pemaInterview;
	}
	public int getPemaResumeId() {
		return pemaResumeId;
	}
	public void setPemaResumeId(int pemaResumeId) {
		this.pemaResumeId = pemaResumeId;
	}
	 
	public ResumeBean getPema_resume() {
		return pema_resume;
	}
	public void setPema_resume(ResumeBean pema_resume) {
		this.pema_resume = pema_resume;
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
	
	public String getPemaBankid() {
		return pemaBankid;
	}
	public void setPemaBankid(String pemaBankid) {
		this.pemaBankid = pemaBankid;
	}
	public String getPemaInsuranceid() {
		return pemaInsuranceid;
	}
	public void setPemaInsuranceid(String pemaInsuranceid) {
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
	public String getPemaCode() {
		return pemaCode;
	}
	public void setPemaCode(String pemaCode) {
		this.pemaCode = pemaCode;
	}

	
	
	
}
