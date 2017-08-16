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

        <title>职位管理</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》职位管理</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="/yinxinshu/position/list.do">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="/yinxinshu/position/add.do" method="post" >
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">职位编码<span style="color:red">*</span>：</td>
                    <td><input type="text" name="positionCode" value="ZW-" /></td>
                </tr>
                <tr>
                    <td>职位名称<span style="color:red">*</span>：</td>
                    <td><input type="text" name="positionName" value="" /></td>
                </tr>
                <tr>
                    <td>职位分类<span style="color:red">*</span>：</td>
                    <td>
						<select name="positionClass">
							<option value="1">管理</option>
							<option value="2">技术</option>
							<option value="3">实施</option>						
						 </select>
					</td>
                </tr>
                <tr>
                    <td>所属部门<span style="color:red">*</span>：</td>
                    <td>
                       
						 <select name="deptId">
			<c:forEach items="${depts }" var="dept">
				<option value="${dept.deptId }">${dept.deptSimplicityName }</option>
			</c:forEach>
			</select>
                    </td>
                </tr>
				
				<tr>
                    <td>菜单权限<span style="color:red">*</span>：</td>
                    <td>
                        
						 
                    </td>
                </tr>


				<tr>
                    <td>职位描述<span style="color:red">*</span>：</td>
                    <td>
                        <textarea name="positionDescribe"></textarea>
                    </td>                
                </tr>

				<tr>
                    <td>备       注：</td>
                    <td>
                        <textarea name="positionRemark"></textarea>
                    </td>                
                </tr>
				<tr>
                    <td>是否启用：</td>
                    <td>
                        <select name="positionState">
							<option value="1">启用</option>
							<option value="2">禁用</option>						
						 </select>
                    </td>                
                </tr>
				
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="添加">
						<input type="reset" value="清空">
                    </td>
                </tr>  
            </table>
            </form>
        </div>
    </body>
</html>