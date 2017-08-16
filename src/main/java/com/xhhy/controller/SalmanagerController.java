package com.xhhy.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.Page;
import com.xhhy.domain.SalmanagerBean;
import com.xhhy.service.SalmanagerService;
import com.xhhy.util.PageUtil;

@Controller
@RequestMapping("salmanager")
public class SalmanagerController {
@Autowired
private SalmanagerService salmanagerService;
	@RequestMapping("insert.do")
	public String insert(@ModelAttribute SalmanagerBean salManager) {
		salManager.setAuditState(1);
		salmanagerService.insertUser(salManager);
/*		ModelAndView mav = new ModelAndView("/salmanager/fenye.do");
		mav.addObject("salManager", salManager);
		return mav;*/
		return "redirect:/salmanager/fenye.do";
	}
	//ȫ����ѯ
	@RequestMapping("listUser.do")
	public ModelAndView listUser(){
		System.out.println("-----------------------------");
		List<SalmanagerBean> salManagers = salmanagerService.queryAll();
		ModelAndView mav = new ModelAndView("/pay/list_standard.jsp");
		System.out.println(salManagers);
		mav.addObject("salManagers", salManagers);
		return mav;
	}
	//��ҳ��ѯ
	@RequestMapping("fenye.do")
	public String listByPageHelper(Model model , @RequestParam(value = "nowPage",defaultValue = "1") Integer nowPage,String salType,Integer auditState){
		Map keys = new HashMap();
		keys.put("salType", salType);
		keys.put("auditState", auditState);
		Page<SalmanagerBean> page = salmanagerService.queryUserByPageHelper(nowPage, 10, keys);
		List<SalmanagerBean> salManagers = page.getResult();
		int pageNum = page.getPageNum();
		int pageSize = page.getPageSize();
		long total = page.getTotal();
		int pages = page.getPages();
		PageUtil pageUtil = new PageUtil<SalmanagerBean>();
		pageUtil.setNowPage(pageNum);
		pageUtil.setPageSize(pageSize);
		pageUtil.setTotalCount(Integer.parseInt(total + ""));
		pageUtil.setTotalPage(pages);

		model.addAttribute("page", page);
		model.addAttribute("pageUtil", pageUtil);
		model.addAttribute("salManagers", salManagers);
		model.addAttribute("keys", keys);
		return "/pay/list_standard.jsp";
	}
	//Ԥ�޸Ĳ�ѯ
	@RequestMapping("listUserById.do")
	public ModelAndView listUserById(@RequestParam(value = "id") int id){
		SalmanagerBean salManager = salmanagerService.queryUserById(id);
		System.out.println(salManager.getAuditState());
		ModelAndView mav = new ModelAndView("/pay/standard_update.jsp");
		System.out.println(salManager);
		mav.addObject("salManager", salManager);
		return mav;
	}
	//�޸Ĳ�ѯ
	@RequestMapping("update.do")
	public String update(@ModelAttribute SalmanagerBean salManager){
		salmanagerService.updateUser(salManager);
		return "redirect:/salmanager/fenye.do";
	}
	
	//н�ʱ�׼���Ͳ�ѯ
	@RequestMapping("listNameById.do")
	public ModelAndView listNameById(@RequestParam(value = "id") int id){
		System.out.println("-----------------------------");
		SalmanagerBean salManager = salmanagerService.queryUserById(id);
		ModelAndView mav = new ModelAndView("/pay/standard_view.jsp");
		System.out.println(salManager);
		mav.addObject("salManager", salManager);
		return mav;
	}
	
	//ɾ�����ݲ�ѯ
	@RequestMapping("deleteById.do")
	public String  deleteById(@RequestParam(value = "id") int id){
		System.out.println(id);
		salmanagerService.deleteUser(id);
		return "/salmanager/fenye.do";
	}
//////////////////////////////////////////////////////////////////////////////////////	
//н�ʱ�׼����
	//�ύ���
	@RequestMapping("shenpi.do")
	public ModelAndView insertshenpi(@ModelAttribute SalmanagerBean salManager) {
		salmanagerService.insertUser(salManager);
		ModelAndView mav = new ModelAndView("/salmanager/shenpifenye.do");
		mav.addObject("salManager", salManager);
		return mav;
	}
	
	@RequestMapping("shenpifenye.do")
	public String listByPageHelpershenpi(Model model , @RequestParam(value = "nowPage",defaultValue = "1") Integer nowPage,String salCode,Integer auditState){
		@SuppressWarnings("rawtypes")
		Map keys = new HashMap();
		keys.put("salCode", salCode);
		keys.put("auditState", 2);
		Page<SalmanagerBean> page = salmanagerService.queryUserByPageHelperShenpi(nowPage, 10, keys);
		
		List<SalmanagerBean> salManagers = page.getResult();
		int pageNum = page.getPageNum();
		int pageSize = page.getPageSize();
		long total = page.getTotal();
		int pages = page.getPages();
		PageUtil pageUtil = new PageUtil<SalmanagerBean>();
		pageUtil.setNowPage(pageNum);
		pageUtil.setPageSize(pageSize);
		pageUtil.setTotalCount(Integer.parseInt(total + ""));
		pageUtil.setTotalPage(pages);

		model.addAttribute("page", page);
		model.addAttribute("pageUtil", pageUtil);
		model.addAttribute("salManagers", salManagers);
		model.addAttribute("keys", keys);
		return "/pay/list_standard_sp.jsp";
	}
	//������
	@RequestMapping("listUserShenhe.do")
	public ModelAndView listUserShenhe(@RequestParam(value = "id") int id){
		SalmanagerBean salManager = salmanagerService.queryUserById(id);
		ModelAndView mav = new ModelAndView("/pay/standard_edit.jsp");
		mav.addObject("salManager", salManager);
		return mav;
	}
	
	//�ύ���
		@RequestMapping("updateSubmit.do")
		public String updateSubmit(@ModelAttribute SalmanagerBean salManager){
			salManager.setAuditState(2);
			salmanagerService.updateUser(salManager);
/*			ModelAndView mav = new ModelAndView("/salmanager/fenye.do");
			mav.addObject("salManager", salManager);
			return mav;*/
			return "redirect:/salmanager/shenpifenye.do";
		}
	//���ͨ����ѯ
	@RequestMapping("updatePass.do")
	public String updatePass(@ModelAttribute SalmanagerBean salManager){
		salManager.setAuditState(4);
		salmanagerService.updateUser(salManager);
		System.out.println("wode]]]\\lfdmlkdfnn dff            ");
	/*	ModelAndView mav = new ModelAndView("/salmanager/fenye.do");
		mav.addObject("salManager", salManager);
		return mav;*/
		return "redirect:/salmanager/fenye.do";
	}
	
	//���ز�ѯ
	@RequestMapping("updateFail.do")
	public String updateFail(@ModelAttribute SalmanagerBean salManager){
		salManager.setAuditState(3);
		salmanagerService.updateUser(salManager);
		
/*		ModelAndView mav = new ModelAndView("/salmanager/fenye.do");
		mav.addObject("salManager", salManager);
		return mav;*/
		return "redirect:/salmanager/fenye.do";
	}
	//н�ʷ��Ź���//��ҳ��ѯ
		@RequestMapping("fafangfenye.do")
		public String listByPageHelperFafang(Model model , @RequestParam(value = "nowPage",defaultValue = "1") Integer nowPage,String salType,Integer auditState){
			Map keys = new HashMap();
			keys.put("salType", salType);
			keys.put("auditState", auditState);
			Page<SalmanagerBean> page = salmanagerService.queryUserByPageHelperFafang(nowPage, 10, keys);
			List<SalmanagerBean> salManagers = page.getResult();
			int pageNum = page.getPageNum();
			int pageSize = page.getPageSize();
			long total = page.getTotal();
			int pages = page.getPages();
			PageUtil pageUtil = new PageUtil<SalmanagerBean>();
			pageUtil.setNowPage(pageNum);
			pageUtil.setPageSize(pageSize);
			pageUtil.setTotalCount(Integer.parseInt(total + ""));
			pageUtil.setTotalPage(pages);

			model.addAttribute("page", page);
			model.addAttribute("pageUtil", pageUtil);
			model.addAttribute("salManagers", salManagers);
			model.addAttribute("keys", keys);
			return "/pay/list_payment.jsp";
		}

	public SalmanagerService getSalmanagerService() {
		return salmanagerService;
	}

	public void setSalmanagerService(SalmanagerService salmanagerService) {
		this.salmanagerService = salmanagerService;
	}
	
}
