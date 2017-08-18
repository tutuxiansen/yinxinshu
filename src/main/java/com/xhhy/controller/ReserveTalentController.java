package com.xhhy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.Page;
import com.xhhy.domain.PemaBean;
import com.xhhy.domain.ResumeBean;
import com.xhhy.service.ReserveTalentService;
import com.xhhy.util.PageUtil;

@Controller
@RequestMapping("reser")
public class ReserveTalentController {

	@Autowired
	private ReserveTalentService service;
	
	
	@RequestMapping("query.do")
	public String queryAll(Model model, @ModelAttribute PemaBean emp,
			@RequestParam(value = "nowPage", defaultValue = "1") int nowPage){
		
		PageUtil<PemaBean> pageUtil = new PageUtil<PemaBean>();
		pageUtil.setT(emp);
		pageUtil.setNowPage(nowPage);
		pageUtil.setStartNum((nowPage - 1) * pageUtil.getPageSize() + 1);
		pageUtil.setEndNum(nowPage * 5);

		List<PemaBean> emps = service.queryEmpByPageUtil(pageUtil);
		
		model.addAttribute("emps", emps);
		model.addAttribute("pageUtil", pageUtil);

		return "/datamsg/demo4/list.jsp";
	}
	
	
	@RequestMapping("queryByName.do")
	public String queryByName(Model model, @ModelAttribute PemaBean emp,
			@RequestParam(value = "nowPage", defaultValue = "1") int nowPage,String name){
		ModelAndView mav = new ModelAndView("/datamsg/demo4/list.jsp");
		
		/*PemaBean bean = new PemaBean();
		bean.setPema_resume(new ResumeBean());
		bean.getPema_resume().setResumeName(name);
		
		List<PemaBean> beans = service.queryByName(bean);
		
		mav.addObject("beans",beans);*/
		
		Map map = new HashMap();
		map.put("empName", name);
		Page<PemaBean> page = service.queryEmpByPageHelper(nowPage, 5, map);
		List<PemaBean> emps = page.getResult();

		String interView = null;
		for (PemaBean pemaBean : emps) {
			if (pemaBean.getPemaInterview() == 6) {
				interView = "试用期";
			} else if (pemaBean.getPemaInterview() == 7) {
				interView = "实习员工";
			} else if (pemaBean.getPemaInterview() == 8) {
				interView = "正式员工";
			} else if (pemaBean.getPemaInterview() == 9) {
				interView = "离职";
			} else if (pemaBean.getPemaInterview() == 10) {
				interView = "已删除";
			}
		}
		int pageNum = page.getPageNum();
		int pageSize = page.getPageSize();
		long total = page.getTotal();
		int pages = page.getPages();
		PageUtil pageUtil = new PageUtil<PemaBean>();
		pageUtil.setNowPage(pageNum);
		pageUtil.setPageSize(pageSize);
		pageUtil.setTotalCount(Integer.parseInt(total + ""));
		pageUtil.setTotalPage(pages);

		model.addAttribute("page", page);
		model.addAttribute("interView", interView);
		model.addAttribute("pageUtil", pageUtil);
		model.addAttribute("emp", emp);
		model.addAttribute("map", map);

		model.addAttribute("emps", emps);
		
		return "/datamsg/demo4/list.jsp";
	}
	
	
	public ModelAndView queryByYear(){
		ModelAndView mav = new ModelAndView("/datamsg/demo4/list.jsp");
		
		
		return mav;
	}
}
