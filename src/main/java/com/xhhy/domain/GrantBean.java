package com.xhhy.domain;

public class GrantBean {

	private int pmPositionId;
	private int pmMenuId;
	private MenuBean menuBean;
	 
	public MenuBean getMenuBean() {
		return menuBean;
	}
	public void setMenuBean(MenuBean menuBean) {
		this.menuBean = menuBean;
	}
	public int getPmPositionId() {
		return pmPositionId;
	}
	public void setPmPositionId(int pmPositionId) {
		this.pmPositionId = pmPositionId;
	}
	public int getPmMenuId() {
		return pmMenuId;
	}
	public void setPmMenuId(int pmMenuId) {
		this.pmMenuId = pmMenuId;
	}
	
}
