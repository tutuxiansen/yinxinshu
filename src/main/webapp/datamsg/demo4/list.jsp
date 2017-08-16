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

					<c:forEach items="${beans}" var ="bean">
					<tr id="product1">
						<td>${bean.empName}</td>
						<td>${bean.empGender}</td>
						<td>${bean.empTel}</td>
						<td>${bean.empProfession}</td>
						<td>${bean.empEducation}</td>
						<td>${bean.empScholl}</td>
						<td>${bean.empWorkExperience}</td>
						<td>${bean.empAppointed}</td>
					</tr>
				</c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>