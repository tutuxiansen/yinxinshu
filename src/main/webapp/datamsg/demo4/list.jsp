<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html xmlns="http://www.w3.org/1999/xhtml">
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
    <head>
<base href="<%=basePath%>">

        <meta http-equiv="content-type" content="text/html; charset=UTF-8" />

        <title>数据分析</title>

        <link href="../../css/mine.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
			td{
				width:11%;
				height:35px;
				text-align:center}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是： 数据分析》》》储备人才统计表</span>
               
            </span>
        </div>
        <div></div>
        <div class="div_search">
            <span>
                <form action="reser/queryByName.do" method="post">
                  	 员工姓名： 
					<input name="name" type="text"  />
					 
                    <input value="查询" type="submit" />
					
                </form>
            </span>
        </div>
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="100%">
                <tbody><tr style="font-weight: bold; background-color:#06F">
                       <td>姓名</td>
                        <td>性别</td>
                         <td>电话</td>
                          <td>专业</td>
                           <td>学历</td>
                            <td>学校</td>
                             <td>工作经验</td>
                              <td>是否应聘过本公司</td>
                               <td></td>   
                    </tr>

					<c:forEach items="${emps}" var ="emp">
					<tr id="product1">
						<td>${emp.pema_resume.resumeName}</td>
						<td>${emp.pema_resume.resumeGender}</td>
						<td>${emp.pema_resume.resumePhone}</td>
						<td>${emp.pema_resume.resumeMajor}</td>
						<td>${emp.pema_resume.resumeEducation}</td>
						<td>${emp.pema_resume.resumeCollege}</td>
						<td>${emp.pema_resume.resumeExperience}</td>
						<td>暂无</td>
					</tr>
				</c:forEach>
				<tr>
					<td colspan="20" style="text-align: center;">
					<c:if test="${pageUtil.nowPage > 1}">
						<a href="reser/queryByName.do?nowPage=1&userName=${emp.pema_resume.resumeName }">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
					</c:if>
					<c:if test="${pageUtil.nowPage <= 1}">
						首页&nbsp;&nbsp;&nbsp;&nbsp;
					</c:if>
					<c:if test="${pageUtil.nowPage > 1}">
						<a href="reser/queryByName.do?nowPage=${pageUtil.nowPage - 1 }&empName=${emp.pema_resume.resumeName}">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
					</c:if>
					<c:if test="${pageUtil.nowPage <= 1}">
						上一页&nbsp;&nbsp;&nbsp;&nbsp;
					</c:if>
					<c:if test="${pageUtil.nowPage < pageUtil.totalPage}">
						<a href="reser/queryByName.do?nowPage=${pageUtil.nowPage + 1 }&empName=${emp.pema_resume.resumeName}">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
					</c:if>
					<c:if test="${pageUtil.nowPage >= pageUtil.totalPage}">
						下一页&nbsp;&nbsp;&nbsp;&nbsp;
					</c:if>
					
					<c:if test="${pageUtil.nowPage < pageUtil.totalPage}">
						<a href="reser/queryByName.do?nowPage=${pageUtil.totalPage }&empName=${emp.pema_resume.resumeName}">尾页</a>&nbsp;&nbsp;&nbsp;&nbsp;
					</c:if>
					<c:if test="${pageUtil.nowPage >= pageUtil.totalPage}">
						尾页&nbsp;&nbsp;&nbsp;&nbsp;
					</c:if>
					共${pageUtil.totalCount }条 每页显示${pageUtil.pageSize }&nbsp;  
					 ${pageUtil.nowPage }/${pageUtil.totalPage }</td>
				</tr>
                </tbody>
            </table>
        </div>
    </body>
</html>