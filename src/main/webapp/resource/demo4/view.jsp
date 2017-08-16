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
        <link href="../../css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》职称管理</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="list.html">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="./admin.php?c=goods&a=add" method="post" enctype="multipart/form-data">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">职称编码：</td>
                    <td>
						QMXC-001002
					</td>
                </tr>
                <tr>
                    <td>职称名称：</td>
                    <td>
						高级技术顾问
					</td>
                </tr>
                <tr>
                    <td>所属部门：</td>
                     <td>
						人力资源部
					</td>
                </tr>
                <tr>
                    <td>备  注：</td>
                     <td>
						张XX
					</td>
                </tr>
               	<tr>
                    <td>是否启用<span style="color:red">*</span>：</td>
                    <td>
						<select>
							<option>是</option>
							<option>否</option>
						</select>
					</td>
                </tr>
               
				<tr>
                    <td>备注：</td>
                    <td>
                       基本工资+补助
                    </td>                
                </tr>
            </table>
            </form>
        </div>
    </body>
</html>