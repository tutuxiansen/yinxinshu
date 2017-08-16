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

        <title>个人信息</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：工作平台-》个人信息</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="./admin.php?c=goods&a=showlist">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="px/updateRen.do" method="post" enctype="multipart/form-data">
            <input type="hidden" name="userId" value="${sessionScope.loginUser.userId}">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px">姓名</td>
                    <td>
						<input type="text" name="userName" value="${sessionScope.loginUser.userName }" />
					</td>
                </tr>
                <tr>
                    <td>性别</td>
                    <td>
                       	<input type="radio" name="userSex" checked
						value="${sessionScope.loginUser.userSex}" />男 <input type="radio"
						name="userSex" value="${sessionScope.userSex }" />女</td>
                    </td>
                </tr>
              
                <tr>
                    <td>身份证号：</td>
                    <td>
						<input type="text" name="userIdCard"  value="${sessionScope.loginUser.userIdCard}"/>
					</td>
                </tr>
                <!-- <tr>
                    <td>办公电话：</td>
                    <td>
						<input type="text" name="" />
					</td>
                </tr> -->
                <tr>
                    <td>手机：</td>
                    <td>
                       	<input type="text" name="userPhone" value="${sessionScope.loginUser.userPhone}"/>
                    </td>
                </tr>
				<tr>
                    <td>邮箱：</td>
                    <td>
                        	<input type="text" name="userEmail" value="${sessionScope.loginUser.userEmail}"/>
                    </td>
                </tr>
				<tr>
                    <td>更换头像：</td>
                    <td>
						<input type="file" name="userTouxiang" />
					</td>
                </tr>
				<tr>
                    <td>备注：</td>
                    <td>
                        <textarea name="userBeizhu"></textarea>
                    </td>
                </tr>
                
				
				
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="修改">
                    </td>
                </tr>  
            </table>
            </form>
        </div>
    </body>
</html>