package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xhhy.domain.RecruitBean;
import com.xhhy.domain.ResumeBean;
import com.xhhy.service.ResumeService;

@Controller
@RequestMapping("resume")
public class ResumeContrller {
	@Autowired
	private ResumeService resumeService;

	public ResumeService getResumeService() {
		return resumeService;
	}
	
	public void setResumeService(ResumeService resumeService) {
		this.resumeService = resumeService;
	}
					// 简历管理
	// 添加
	@RequestMapping("insertResume.do")
	public ModelAndView insertResume(@ModelAttribute ResumeBean resume) {
		resumeService.insertResume(resume);
		ModelAndView mav = new ModelAndView("/resume/queryAll.do");
		return mav;
	}

	// 修改属性
	@RequestMapping("updateType.do")
	public ModelAndView resumeByljsc(@ModelAttribute ResumeBean resume) {
		resumeService.updateByType(resume);
		ModelAndView mav = new ModelAndView("/resume/queryAll.do");
		return mav;
	}

	// 修改前
	@RequestMapping("preUpdate.do")
	public String preUpdate(Model model, int id) {
		ResumeBean resume = resumeService.queryResumeById(id);
		model.addAttribute("resume", resume);
		return "/zhaopin/demo2/update.jsp";
	}

	// 修改
	@RequestMapping("updateResume.do")
	public ModelAndView updateResume(@ModelAttribute ResumeBean resume) {
		resumeService.updateResume(resume);
		ModelAndView mav = new ModelAndView("/resume/queryAll.do");
		return mav;
	}

	// 逻辑删除
	@RequestMapping("resumeByljsc.do")
	public ModelAndView resumeByljsc(int id) {
		resumeService.resumeByljsc(id);
		ModelAndView mav = new ModelAndView("/resume/queryAll.do");
		return mav;
	}

	// 查询简历列表
	@RequestMapping("queryAll.do")
	public String queryAll(Model model) {
		List<ResumeBean> resume = resumeService.queryResumeAll();
		model.addAttribute("resume", resume);
		return "/zhaopin/demo2/list.jsp";
	}

	// 基于ID查询
	@RequestMapping("queryResumeById.do")
	public String queryResumeById(Model model, int id) {
		ResumeBean resume = resumeService.queryResumeById(id);
		model.addAttribute("resume", resume);
		return "/zhaopin/demo2/view.jsp";
	}

					// 面试管理
	// 列表查询
	@RequestMapping("queryAll2.do")
	public String queryAll2(Model model) {
		List<ResumeBean> interview = resumeService.queryInterviewAll();
		model.addAttribute("interview", interview);
		return "/zhaopin/demo3/list.jsp";
	}

	// 逻辑删除
	@RequestMapping("resumeByljsc2.do")
	public ModelAndView resumeByljsc2(int id) {
		resumeService.resumeByljsc(id);
		ModelAndView mav = new ModelAndView("/resume/queryAll2.do");
		return mav;
	}

	// 登记前查询
	@RequestMapping("queryResumeById2.do")
	public String queryResumeById2(Model model, int id) {
		ResumeBean interview = resumeService.queryInterviewById(id);
		model.addAttribute("interview", interview);
		return "/zhaopin/demo3/add.jsp";
	}

	// 修改
	@RequestMapping("updateInterview.do")
	public ModelAndView updateInterview(@ModelAttribute ResumeBean resume) {
		resumeService.updateInterview(resume);
		ModelAndView mav = new ModelAndView("/resume/queryAll2.do");
		return mav;
	}
					//录用管理
	// 列表查询
	@RequestMapping("queryAll3.do")
	public String queryAll3(Model model) {
		List<ResumeBean> interview = resumeService.queryInterviewAll2();
		model.addAttribute("interview", interview);
		return "/zhaopin/demo4/list.jsp";
		}
	// 登记前查询
	@RequestMapping("queryResumeById3.do")
	public String queryResumeById3(Model model, int id) {
		ResumeBean interview = resumeService.queryInterviewById(id);
		model.addAttribute("interview", interview);
		return "/zhaopin/demo4/add.jsp";
	}
	// 修改
	@RequestMapping("updateInterview2.do")
	public ModelAndView updateInterview2(@ModelAttribute ResumeBean resume) {
		resumeService.updateInterview2(resume);
		ModelAndView mav = new ModelAndView("/resume/queryAll3.do");
		return mav;
	}

}
