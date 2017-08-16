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
import com.xhhy.domain.DeptBean;
import com.xhhy.domain.PositionBean;
import com.xhhy.domain.UserBean;
import com.xhhy.service.DeptService;
import com.xhhy.service.PositionService;
import com.xhhy.service.UserService;
import com.xhhy.util.PageUtil;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private DeptService deptService;
	@Autowired
	private PositionService position;
	// 查询全部
	/*@RequestMapping("listUser.do")
	public ModelAndView listUser() {
		List<UserBean> users = userService.queryCount();
		System.out.println("-----------------");
		System.out.println(users.size());
		ModelAndView mav = new ModelAndView("/resource/demo2/list.jsp");
		mav.addObject("users", users);
		System.out.println("++++++++++++++++++++++++++");
		return mav;
	}*/
	@RequestMapping("preAdd.do")
	public ModelAndView preAdd(){
		List<DeptBean> depts = deptService.queryAll();
		List<PositionBean> positions = position.queryAll();
		ModelAndView mav = new ModelAndView("/resource/demo2/add.jsp");
		mav.addObject("depts",depts);
		mav.addObject("positions", positions);
				return mav;
	}
	@RequestMapping("addUser.do")
	public String insertUser(@ModelAttribute UserBean user){
		userService.insertUser(user);
		return "/user/listUser.do";
	}
	@RequestMapping("updateUser.do")
	public String updateUser(@ModelAttribute UserBean user){
		userService.updateUser(user);
		return "redirect:/user/listUser.do";
	}
	@RequestMapping("listUser.do")
	public String listByPageHelper(Model model , @RequestParam(value = "nowPage",defaultValue = "1") Integer nowPage,String userName){
		Map keys = new HashMap();
		keys.put("userName", userName);
		Page<UserBean> page = userService.queryUserByPageHelper(nowPage, 5, keys);
		List<UserBean> users = page.getResult();
		int pageNum = page.getPageNum();
		int pageSize = page.getPageSize();
		long total = page.getTotal();
		int pages = page.getPages();
		PageUtil pageUtil = new PageUtil<UserBean>();
		pageUtil.setNowPage(pageNum);
		pageUtil.setPageSize(pageSize);
		pageUtil.setTotalCount(Integer.parseInt(total + ""));
		pageUtil.setTotalPage(pages);
		
		model.addAttribute("page", page);
			
		model.addAttribute("pageUtil", pageUtil);
		model.addAttribute("users", users);
		model.addAttribute("keys", keys);
		return "/resource/demo2/list.jsp";
	}
	@RequestMapping("deleteByIdUser.do")
	public String deleteUser(@RequestParam(value="id")int id){
		userService.deleteUser(id);
		return "/user/listUser.do";
	}
	@RequestMapping("preUpdate.do")
	public ModelAndView preUpdate(@RequestParam(value = "id") int id){
		UserBean user = userService.queryUserById(id);
		List<DeptBean> depts = deptService.queryAll();
		List<PositionBean> positions = position.queryAll();
		ModelAndView mav = new ModelAndView("/resource/demo2/update.jsp");
		mav.addObject("depts", depts);
		mav.addObject("user", user);
		mav.addObject("positions", positions);
		return mav;
	}
	@RequestMapping("view.do")
	public ModelAndView view(@RequestParam(value = "id") int id){
		UserBean user = userService.queryUserById(id);
		ModelAndView mav = new ModelAndView("/resource/demo2/view.jsp");
		mav.addObject("user", user);
		return mav;
	}
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
