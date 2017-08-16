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

        <title>用户管理</title>

        <link href="css/mine.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是：系统管理-》用户管理</span>
                <span style="float: right; margin-right: 8px; font-weight: bold;">
                    <a style="text-decoration: none;" href="/yinxinshu/user/preAdd.do">【添加】</a>
					<a style="text-decoration: none;" href="#">【删除】</a>
                </span>
            </span>
        </div>
        <div></div>
        <div class="div_search">
            <span>
                <form action="/yinxinshu/user/listUser.do" method="post">
                     姓名：
					<input type="text" name="userName"/>
					 角色: 
					<input type="text"  />
					 所属部门: 
					<input type="text"  />
                    <input value="查询" type="submit" />
					
                </form>
            </span>
        </div>
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="100%">
                <tbody>
						<tr style="font-weight: bold;">						
                        <td width="40px;">序号</td>
                        <td width="30px;"><input type="checkbox" /></td>						
						<td width="80px;">账号</td>
                        <td width="80px;">姓名</td>
                        <td >角色</td>
						<td width="100px;">所属部门</td>                                        
                        <td align="center" width="100px;">操作</td>
                    </tr>
			<c:forEach items="${users }" var="user">
                    <tr id="product1">
                        <td>${user.userId}</td>
                        <td><input type="checkbox" /></td>
						<td>${user.userUserName}</td>
                        <td><a href="/yinxinshu/user/view.do?id=${user.userId }">${user.userName }</a></td> 
						<td>${user.positionBean.positionName }</td> 	
						<td>${user.deptBean.deptName }</td> 						                        
                        <td>
							<a href="/yinxinshu/user/preUpdate.do?id=${user.userId}">修改</a>						   
							<a href="/yinxinshu/user/deleteByIdUser.do?id=${user.userId}">删除</a>
						</td>                        
                    </tr> 
			</c:forEach>
					
                    <tr>
                        <td colspan="20" style="text-align: center;">						
						<a style="text-decoration: none;" href="#"></a>
    <a href="/yinxinshu/user/listUser.do?nowPage=1&userName=${keys.userName }">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="/yinxinshu/user/listUser.do?nowPage=${pageUtil.nowPage - 1 }&userName=${keys.userName}">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="/yinxinshu/user/listUser.do?nowPage=${pageUtil.nowPage + 1 }&userName=${keys.userName}">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="/yinxinshu/user/listUser.do?nowPage=${pageUtil.totalPage }&userName=${keys.userName}">尾页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	当前页 ${pageUtil.nowPage }&nbsp;&nbsp;&nbsp;&nbsp;
	分页单位${pageUtil.pageSize }&nbsp;&nbsp;&nbsp;&nbsp;
	总页数${pageUtil.totalPage }&nbsp;&nbsp;&nbsp;&nbsp;
	总条数${pageUtil.totalCount }
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>