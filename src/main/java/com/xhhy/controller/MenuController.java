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
import com.xhhy.domain.MenuBean;
import com.xhhy.service.MenuService;
import com.xhhy.util.PageUtil;

@Controller
@RequestMapping("menu")
public class MenuController {
	@Autowired
	private MenuService ms;
	 @RequestMapping("list.do")
	public String listByPageHelper(Model model , @RequestParam(value = "nowPage",defaultValue = "1") Integer nowPage,String menuName){
		Map keys = new HashMap();
		keys.put("menuName", menuName);
		Page<MenuBean> page = ms.queryByPageHelper(nowPage, 5, keys);
		List<MenuBean> menus = page.getResult();
		int pageNum = page.getPageNum();
		int pageSize = page.getPageSize();
		long total = page.getTotal();
		int pages = page.getPages();
		PageUtil pageUtil = new PageUtil<MenuBean>();
		pageUtil.setNowPage(pageNum);
		pageUtil.setPageSize(pageSize);
		pageUtil.setTotalCount(Integer.parseInt(total + ""));
		pageUtil.setTotalPage(pages);
		
		model.addAttribute("page", page);
			
		model.addAttribute("pageUtil", pageUtil);
		model.addAttribute("menus",menus);
		model.addAttribute("keys", keys);
		return "/resource/demo8/list.jsp";
	}
	//添加前查询
		@RequestMapping("preAdd.do")
		public ModelAndView preAdd(){
			List<MenuBean> menus = ms.queryByTop();
			ModelAndView mav = new ModelAndView("/resource/demo8/add.jsp");
			mav.addObject("menus", menus);
			return mav;
		}
	//添加
	@RequestMapping("add.do")
		public String add(@ModelAttribute MenuBean menu){
			ms.add(menu);
			return "redirect:/menu/list.do";
		}
	//修改前查询
		 @RequestMapping("preUpdate.do")
		public ModelAndView preUpdate(@RequestParam(value = "id") int id){
			 MenuBean menu = ms.queryById(id);
			 List<MenuBean> menus = ms.queryAll();
			ModelAndView mav = new ModelAndView("/resource/demo8/update.jsp");
			mav.addObject("menu", menu);
			mav.addObject("menus", menus);
			return mav;
		}
	//修改
		@RequestMapping("update.do")
		public String update(@ModelAttribute MenuBean menu){
			ms.update(menu);
			return "redirect:/menu/list.do";
		}
	//删除
		@RequestMapping("delete.do")
		public String delete(@RequestParam(value="id")int id){
			ms.delete(id);
			return "redirect:/menu/list.do";
		}
	//查看	
	@RequestMapping("view.do")
		public ModelAndView view(@RequestParam(value = "id") int id){
			MenuBean menu = ms.queryById(id);
			ModelAndView mav = new ModelAndView("/resource/demo8/view.jsp");
			mav.addObject("menu", menu);
			return mav;
		}
	public MenuService getMs() {
		return ms;
	}
	public void setMs(MenuService ms) {
		this.ms = ms;
	}
	
}
