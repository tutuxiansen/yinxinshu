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

        <title>薪酬标准管理</title>

        <link href="css/mine.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是：系统管理-》菜单管理</span>
                <span style="float: right; margin-right: 8px; font-weight: bold;">
                    <a style="text-decoration: none;" href="/yinxinshu/menu/preAdd.do">【添加】</a>
					<a style="text-decoration: none;" href="/yinxinshu/menu/delete.do">【删除】</a>
                </span>
            </span>
        </div>
        <div></div>
        <div class="div_search">
            <span>
                <form action="/yinxinshu/menu/list.do" method="post">
                    菜单名称: 
					<input type="text" name="menuName"  />
					 状态: 
					<select>
						<option></option>
						<option>启用</option>
						<option>禁用</option>
					
					</select>
                    <input value="查询" type="submit" />
					
                </form>
            </span>
        </div>
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="100%">
                <tbody><tr style="font-weight: bold;">
                        <td width="40px;">序号</td>
                        <td width="30px;"><input type="checkbox" /></td>						
                        <td width="80px;">菜单名称</td>
                        <td >URL</td>
						<td width="100px;">状态</td>
                        
                        <td align="center" width="100px;">操作</td>
                    </tr>
					<c:forEach items="${menus }" var="menu">
                    <tr id="product1">
                        <td>${menu.menuId }</td>
                        <td><input type="checkbox" /></td>
						<td>${menu.menuName }</td>
                        <td><a href="/yinxinshu/menu/view.do?id=${menu.menuId }">${menu.menuUrl }</a></td> 
						
						<c:if test="${menu.menuState == 1}"><td>启用</td></c:if> 
						<c:if test="${menu.menuState == 2}"><td>禁用</td></c:if>					
                        <td>
							<a href="/yinxinshu/menu/preUpdate.do?id=${menu.menuId }">修改</a>						   
							<a href="/yinxinshu/menu/delete.do?id=${menu.menuId }">删除</a>
						</td>                        
                    </tr> 
					</c:forEach>
                    <tr>
                        <td colspan="20" style="text-align: center;">						
						<a style="text-decoration: none;" href="#">
                           <a href="/yinxinshu/menu/list.do?nowPage=1&menuName=${keys.menuName }">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="/yinxinshu/menu/list.do?nowPage=${pageUtil.nowPage - 1 }&menuName=${keys.menuName}">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="/yinxinshu/menu/list.do?nowPage=${pageUtil.nowPage + 1 }&menuName=${keys.menuName}">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="/yinxinshu/menu/list.do?nowPage=${pageUtil.totalPage }&menuName=${keys.menuName}">尾页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	当前页 ${pageUtil.nowPage }&nbsp;&nbsp;&nbsp;&nbsp;
	分页单位${pageUtil.pageSize }&nbsp;&nbsp;&nbsp;&nbsp;
	总页数${pageUtil.totalPage }&nbsp;&nbsp;&nbsp;&nbsp;
	总条数${pageUtil.totalCount }</a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>