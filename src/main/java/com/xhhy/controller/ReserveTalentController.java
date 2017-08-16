package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xhhy.domain.ReserveTalentBean;
import com.xhhy.service.ReserveTalentService;

@Controller
@RequestMapping("reser")
public class ReserveTalentController {

	@Autowired
	private ReserveTalentService service;
	
	
	@RequestMapping("query.do")
	public ModelAndView queryAll(){
		
		ModelAndView mav = new ModelAndView("/datamsg/demo4/list.jsp");
		
		List<ReserveTalentBean> beans = service.queryAll();
		
		mav.addObject("beans",beans);
		
		return mav;
		
	}
	
	
	@RequestMapping("queryByName.do")
	public ModelAndView queryByName(String name){
		ModelAndView mav = new ModelAndView("/datamsg/demo4/list.jsp");
		
		ReserveTalentBean bean = new ReserveTalentBean();
		
		bean.setEmpName(name);
		
		List<ReserveTalentBean> beans = service.queryByName(bean);
		
		mav.addObject("beans",beans);
		
		return mav;
	}
	
	
	public ModelAndView queryByYear(){
		ModelAndView mav = new ModelAndView("/datamsg/demo4/list.jsp");
		
		
		return mav;
	}
}
