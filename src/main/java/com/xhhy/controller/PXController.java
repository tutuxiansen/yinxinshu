package com.xhhy.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.Page;
import com.xhhy.dao.PXDao;
import com.xhhy.domain.PXBean;
import com.xhhy.service.PXService;
import com.xhhy.util.FileNameUtils;
import com.xhhy.util.PageUtil;

@Controller
@RequestMapping("px")
public class PXController {
	@Autowired
	private PXService pXService;

	public PXService getpXService() {
		return pXService;
	}

	public void setpXService(PXService pXService) {
		this.pXService = pXService;

	}

	/*
	 * @RequestMapping("list2.do") public ModelAndView listPX() { List<PXBean>
	 * pxs = pXService.queryAll();
	 * 
	 * ModelAndView mav = new ModelAndView("/peixun/peixunjihua/list.jsp");
	 * mav.addObject("pxs", pxs); return mav; }
	 */
	// ================================================================================
	// 培训计划
	// 用插件查询，，，带带分页和条件过滤
	@RequestMapping("list.do")
	public String listPageHelper(Model model, @RequestParam(value = "nowPage", defaultValue = "1") Integer nowPage,
			String pxName, String pxShzt, String pxTime, String pxEnd,String pxStatus) {
		Map keys = new HashMap();
		keys.put("pxName", pxName);
		keys.put("pxDel", 1);
		keys.put("pxShzt", pxShzt);
		keys.put("pxTime", pxTime);
		keys.put("pxEnd", pxEnd);
		
		keys.put("pxStatus", pxStatus);
		Page<PXBean> page = pXService.queryByPageHelper(nowPage, 5, keys);
		List<PXBean> pxs = page.getResult();

		int pageNum = page.getPageNum();
		int pageSize = page.getPageSize();
		long total = page.getTotal();
		int pages = page.getPages();

		PageUtil pageUtil = new PageUtil<PXBean>();
		pageUtil.setNowPage(pageNum);
		pageUtil.setPageSize(pageSize);
		pageUtil.setTotalCount(Integer.parseInt(total + ""));
		pageUtil.setTotalPage(pages);

		model.addAttribute("page", page);
		model.addAttribute("pxs", pxs);
		model.addAttribute("pageUtil", pageUtil);
		model.addAttribute("keys", keys);
		return "/peixun/peixunjihua/list.jsp";
	}

	// 添加
	@RequestMapping("insertPX.do")
	public ModelAndView insertPX(@ModelAttribute PXBean px,@RequestParam(value="ziliao") MultipartFile pxZiliao) {
		String oName = pxZiliao.getOriginalFilename();
		String extension = oName.substring(oName.lastIndexOf(".") + 1);
		String fileName = FileNameUtils.randomFileName(extension);
		px.setPxZiliao(fileName);
		pXService.insertPX(px);
		try {
			InputStream in  = pxZiliao.getInputStream();
			OutputStream out = new FileOutputStream("d:/upload/" + fileName);
			 
			FileCopyUtils.copy(in, out);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ModelAndView mav = new ModelAndView("/px/list.do");
		return mav;
	}

	// /list的修改
	@RequestMapping("preXiugai.do")
	public ModelAndView preXiugai(int id) {
		PXBean px = pXService.queryPXById(id);
		ModelAndView mav = new ModelAndView("/peixun/peixunjihua/update.jsp");
		mav.addObject("px", px);
		return mav;
	}

	@RequestMapping("xuigai.do")
	public ModelAndView xuigai(@ModelAttribute PXBean px) {
		System.out.println("==-=-=-=-");
		pXService.updatePX2(px);
		ModelAndView mav = new ModelAndView("/px/list.do");
		mav.addObject("px", px);
		return mav;
	}

	// 查看
	@RequestMapping("view.do")
	public ModelAndView view(int id) {
		PXBean px = pXService.queryPXById(id);
		ModelAndView mav = new ModelAndView("/peixun/peixunjihua/view.jsp");
		mav.addObject("px", px);
		return mav;
	}

	// 删除
	@RequestMapping("delete.do")
	public ModelAndView delete(int id) {
		pXService.deletePX(id);
		ModelAndView mav = new ModelAndView("/px/list.do");
		return mav;
	}

	// 提交审核
	@RequestMapping("insertPX2.do")
	public ModelAndView insertPX2(Model model, @ModelAttribute PXBean px) {
		System.out.println(px.getPxName());
		pXService.insertPX(px);
		return this.update(px);
	}

	/*
	 * @RequestMapping("preUpdateQiCao.do") public String preUpdate (Model
	 * model,@ModelAttribute PXBean px) { int id = px.getPxId(); PXBean pxx =
	 * pXService.queryPXById(id); model.addAttribute("px",pxx); ModelAndView mav
	 * = new ModelAndView("px/updateQicao.do");
	 * System.out.println("1111111111111");
	 * 
	 * return "/px/updateQicao.do"; }
	 */
	@RequestMapping("updateQicao.do")
	public ModelAndView update(@RequestParam PXBean px) {

		pXService.updatePX(px);
		ModelAndView mav = new ModelAndView("/px/list.do");

		return mav;
	}

	//////////////////////////////////////////////////////////////////////////////////////////
	//===================================培训复核==========================
	
	@RequestMapping("list2.do")
	public String listPageHelper2(Model model, @RequestParam(value = "nowPage", defaultValue = "1") Integer nowPage,
			String pxName) {
		Map keys = new HashMap();
		keys.put("pxName", pxName);
		keys.put("pxStatus",2);
		keys.put("pxDel",1);
		Page<PXBean> page = pXService.queryByPageHelper2(nowPage, 5, keys);
		List<PXBean> pxs = page.getResult();

		int pageNum = page.getPageNum();
		int pageSize = page.getPageSize();
		long total = page.getTotal();
		int pages = page.getPages();

		PageUtil pageUtil = new PageUtil<PXBean>();
		pageUtil.setNowPage(pageNum);
		pageUtil.setPageSize(pageSize);
		pageUtil.setTotalCount(Integer.parseInt(total + ""));
		pageUtil.setTotalPage(pages);

		model.addAttribute("page", page);
		model.addAttribute("pxs", pxs);
		model.addAttribute("pageUtil", pageUtil);
		model.addAttribute("keys", keys);
		return "/peixun/peixunfuhe/list.jsp";
	}
//=============// 审核通过
	   
		//修改前（OID查询）
		@RequestMapping("preXiugai2.do")
		public ModelAndView preXiugai2(int id) {
			PXBean px = pXService.queryPXById(id);
			ModelAndView mav = new ModelAndView("/peixun/peixunfuhe/shenhetongguo.jsp");
			mav.addObject("px", px);
			return mav;
		}
		/* // 添加
		@RequestMapping("insertPX3.do")
		public ModelAndView insertPX3(Model model, @ModelAttribute PXBean px) {
			System.out.println(px.getPxName());
			pXService.insertPX2(px);
			return this.update(px);
		}*/
        //修改
		@RequestMapping("xuigai3.do")
		public ModelAndView xuigai3(@ModelAttribute PXBean px) {
			System.out.println("==-=-=-=-");
			pXService.updatePX3(px);
			ModelAndView mav = new ModelAndView("/px/list2.do");
			mav.addObject("px", px);
			return mav;
		}
//=============// 驳回	
		//修改
				@RequestMapping("xuigai4.do")
				public ModelAndView xuigai4(@ModelAttribute PXBean px) {
					System.out.println("==-=-=-=-");
					pXService.updatePX4(px);
					ModelAndView mav = new ModelAndView("/px/list2.do");
					mav.addObject("px", px);
					return mav;
				}
//======================培训考核和反馈
				@RequestMapping("list3.do")
				public String listPageHelper3(Model model, @RequestParam(value = "nowPage", defaultValue = "1") Integer nowPage,
						String pxName) {
					Map keys = new HashMap();
					keys.put("pxName", pxName);
					keys.put("pxStatus",3);
					keys.put("pxDel",1);
					Page<PXBean> page = pXService.queryByPageHelper3(nowPage, 5, keys);
					List<PXBean> pxs = page.getResult();

					int pageNum = page.getPageNum();
					int pageSize = page.getPageSize();
					long total = page.getTotal();
					int pages = page.getPages();

					PageUtil pageUtil = new PageUtil<PXBean>();
					pageUtil.setNowPage(pageNum);
					pageUtil.setPageSize(pageSize);
					pageUtil.setTotalCount(Integer.parseInt(total + ""));
					pageUtil.setTotalPage(pages);

					model.addAttribute("page", page);
					model.addAttribute("pxs", pxs);
					model.addAttribute("pageUtil", pageUtil);
					model.addAttribute("keys", keys);
					return "/peixun/peixunfankui/list.jsp";
				}		
	//==培训反馈
				//修改前（OID查询)
				@RequestMapping("preXiugai3.do")
				public ModelAndView preXiugai3(int id) {
					PXBean px = pXService.queryPXById(id);
					ModelAndView mav = new ModelAndView("/peixun/peixunfankui/fankui.jsp");
					mav.addObject("px", px);
					return mav;
				}		
				 //修改
				@RequestMapping("xuigai5.do")
				public ModelAndView xuigai5(@ModelAttribute PXBean px) {
					System.out.println("==-=-=-=-");
					pXService.updatePX5(px);
					ModelAndView mav = new ModelAndView("/px/list3.do");
					mav.addObject("px", px);
					return mav;
				}
//============================个人信息==============================================
				
	
				
				
}
