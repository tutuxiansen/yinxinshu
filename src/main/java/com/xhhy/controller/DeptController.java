package com.xhhy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xhhy.domain.DeptBean;
import com.xhhy.domain.UserBean;
import com.xhhy.service.DeptService;

@Controller
@RequestMapping("dept")
public class DeptController {
	@Autowired
	private DeptService deptService;
	//d树传值
	@RequestMapping("list.do")
	public ModelAndView listAll() {
		List<DeptBean> depts = deptService.queryAll();
		ModelAndView mav = new ModelAndView("/resource/demo1/left.jsp");
		mav.addObject("depts", depts);
		return mav;
	}
	//添加前查询
	@RequestMapping("preAdd.do")
	public ModelAndView preAdd(){
		List<DeptBean> depts = deptService.queryByTop();
		ModelAndView mav = new ModelAndView("/resource/demo1/add.jsp");
		mav.addObject("depts", depts);
		return mav;
	}
	//添加
	@RequestMapping("add.do")
	public String insertUser(@ModelAttribute DeptBean dept){
		deptService.add(dept);
		return "/resource/demo1/wecom.jsp";
	}
	//删除
	@RequestMapping("delete.do")
	public String deleteUser(@RequestParam(value="id")int id){
		deptService.delete(id);
		return "/resource/demo1/wecom.jsp";
	}
	//修改前查询
	 @RequestMapping("preUpdate.do")
	public ModelAndView preUpdate(@RequestParam(value = "id") int id){
		DeptBean dept = deptService.queryById(id);
		List<DeptBean> depts = deptService.queryAll();
		ModelAndView mav = new ModelAndView("/resource/demo1/update.jsp");
		mav.addObject("dept", dept);
		mav.addObject("depts", depts);
		return mav;
	}
	 //修改
	@RequestMapping("update.do")
	public ModelAndView updateUser(@ModelAttribute DeptBean dept){
		deptService.update(dept);
		ModelAndView mav = new ModelAndView("/dept/view.do?id=4");
		return mav;
	}
	@RequestMapping("view.do")
	public ModelAndView view(@RequestParam(value = "id") int id){
		DeptBean dept = deptService.queryById(id);
		ModelAndView mav = new ModelAndView("/resource/demo1/view.jsp");
		mav.addObject("dept", dept);
		return mav;
	}
	public DeptService getDeptService() {
		return deptService;
	}
	public void setDeptService(DeptService deptService) {
		this.deptService = deptService;
	}
}
