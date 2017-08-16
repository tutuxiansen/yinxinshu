package com.xhhy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.Page;
import com.xhhy.domain.DeptBean;
import com.xhhy.domain.PositionBean;
import com.xhhy.service.DeptService;
import com.xhhy.service.PositionService;
import com.xhhy.util.PageUtil;

@Controller
@RequestMapping("position")
public class PositionController {
	@Autowired
	private PositionService ps;
	@Autowired
	private DeptService deptService;
	 @RequestMapping("list.do")
	public String listByPageHelper(Model model , @RequestParam(value = "nowPage",defaultValue = "1") Integer nowPage,String positionName){
		Map keys = new HashMap();
		keys.put("positionName", positionName);
		Page<PositionBean> page = ps.queryByPageHelper(nowPage, 5, keys);
		List<PositionBean> positions = page.getResult();
		int pageNum = page.getPageNum();
		int pageSize = page.getPageSize();
		long total = page.getTotal();
		int pages = page.getPages();
		PageUtil pageUtil = new PageUtil<PositionBean>();
		pageUtil.setNowPage(pageNum);
		pageUtil.setPageSize(pageSize);
		pageUtil.setTotalCount(Integer.parseInt(total + ""));
		pageUtil.setTotalPage(pages);
		
		model.addAttribute("page", page);
			
		model.addAttribute("pageUtil", pageUtil);
		model.addAttribute("positions", positions);
		model.addAttribute("keys", keys);
		return "/resource/demo3/list.jsp";
	}
	//添加前查询
		@RequestMapping("preAdd.do")
		public ModelAndView preAdd(){
			List<DeptBean> depts = deptService.queryAll();
			ModelAndView mav = new ModelAndView("/resource/demo3/add.jsp");
			mav.addObject("depts", depts);
			return mav;
		}
	//添加
	@RequestMapping("add.do")
		public String add(@ModelAttribute PositionBean position){
			ps.add(position);
			return "redirect:/position/list.do";
		}
	//修改前查询
		 @RequestMapping("preUpdate.do")
		public ModelAndView preUpdate(@RequestParam(value = "id") int id){
			PositionBean position = ps.queryById(id);
			List<DeptBean> depts = deptService.queryAll();
			ModelAndView mav = new ModelAndView("/resource/demo3/update.jsp");
			mav.addObject("position", position);
			mav.addObject("depts", depts);
			return mav;
		}
	//修改
		@RequestMapping("update.do")
		public String update(@ModelAttribute PositionBean position){
			ps.update(position);
			return "redirect:/position/list.do";
		}
	//删除
		@RequestMapping("delete.do")
		public String delete(@RequestParam(value="id")int id){
			ps.delete(id);
			return "redirect:/position/list.do";
		}
	//查看	
	@RequestMapping("view.do")
		public ModelAndView view(@RequestParam(value = "id") int id){
			PositionBean position = ps.queryById(id);
			ModelAndView mav = new ModelAndView("/resource/demo3/view.jsp");
			mav.addObject("position", position);
			return mav;
		}
}
