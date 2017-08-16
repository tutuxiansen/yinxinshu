package com.xhhy.service;

import java.util.List;

import com.xhhy.domain.PemaBean;

public interface PemaService {
	public void insertPema(PemaBean pema);
	public void updatePema(PemaBean pema);
	public void deletePema(int id);
	public void pemaByljsc(int id);
	public PemaBean querypemaById(int id);
	public List<PemaBean> queryPemaAll();

}
