/*package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xhhy.domain.PemaBean;
import com.xhhy.domain.RecruitBean;
import com.xhhy.domain.ResumeBean;
import com.xhhy.service.PemaService;

@Controller
@RequestMapping("pema")
public class PemaContrller {
	@Autowired
	private PemaService pemaService;

	public PemaService getPemaService() {
		return pemaService;
	}

	public void setPemaService(PemaService pemaService) {
		this.pemaService = pemaService;
	}
	
	@RequestMapping("insertPema.do")
	public ModelAndView insertPema(@ModelAttribute PemaBean pema){
		pemaService.insertPema(pema);
		ModelAndView mav = new ModelAndView("");
		return mav;
	} 
	@RequestMapping("preUpdate.do")
	public String updatePema(Model model,int id){
		PemaBean pema = pemaService.querypemaById(id);
		model.addAttribute("pema", pema);
		return "";
	}
	@RequestMapping("updatePema.do")
	public ModelAndView updatePema(@ModelAttribute PemaBean pema){
		pemaService.updatePema(pema);
		ModelAndView mav = new ModelAndView("");
		return mav;
	}
	// 逻辑删除
	@RequestMapping("pemaByljsc.do")
	public ModelAndView pemaByljsc(int id) {
		pemaService.pemaByljsc(id);
		ModelAndView mav = new ModelAndView("");
		return mav;
	}
	//永久删除
	@RequestMapping("deleteResume.do")
	public ModelAndView deleteResume(int id) {
		pemaService.deletePema(id);
		ModelAndView mav = new ModelAndView("");
		return mav;
	}
	// 人事档案列表
	@RequestMapping("queryAll.do")
	public String queryAll(Model model) {
		List<PemaBean> pema = pemaService.queryPemaAll();
		model.addAttribute("pema", pema);
		return "";
	}
	// 基于ID查询
	@RequestMapping("queryPemaById.do")
	public String queryPemaById(Model model, int id) {
		PemaBean pema = pemaService.querypemaById(id);
		model.addAttribute("pema", pema);
		return "/zhaopin/demo4/view.jsp";
	}

}*/
