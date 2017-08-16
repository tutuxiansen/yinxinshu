package com.xhhy.domain;

import java.io.Serializable;

/**
 * ��Ӧ�������˲�ͳ�Ʊ�
 * @author SmileZj
 *
 */
public class ReserveTalentBean implements Serializable{

	private int dataId;	//����id
	private String empId;	//id
	private String empName;	//����
	private String empGender;	//�Ա�
	private String empTel;	//�绰
	private String empProfession;	//רҵ
	private String empEducation;	//ѧ��
	private String empScholl;		//ѧУ
	private String empWorkExperience;	//��������
	private String empAppointed;	//�Ƿ�ӦƸ������˾
	
	public int getDataId() {
		return dataId;
	}
	public void setDataId(int dataId) {
		this.dataId = dataId;
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public String getEmpTel() {
		return empTel;
	}
	public void setEmpTel(String empTel) {
		this.empTel = empTel;
	}
	public String getEmpProfession() {
		return empProfession;
	}
	public void setEmpProfession(String empProfession) {
		this.empProfession = empProfession;
	}
	public String getEmpEducation() {
		return empEducation;
	}
	public void setEmpEducation(String empEducation) {
		this.empEducation = empEducation;
	}
	public String getEmpScholl() {
		return empScholl;
	}
	public void setEmpScholl(String empScholl) {
		this.empScholl = empScholl;
	}
	public String getEmpWorkExperience() {
		return empWorkExperience;
	}
	public void setEmpWorkExperience(String empWorkExperience) {
		this.empWorkExperience = empWorkExperience;
	}
	public String getEmpAppointed() {
		return empAppointed;
	}
	public void setEmpAppointed(String empAppointed) {
		this.empAppointed = empAppointed;
	}
	@Override
	public String toString() {
		return "ReserveTalentBean [dataId=" + dataId + ", empId=" + empId + ", empName=" + empName + ", empGender="
				+ empGender + ", empTel=" + empTel + ", empProfession=" + empProfession + ", empEducation="
				+ empEducation + ", empScholl=" + empScholl + ", empWorkExperience=" + empWorkExperience
				+ ", empAppointed=" + empAppointed + "]";
	}
	
	
	
}
