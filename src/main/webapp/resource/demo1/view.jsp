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
                <span style="float:left">当前位置是：-系统管理》部门管理</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
				    <a style="text-decoration: none" href="/yinxinshu/dept/preUpdate.do?id=${dept.deptId }">【修改】</a>					
					<a style="text-decoration: none" href="/yinxinshu/dept/preAdd.do">【添加子部门】</a>					
					<a style="text-decoration: none" href="/yinxinshu/dept/delete.do?id=${dept.deptId }">【删除】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="./admin.php?c=goods&a=add" method="post" >
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">部门编码：</td>
                    <td>
						${dept.deptCode }
					</td>
                </tr>
                <tr>
                    <td>部门简称：</td>
                    <td>
						${dept.deptSimplicityName }
					</td>
                </tr>
                <tr>
                    <td>部门全称：</td>
                     <td>
						${dept.deptName }
					</td>
                </tr>
                <tr>
                    <td>上级部门：</td>
                     <td>
						${dept.top.deptSimplicityName}
					</td>
                </tr>
                <tr>
                    <td>地址：</td>
                     <td>
						${dept.deptAddress }
					</td>
                </tr>
                <tr>
                    <td>简介：</td>
                     <td>
						${dept.deptIntroduction }
					</td>
                </tr>


				<tr>
                    <td>备注：</td>
                     <td>
						${dept.deptRemark }
					</td>               
                </tr>

				<tr>
                    <td>是否启用：</td>
                     <c:if test="${dept.deptState == 1}"><td>启用</td></c:if>
                     <c:if test="${dept.deptState == 2}"><td>禁用</td></c:if>	               
                </tr>
            </table>
            </form>
        </div>
    </body>
</html>