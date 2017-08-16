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

        <meta http-equiv=content-type content="text/html; charset=utf-8" />
        <link href="./css/admin.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <table cellspacing=0 cellpadding=0 width="100%"  background="./img/header_bg.jpg" border=0>
            <tr height=56>
                <td width=520 style="font-size:28px;color:white">
					银杏树信息技术服务(北京)有限公司
				</td>
                <td style="font-weight: bold; color: #fff; padding-top: 20px" 
                    align=middle>当前用户：${sessionScope.loginUser.userName} &nbsp;&nbsp; 
					<a style="color: #fff"  href="/yinxinshu/password.jsp"  target=main>修改口令</a> 
					&nbsp;&nbsp; 
					<a style="color: #fff"  href="/yinxinshu/logint.jsp" target=_top>退出系统</a> 
														<!-- onclick="if (confirm('确定要退出吗？')) return true; else return false;"  -->
                </td>
                <td align=right width=268><a href="index.html"><img height=56 src="./img/header_right.jpg" width=268></a></td>
               	    </tr>
               </table>
      <table cellspacing=0 cellpadding=0 width="100%" border=0>
            <tr bgcolor=#1c5db6 height=4>
                <td></td>
            </tr>
        </table>
    </body>
</html>