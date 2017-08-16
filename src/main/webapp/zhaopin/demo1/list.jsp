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

        <title>会员列表</title>

        <link href="css/mine.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是：招聘管理-》职位发布管理</span>
                 <span style="float: right; margin-right: 8px; font-weight: bold;">
                    <a style="text-decoration: none;" href="zhaopin/demo1/add.jsp">【添加】</a>
                </span>
            </span>
        </div>
        <div></div>
        <div class="div_search">
            <span>
                <form action="recruit/queryAll.do" method="post">
				 职位名称: 
					<input type="text" name="recruitName" value="" />
                    职位分类: 
					<select name="s_product_mark" style="width: 100px;">

                        <option selected="selected" >-请选择-</option>
						<option value="1">管理</option>
                        <option value="2">技术</option>
						<option value="3">实施</option>
                    </select>
                   
					 登记日期: 
					<input type="text" name="recruitStarttime" value=""/>
                    截止日期:<input type="text" name="recruitDeadline" value="" />
					
					<input value="查询" type="submit" />
					
                </form>
            </span>
			
        </div>
		 <!--  <div style="font-size: 13px; margin: 10px 5px;">
		  <p><a href="add.html"><button style="background-color:#E8F2FC">职位发布登记 </button></a></p>
		  </div> -->
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="100%">
                <tbody><tr style="font-weight: bold;">
                		<td width="40px;">序号</td>
                        <td width="40px;">职位编码</td>
                        <td width="40px;">职位名称</td>						
                        <td width="40px;">职位分类</td>
                        <td width="40px;">所属部门</td>
						<td width="40px;">招聘人数</td>
                        <td width="40px;">登记日期</td>
						<td width="40px;">截止日期</td>						
                        <td align="center" width="70px;">操作</td>
                    </tr>
                    <c:forEach items="${recruits }" var="recruits" varStatus="vs">
                    <tr id="product1">
                    	<td>${vs.count}</td>
                        <td>${recruits.recruitCode }</td>
                        <td><a href="recruit/queryRecruitById.do?id=${recruits.recruitId }">${recruits.recruitName }</a></td>
						<td>${recruits.recruitClass }</td>
                        <%-- <td>${recruits.recruitsDept }</td> --%>
                        <td></td> 
						<td>${recruits.recruitNum}</td> 						
                        <td>${recruits.recruitStarttime }</td>
						<td>${recruits.recruitDeadline }</td>
                        <td><a href="recruit/preUpdate.do?id=${recruits.recruitId }">变更</a> &nbsp;&nbsp;<a href="recruit/deleteByljsc.do?id=${recruits.recruitId }">删除</a> </td>                        
                    </tr> 
                    </c:forEach>
					
                    <tr>
                        <td colspan="8" style="text-align: center;">						
						<a style="text-decoration: none;" href="#">
                            首页 上一页  ... 7 8 9 10 11 12 ... 下一页 尾页 共1234条 每页显示 10/23 </a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
