<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language ="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%
	String datetime = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());//获取系统时间
%>
<!doctype html>
<html xmlns="http://www.w3.org/1999/xhtml">
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
    <head>
<base href="<%=basePath%>">

        <meta http-equiv=content-type content="text/html; charset=utf-8" />
        <link href="css/admin.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <table cellspacing=0 cellpadding=0 width="100%" align=center border=0>
            <tr height=28>
                <td background=./img/title_bg1.jpg>当前位置: </td></tr>
            <tr>
                <td bgcolor=#b1ceef height=1></td></tr>
            <tr height=20>
                <td background=./img/shadow_bg.jpg></td></tr></table>
        <table cellspacing=0 cellpadding=0 width="90%" align=center border=0>
            <tr height=100>
                <td align=middle width=100>
					<img height=100 src="./img/admin_p.gif"  width=90>
				</td>
                <td width=60>&nbsp;</td>
                <td>
                    <table height=100 cellspacing=0 cellpadding=0 width="100%" border=0>

                        <tr>
                         <td>当前时间：
                         <input id="showTime" readnoly/>  
<script type="text/javascript">    
function getNowTime(){   
	var now = new Date();           
	document.getElementById("showTime").value  =now.getFullYear()+"-"+(now.getMonth()+1)+"-"+now.getDate();  
	document.getElementById("showTime").value+=" "+now.getHours()+":"+now.getMinutes()+":"+now.getSeconds(); } 
	window.setInterval("getNowTime()",1000);
 </script>  
                         </td>
						</tr>
                        <tr>
                            <td style="font-weight: bold; font-size: 16px">${sessionScope.loginUser.userName}</td>
						</tr>
                        <tr>
                            <td>欢迎进入网站管理中心！</td></tr></table></td>
						</tr>
            <tr>
         <td colspan=3 height=10></td></tr></table>
        <table cellspacing=0 cellpadding=0 width="95%" align=center border=0>
            <tr height=20>
                <td></td></tr>
            <tr height=22>
                <td style="padding-left: 20px; font-weight: bold; color: #ffffff" 
                    align=middle background=./img/title_bg2.jpg>个人信息</td></tr>
            <tr bgcolor=#ecf4fc height=12>
                <td></td></tr>
            <tr height=20>
                <td></td></tr></table>
        <table cellspacing=0 cellpadding=2 width="95%" align=center border=0>
            <tr>
                <td align=right width=100>登陆帐号：</td>
                <td style="color: #880000">${sessionScope.loginUser.userUserName}</td></tr>
            <tr>
                <td align=right>真实姓名：</td>
                <td style="color: #880000">${sessionScope.loginUser.userName}</td></tr>
            <tr>
                <td align=right>注册时间：</td>
                <td style="color: #880000"><% out.print(new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date())); %></td></tr>
            <tr>
                <tr>
                <td align=right>登陆次数：</td>
                <td style="color: #880000">${sessionScope.count}</td></tr>

            <tr>
            <tr>
                <td align=right>上线时间：</td>
                <td style="color: #880000"><% out.print(new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date())); %></td></tr>
            <tr>
                <td align=right>ip地址：</td>
                <td style="color: #880000"> 192.168.0.1 </td></tr>
            <tr>
                <td align=right>身份过期：</td>
                <td style="color: #880000">30 分钟</td>
			</tr>
        </table>		
<div style="text-align:center;">
<p>维护信息：<a href="http://www.zparkedu.com" target="_blank">薪火华扬（北京）科技有限公司</a></p>
<p>联系电话：<a href="http://www.zparkedu.com" target="_blank">17710208155</a></p>
</div>
    </body>
</html>