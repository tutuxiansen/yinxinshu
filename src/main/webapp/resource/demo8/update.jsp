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

        <title>菜单管理</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》菜单管理</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="/yinxinshu/menu/list.do">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="/yinxinshu/menu/update.do" method="post" >
            <input type="hidden" name="menuId" value="${menu.menuId }">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">菜单名称<span style="color:red">*</span>：</td>
                    <td><input type="text" name="menuName" value="${menu.menuName }" /></td>
                </tr>
                <tr>
                    <td>上级菜单<span style="color:red">*</span>：</td>
                    <td>
                       <select name="menuTop">
        	<c:forEach items="${menus }" var="menu">
        		<option value="${menu.menuId}" <c:if test="${menu.top.menuId == menu.menuId }">selected</c:if>>${menu.menuName }</option>
        	</c:forEach>
        	</select>
                    </td>
                </tr>
				  <tr>
                    <td>URL<span style="color:red">*</span>：</td>
                    <td>
						<input type="text"  name="menuUrl" value="${menu.menuUrl }" />
					</td>
                </tr>
               
                <tr>
                    <td>状态<span style="color:red">*</span>：</td>
                    <td>
						 <select name="menuState">
							<option value="1">启用</option>
							<option value="2">禁用</option>						
						 </select>
					</td>
                </tr>
                <tr>
                    <td>备注：</td>
                    <td>
						<input type="text" name="menuRemark" value="${menu.menuRemark }" />
					</td>
                </tr>
              


				
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="添加">
						<input type="submit" value="清空">
                    </td>
                </tr>  
            </table>
            </form>
        </div>
    </body>
</html>