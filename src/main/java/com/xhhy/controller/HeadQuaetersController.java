package com.xhhy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xhhy.domain.HeadQuaetersBean;
import com.xhhy.service.HeadeQuaetersService;

@Controller
@RequestMapping("headQ")
public class HeadQuaetersController {
	
	@Autowired
	private HeadeQuaetersService service;

	@RequestMapping("queryAll.do")
	public ModelAndView queryAll(){
		ModelAndView mav = new ModelAndView("/datamsg/demo3/list.jsp");
		
		Map map = new HashMap();
	
		List<Map<String,String>> headQuaetersBeans = service.queryAll(map);
		
		mav.addObject("beans",headQuaetersBeans);
		
		return mav;
	}
	
	
	public HeadeQuaetersService getService() {
		return service;
	}

	public void setService(HeadeQuaetersService service) {
		this.service = service;
	}
	
	
}
