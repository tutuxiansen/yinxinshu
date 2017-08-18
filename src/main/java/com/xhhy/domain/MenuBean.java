package com.xhhy.domain;

import java.io.Serializable;

public class MenuBean implements Serializable{

	private int menuId;
	private String menuName;
	private int menuTop;
	private String menuUrl;
	private int menuState;
	private String menuRemark;
	private MenuBean top;
	private boolean flag;//标识，代表有没有这个权限
	private int menuBoss;
	
	
	public int getMenuBoss() {
		return menuBoss;
	}
	public void setMenuBoss(int menuBoss) {
		this.menuBoss = menuBoss;
	}
	public MenuBean getTop() {
		return top;
	}
	public void setTop(MenuBean top) {
		this.top = top;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getMenuTop() {
		return menuTop;
	}
	public void setMenuTop(int menuTop) {
		this.menuTop = menuTop;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	public int getMenuState() {
		return menuState;
	}
	public void setMenuState(int menuState) {
		this.menuState = menuState;
	}
	public String getMenuRemark() {
		return menuRemark;
	}
	public void setMenuRemark(String menuRemark) {
		this.menuRemark = menuRemark;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}
