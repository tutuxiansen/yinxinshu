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

        <title>薪酬标准管理</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：招聘管理》职位发布管理-》查看职位信息</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="recruit/queryAll.do">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="./admin.php?c=goods&a=add" method="post" enctype="multipart/form-data">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">部门：</td>
                    <td>
						<input type="text" value=""/>
					</td>
                </tr>
                <tr>
                    <td>招聘类型：</td>
                    <td>
                    
                    
					<select name="recruitType" >
						<c:if test="${recruit.recruitType==2 }">
                    			<option>社会招聘</option>
                    	</c:if>
						<c:if test="${recruit.recruitType==3 }">
                    			<option>校园招聘</option>
                    	</c:if>
					</select>
					</td>
                </tr>
                <tr>
                    <td>招聘人数：</td>
                     <td>
					<input type="text" readonly value="${recruit.recruitNum }" >	
					</td>
                </tr>
                <tr>
                    <td>职位名称：</td>
                     <td>
						<input type="text" readonly value="${recruit.recruitName }">
					</td>
                </tr>
                <tr>
                    <td>职业编码：</td>
                     <td>
						<input type="text" readonly value="${recruit.recruitCode }">
					</td>
                </tr>
                <tr>
                    <td>职位分类：</td>
                     <td>
						
							<input type="text" readonly value="${recruit.recruitClass }">
						
					</td>
                </tr>


				<tr>
                    <td>登记人：</td>
                     <td>
						<input type="text" readonly value="${recruit.recruitReg }">
					</td>               
                </tr>

				<tr>
                    <td>登记时间：</td>
                     <td>
						
						<input type="text" readonly value="${recruit.recruitStarttime }">
					</td>                
                </tr>

				<tr>
                    <td>截止日期：</td>
                    <td>
                        <input type="text" readonly value="${recruit.recruitDeadline }">
                    </td>                
                </tr>

				<tr>
                    <td>职位描述：</td>
                    <td>
                       <textarea cols="70" rows="12">
					   ${recruit.recruitDescribe }
					   </textarea>
                    </td>                
                </tr>

				<tr>
                    <td>招聘要求：</td>
                    <td>
                       <textarea cols="70" rows="12">
					  技能要求：
						${recruit.recruitRement }
					   </textarea>
                    </td>                
                </tr>
				 <!-- <tr>
                    <td colspan="2" align="center"> 
						<input  type="button" class="btn" onclick="window.history.back();" value="返回"/>
                    </td>
                </tr> --> 
            </table>
            </form>
        </div>
    </body>
</html>