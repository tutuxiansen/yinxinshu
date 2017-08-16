package com.xhhy.domain;

import java.io.Serializable;
import java.util.Date;
/**
 * 创建职员移动情况统计分析表
 * @author SmileZj
 *
 */
public class HeadQuaetersBean implements Serializable{

	private int dataId;		//数据ID
	private String changeYear;	//变动年
	private String changeMonth; //变动月
	private String changeType;	//变动状态
	private String deptName;	//部门名称 （本部/研究院）
	private String deptChange;	//具体部门变动
	
	public int getDataId() {
		return dataId;
	}
	public void setDataId(int dataId) {
		this.dataId = dataId;
	}
	public String getChangeYear() {
		return changeYear;
	}
	public void setChangeYear(String changeYear) {
		this.changeYear = changeYear;
	}
	public String getChangeMonth() {
		return changeMonth;
	}
	public void setChangeMonth(String changeMonth) {
		this.changeMonth = changeMonth;
	}
	public String getChangeType() {
		return changeType;
	}
	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptChange() {
		return deptChange;
	}
	public void setDeptChange(String deptChange) {
		this.deptChange = deptChange;
	}
	@Override
	public String toString() {
		return "HeadQuaetersBean [dataId=" + dataId + ", changeYear=" + changeYear + ", changeMonth=" + changeMonth
				+ ", changeType=" + changeType + ", deptName=" + deptName + ", deptChange=" + deptChange + "]";
	}
	
	
}
