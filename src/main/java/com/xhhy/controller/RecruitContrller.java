package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xhhy.domain.RecruitBean;
import com.xhhy.service.RecruitService;

@Controller
@RequestMapping("recruit")
public class RecruitContrller {
	@Autowired
	private RecruitService recruitService;
	//添加
	@RequestMapping("insertRecruit.do")
	public ModelAndView insertRecruit(@ModelAttribute RecruitBean recruit){
		recruitService.insertRecruit(recruit);
		ModelAndView mav = new ModelAndView("/recruit/queryAll.do");
		return mav;
	}
	//逻辑
	@RequestMapping("deleteByljsc.do")
	public ModelAndView deleteByljsc(int id){
		recruitService.deleteByljsc(id);
		ModelAndView mav = new ModelAndView("/recruit/queryAll.do");
		return mav;
	}
	
	@RequestMapping("preUpdate.do")
	public String updateRecruit(Model model,int id){
		RecruitBean recruit = recruitService.queryRecruitById(id);
		model.addAttribute("recruit", recruit);
		return "/zhaopin/demo1/preUpdate.jsp";
	}
	
	@RequestMapping("updateRecruit.do")
	public ModelAndView updateRecruit(@ModelAttribute RecruitBean recruit){
		recruitService.updateRecruit(recruit);
		ModelAndView mav = new ModelAndView("/recruit/queryAll.do");
		return mav;
	}
	
	@RequestMapping("queryRecruitById.do")
	public String queryRecruitById(Model model,int id){
		RecruitBean recruit = recruitService.queryRecruitById(id);
		model.addAttribute("recruit", recruit);
		return "/zhaopin/demo1/view.jsp";
	}
	@RequestMapping("queryAll.do")
	public String queryAll(Model model){
		List<RecruitBean> recruits = recruitService.queryRecruitAll();
		model.addAttribute("recruits", recruits);
		return "/zhaopin/demo1/list.jsp";
	}
	public RecruitService getRecruitService() {
		return recruitService;
	}
	public void setRecruitService(RecruitService recruitService) {
		this.recruitService = recruitService;
	}

	
	
}
