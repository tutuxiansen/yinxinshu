package com.xhhy.util;

import java.util.List;

public class PageUtil<T> {
	
	private int nowPage = 1;
	private int pageSize = 10;
	private int totalCount = 0;
	private int totalPage = 0;
	private int startNum = 0; // 代表查询开始的下标
	private int endNum = 0;
	private T t; // 实体类，用来保存查询条件一个对象
	private List<T> objs; // 查询结果的集合

	
	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public List<T> getObjs() {
		return objs;
	}

	public void setObjs(List<T> objs) {
		this.objs = objs;
	}

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}

	
}
