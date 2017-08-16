package com.xhhy.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.jdbc.Null;
import org.apache.ibatis.mapping.VendorDatabaseIdProvider;
import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sun.org.apache.bcel.internal.generic.Select;
import com.sun.org.apache.regexp.internal.recompile;
import com.xhhy.domain.EmpBean;
import com.xhhy.service.EmpService;
import com.xhhy.util.PageUtil;

@Controller
@RequestMapping("emp")
public class EmpController {

	@Autowired
	private EmpService service;

	@RequestMapping("queryAll.do")
	public String queryAll(Model model, @ModelAttribute EmpBean emp,
			@RequestParam(value = "nowPage", defaultValue = "1") int nowPage) {
		PageUtil<EmpBean> pageUtil = new PageUtil<EmpBean>();
		pageUtil.setNowPage(nowPage);
		pageUtil.setStartNum((nowPage - 1) * pageUtil.getPageSize() + 1);
		pageUtil.setEndNum(nowPage * 5);
		List<EmpBean> emps = service.queryEmpByPageUtil(pageUtil);

		model.addAttribute("emps", emps);
		model.addAttribute("pageUtil", pageUtil);
		return "/datamsg/demo1/list.jsp";
	}

	String select;
	String empName;
	String recordState;

	/**
	 * 条件查询
	 * @param request
	 * @param model
	 * @param emp
	 * @param nowPage
	 * @return
	 */
	@RequestMapping("queryByIf.do")
	public String queryByIf(HttpServletRequest request, Model model, @ModelAttribute EmpBean emp,
			@RequestParam(value = "nowPage", defaultValue = "1") int nowPage) {
		Map map = new HashMap();

		if (request.getParameter("select") == null || request.getParameter("select").equals("--请选择---")) {
			if (request.getParameter("select") == null) {
				map.put("deptName", select);
			} else {
				select = null;
				map.put("deptName", select);
			}
		} else {
			
			select = request.getParameter("select");
			map.put("deptName", select);
		}

		if (request.getParameter("empName") == null || request.getParameter("empName").equals("--请选择---")) {
			if (request.getParameter("empName") == null) {
				map.put("empName", empName);
			} else {
				empName = null;
				map.put("empName", empName);
			}
		} else {
			empName = request.getParameter("empName");
			map.put("empName", empName);
		}

		if (request.getParameter("recordState") == null || request.getParameter("recordState").equals("--请选择---")) {

			if (request.getParameter("recordState") == null) {

				map.put("empRecordState", recordState);
			} else {
				recordState = null;
				map.put("empRecordState", recordState);
			}
		} else {
			recordState = request.getParameter("recordState");
			map.put("empRecordState", recordState);
		}

		Page<EmpBean> page = service.queryEmpByPageHelper(nowPage, 5, map);
		List<EmpBean> emps = page.getResult();

		int pageNum = page.getPageNum();
		int pageSize = page.getPageSize();
		long total = page.getTotal();
		int pages = page.getPages();
		PageUtil pageUtil = new PageUtil<EmpBean>();
		pageUtil.setNowPage(pageNum);
		pageUtil.setPageSize(pageSize);
		pageUtil.setTotalCount(Integer.parseInt(total + ""));
		pageUtil.setTotalPage(pages);

		model.addAttribute("page", page);

		model.addAttribute("pageUtil", pageUtil);
		model.addAttribute("emp", emp);
		model.addAttribute("map", map);

		model.addAttribute("emps", emps);
		return "/datamsg/demo1/list.jsp";
	}

	/**
	 * 第二个模块 根据年查询 学历人数
	 * 
	 * @return
	 */
	@RequestMapping("queryEducation.do")
	public ModelAndView query(HttpServletRequest request) {

		
		ModelAndView mav = new ModelAndView("/datamsg/demo2/list.jsp");

		Map<String, String> maps = new HashMap<String, String>();
		
		String year = request.getParameter("year");
		
		maps.put("year", year);
		List<Map<String, Object>> datas = service.queryEmpByEducation(maps);
		
		if (year == null || year.equals("")) {
			Map<String, String> years = new HashMap<String, String>();
			for (int i = 0; i < datas.size(); i++) {
				years.put("year"+i, (String) datas.get(i).get("YEAR"));
			}
			mav.addObject("years",years);
		}else{
			List<Map<String, Object>> data  = service.queryEmpByEducation(new HashMap<String, String>());
			Map<String, String> years = new HashMap<String, String>();
			for (int i = 0; i < data.size(); i++) {
				years.put("year"+i, (String) data.get(i).get("YEAR"));
			}
			mav.addObject("years",years);
		}
		
		mav.addObject("year",year);
		mav.addObject("datas", datas);

		return mav;
	}
	/**
	 * 第二个模块  统计
	 * @param year
	 * @return
	 */
	@RequestMapping("queryEducationShowDept.do")
	public ModelAndView query(int year,HttpServletRequest request) {

		String deptName = (String) request.getParameter("dept");
		
		int all = 0;
		int bs = 0;
		int ss = 0;
		int bk = 0;
		int zk = 0;

		ModelAndView mav = new ModelAndView("/datamsg/demo2/zilist.jsp");

		Map<String, Object> maps = new HashMap<String, Object>();
		
		maps.put("year", year);
		maps.put("deptName", deptName);
		System.out.println(year);
		List<Map<String, Object>> datas = service.queryEmpByEducationShowDept(maps);
		int length = datas.size();

		for (Map<String, Object> map : datas) {
			all += Integer.parseInt(map.get("ALL_MANS").toString());
			bs += Integer.parseInt(map.get("BS").toString());
			ss += Integer.parseInt(map.get("SS").toString());
			bk += Integer.parseInt(map.get("BK").toString());
			zk += Integer.parseInt(map.get("ZK").toString());
		}

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("year", year);
		map.put("DEPT", "总数");
		map.put("ALL_MANS", all);
		map.put("BS", bs);
		map.put("SS", ss);
		map.put("BK", bk);
		map.put("ZK", zk);
		datas.add(map);
		
		mav.addObject("map",map);
		mav.addObject("datas", datas);

		return mav;
	}

	
	@RequestMapping("queryEducationByDept.do")
	public ModelAndView query(@RequestParam(value = "dept")String dept,@RequestParam(value = "year") String year){
		
		
		ModelAndView mav = new ModelAndView("/datamsg/demo2/mingxilist.jsp");
		String deptName = null;
		EmpBean empBean = new EmpBean();
		try {
			deptName = new String(dept.getBytes("iso-8859-1"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
			
		empBean.setDeptName(deptName);
		
		empBean.setCreateYear(year);
		System.out.println(empBean);
		List<EmpBean> emps = service.queryEmpByDept(empBean);
		System.out.println(emps.size());
		for (EmpBean empBean1 : emps) {
			System.out.println( " -->" + empBean1);
		}
		mav.addObject("emps",emps);
		
		return mav;
	}
	
	
	
	public EmpService getService() {
		return service;
	}

	public void setService(EmpService service) {
		this.service = service;
	}

}
