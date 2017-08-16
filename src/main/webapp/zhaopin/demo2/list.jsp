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

        <title>简历管理</title>

        <link href="/css/mine.css" type="text/css" rel="stylesheet" />
    </head>
    
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是：招聘管理-》简历管理</span>
                <span style="float: right; margin-right: 8px; font-weight: bold;">
                    <a style="text-decoration: none;" href="zhaopin/demo2/add.jsp">【添加】</a>
                </span>
            </span>
        </div>
        <div></div>
         <div class="div_search">
            <span>
                <form action="" method="post">
					姓名: 
					<input type="text" size="10px" />
					 应聘职位: 
					<input type="text" size="20px" />
					工作经验: 
					<input type="text" size="10px" />
					登记日期: 
					<input type="text" size="20px" />
                    <input value="查询" type="submit" />
					
                </form>
            </span>
        </div>
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="100%">
                <tbody><tr style="font-weight: bold;">
                		<td width="20px;">序号</td>
                        <td width="50px;">姓名</td>
                        <td width="30px;">性别</td>						
                        <td width="80px;">毕业院校</td>
                        <td width="40px">学历</td>
						<td width="30px">专业</td>
						<td width="100px;">应聘职位</td>
                        <td width="40px;">工作经验</td> 
						<td width="70px;">登记日期</td>
						
                        <td align="center" width="100px;">操作</td>
                    </tr>
                    
				<c:forEach items="${resume }" var="resume" varStatus="vs">
                    <tr id="product1">
                    	<td>${vs.count }</td>
                        <td><a href="resume/queryResumeById.do?id=${resume.resumeId }">${resume.resumeName }</a></td>
                        <td>${resume.resumeGender }</td>
						<td>${resume.resumeCollege }</td>
                        <td>${resume.resumeEducation }</td> 
						<td>${resume.resumeMajor }</td> 						
                        <td>${resume.resumePosition }</td>
						<td>${resume.resumeExperience }</td>
						<td>${resume.resumeTime }</td>
						
                        <td>
							<a href="resume/preUpdate.do?id=${resume.resumeId }">修改</a>						   
							<a href="resume/resumeByljsc.do?id=${resume.resumeId }">删除</a>
							<select name="interviewType">
							<option value="0">存档</option>
							<option value="1">推荐面试</option>
							<option value="2">推荐二面</option>
							<option value="3">推荐三面</option>
							<option value="4">建议录用</option>
							<option value="5">录用</option>
							<option>删除</option>
						</select>
							<a href="resume/updateType.do?id=${resume.resumeId }">提交建议</a>
						</td>                        
				</c:forEach>
                    <tr>
                    
                        <td colspan="10" style="text-align: center;">						
						<a style="text-decoration: none;" href="#">
                            首页 上一页  ... 7 8 9 10 11 12 ... 下一页 尾页 共1234条 每页显示 10/23 </a>
                        </td>
                    </tr>
                </tbody>
               
            </table>
            
        </div>
    </body>
</html>