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
                <span style="float:left">当前位置是：-》薪酬标准管理</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="/yinxinshu/user/listUser.do">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
	<form >
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">用户编号：</td>
                    <td>
						${user.userCode }
					</td>
                </tr>
				<tr>
                    <td width="120px;">登录账号：</td>
                    <td>
						${user.userUserName }
					</td>
                </tr>
                <tr>
                    <td>用户姓名：</td>
                    <td>
						${user.userName }
					</td>
                </tr>
                <tr>
                    <td>密码：</td>
                     <td>
						${user.userPassWord }
					</td>
                </tr>
                <tr>
                    <td>用户角色：</td>
                     <td>
						${user.positionBean.positionName }
					</td>
                </tr>
                <tr>
                    <td>所属部门：</td>
                     <td>
						${user.deptBean.deptName }
					</td>
                </tr>
				<tr>
                    <td>身份证：</td>
                    <td>
                        ${user.userIdCard }
                    </td>                
                </tr>
                <tr>
                    <td>联系电话：</td>
                     <td>
						${user.userPhone }
					</td>
                </tr>


				<tr>
                    <td>邮箱：</td>
                     <td>
						${user.userEmail }
					</td>               
                </tr>

				<tr>
                    <td>联系地址：</td>
                     <td>
						${user.userAddress }
					</td>                
                </tr>

				

            </table>
            </form>
        </div>
    </body>
</html>