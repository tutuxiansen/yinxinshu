package com.xhhy.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.factory.config.SingletonBeanRegistry;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * 
 * @author SmileZj
 *
 */
public class EmpBean implements Serializable {

	private int dataId;	
	private String empId;	
	private String empName;	
	private String empGender;	
	private String empPosition;	
	private String empPositonal;	
	private String empTel;		
	private String empRecordState;
	private String createYear;	
	private String createMonth;
	private String createDay;
	private String empEducation;
	private String deptName;	
	
	
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
	public String getEmpPosition() {
		return empPosition;
	}
	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}
	public String getEmpPositonal() {
		return empPositonal;
	}
	public void setEmpPositonal(String empPositonal) {
		this.empPositonal = empPositonal;
	}
	public String getEmpTel() {
		return empTel;
	}
	public void setEmpTel(String empTel) {
		this.empTel = empTel;
	}
	public String getEmpRecordState() {
		return empRecordState;
	}
	public void setEmpRecordState(String empRecordState) {
		this.empRecordState = empRecordState;
	}
	
	public String getCreateYear() {
		return createYear;
	}
	public void setCreateYear(String createYear) {
		this.createYear = createYear;
	}
	public String getCreateMonth() {
		return createMonth;
	}
	public void setCreateMonth(String createMonth) {
		this.createMonth = createMonth;
	}
	public String getCreateDay() {
		return createDay;
	}
	public void setCreateDay(String createDay) {
		this.createDay = createDay;
	}
	public String getEmpEducation() {
		return empEducation;
	}
	public void setEmpEducation(String empEducation) {
		this.empEducation = empEducation;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "EmpBean [dataId=" + dataId + ", empId=" + empId + ", empName=" + empName + ", empGender=" + empGender
				+ ", empPosition=" + empPosition + ", empPositonal=" + empPositonal + ", empTel=" + empTel
				+ ", empRecordState=" + empRecordState + ", createYear=" + createYear + ", createMonth=" + createMonth
				+ ", createDay=" + createDay + ", empEducation=" + empEducation + ", deptName=" + deptName + "]";
	}
	
	
}
