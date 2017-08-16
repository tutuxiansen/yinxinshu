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

        <title>职位发布登记</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

         <div class="div_head">
            <span>
                <span style="float:left">当前位置是：职位发布管理-》职位发布登记</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="list.html">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="recruit/insertRecruit.do" method="post">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">部门<span style="color:red">*</span>：</td>
                    <td><select name="">
						<option value="">人事部</option>
						<option value="">财务部</option>
						<option selected value="" >技术部</option>
						<option value="">研发部</option>
					</select></td>
                </tr>
                <tr>
                    <td>招聘类型<span style="color:red">*</span>：</td>
                    <td>
                     <select name="recruitType">
						<option value="1">-请选择-</option>
						<option value="2">校园招聘</option>
						<option value="3">社会招聘</option>
					 </select>
                    </td>
                </tr>
               
                <tr>
                    <td>招聘人数<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" name="recruitNum" value="" /></td>
                </tr>
                <tr>
                    <td>职位名称<span style="color:red">*</span>：</td>
                    <td>
						<input type="text"  name="recruitName" value="" />
					</td>
                </tr>
				<tr>
                    <td>职位编码<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" name="recruitCode" value="" />
					</td>
                </tr>
				<tr>
                    <td>职位分类<span style="color:red">*</span>：</td>
                    <td>
						<input type="text"  name="recruitClass" value="" />
					</td>
                </tr>
				<tr>
                    <td>登记人<span style="color:red">*</span>：</td>
                    <td>
						<input type="text"  name="recruitReg" value="" />
					</td>
                </tr>
                <tr>
                    <td>登记时间<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="recruitStarttime"  value="" />
                    </td>
                </tr>
<tr>
                    <td>截止时间<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="recruitDeadline"  value="" />
                    </td>
                </tr>

				<tr>
                    <td>职位描述<span style="color:red">*</span>：</td>
                    <td>
                       <textarea cols="70" rows="12" name="recruitDescribe">  
					
					 
					   </textarea>
                    </td>                
                </tr>

				<tr>
                    <td>招聘要求<span style="color:red">*</span>：</td>
                    <td>
                       <textarea cols="70" rows="12" name="recruitRement"> 
				
					   </textarea>
                    </td>                
                </tr>
				
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value=" 发布 ">
						<input  type="button" class="btn" onclick="window.history.back();" value="返回"/>
                    </td>
                </tr>  
            </table>
            </form>
        </div>
    </body>
</html>