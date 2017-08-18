package com.xhhy.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
import com.xhhy.service.EmpService;
import com.xhhy.util.PageUtil;

@Controller
@RequestMapping("emp")
public class EmpController {

	@Autowired
	private EmpService service;

	@RequestMapping("queryAll.do")
	public String queryAll(Model model, @ModelAttribute PemaBean emp,
			@RequestParam(value = "nowPage", defaultValue = "1") int nowPage) {

		PageUtil<PemaBean> pageUtil = new PageUtil<PemaBean>();
		pageUtil.setT(emp);
		pageUtil.setNowPage(nowPage);
		pageUtil.setStartNum((nowPage - 1) * pageUtil.getPageSize() + 1);
		pageUtil.setEndNum(nowPage * 5);

		String interView = null;
		List<PemaBean> emps = service.queryEmpByPageUtil(pageUtil);
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

		model.addAttribute("interView", interView);
		model.addAttribute("emps", emps);
		model.addAttribute("pageUtil", pageUtil);

		return "/datamsg/demo1/list.jsp";
	}

	String select;
	String empName;
	String recordState;

	/**
	 *
	 * @param request
	 * @param model
	 * @param emp
	 * @param nowPage
	 * @return
	 */
	@RequestMapping("queryByIf.do")
	public String queryByIf(HttpServletRequest request, Model model, @ModelAttribute PemaBean emp,
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

		if (request.getParameter("resumeName") == null || request.getParameter("resumeName").equals("--请选择---")) {
			if (request.getParameter("resumeName") == null) {
				map.put("empName", empName);
			} else {
				empName = null;
				map.put("empName", empName);
			}
		} else {
			empName = request.getParameter("resumeName");
			map.put("empName", empName);
		}

		if (request.getParameter("recordState") == null || request.getParameter("recordState").equals("--璇烽�夋嫨---")) {

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
		return "/datamsg/demo1/list.jsp";
	}

	/**
	 * 
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
		Map<String, Object> years = new HashMap<String, Object>();
		if (year == null || year.equals("")) {

			for (int i = 0; i < datas.size(); i++) {
				years.put("year" + i, (String) datas.get(i).get("YEAR"));
				if ((String) datas.get(i).get("YEAR") != null && (String) datas.get(i).get("YEAR") != "") {

					years.put("year" + i, (String) datas.get(i).get("YEAR"));
				}

			}

			mav.addObject("years", years);
		} else {
			List<Map<String, Object>> data = service.queryEmpByEducation(new HashMap<String, String>());
			for (int i = 0; i < data.size(); i++) {
				years.put("year" + i, datas.get(i).get("YEAR").toString());
			}
			mav.addObject("years", years);
		}
		mav.addObject("year", year);
		mav.addObject("datas", datas);

		return mav;
	}

	/**
	 * 
	 * @param year
	 * @return
	 */
	@RequestMapping("queryEducationShowDept.do")
	public ModelAndView query(int year, HttpServletRequest request) {

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
		map.put("DEPT", "全部");
		map.put("ALL_MANS", all);
		map.put("BS", bs);
		map.put("SS", ss);
		map.put("BK", bk);
		map.put("ZK", zk);
		datas.add(map);

		mav.addObject("map", map);
		mav.addObject("datas", datas);

		return mav;
	}

	public EmpService getService() {
		return service;
	}

	public void setService(EmpService service) {
		this.service = service;
	}

	@RequestMapping("queryEducationByDept.do")
	public ModelAndView query(@RequestParam(value = "dept") String dept, @RequestParam(value = "year") String year) {

		ModelAndView mav = new ModelAndView("/datamsg/demo2/mingxilist.jsp");
		String deptName = null;
		PemaBean empBean = new PemaBean();
		empBean.setPema_resume(new ResumeBean());
		try {
			deptName = new String(dept.getBytes("iso-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		empBean.getPema_resume().setResumeDept(deptName);

		empBean.setPemaTime(year);
		List<PemaBean> emps = service.queryEmpByDept(empBean);
		
		mav.addObject("emps", emps);

		return mav;
	}

}
