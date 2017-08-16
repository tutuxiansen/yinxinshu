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
                    <a style="text-decoration: none" href="list.html">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="./admin.php?c=goods&a=add" method="post" enctype="multipart/form-data">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">职位编码：</td>
                    <td>
					${position.positionCode }
					</td>
                </tr>
                <tr>
                    <td>职位名称：</td>
                    <td>
						${position.positionName }
					</td>
                </tr>
                <tr>
                    <td>职位分类：</td>
						<c:if test="${position.positionClass == 1}"><td>管理</td></c:if>
                     <c:if test="${position.positionClass == 2}"><td>技术</td></c:if>
                     <c:if test="${position.positionClass == 3}"><td>实施</td></c:if>
                </tr>
                <tr>
                    <td>所属部门：</td>
                     <td>
						${position.deptBean.deptName }
					</td>
                </tr>
                <tr>
                    <td>职位描述：</td>
                     <td>
						${position.positionDescribe }
					</td>
                </tr>
                <tr>
                    <td>备  注：</td>
                     <td>
						${position.positionRemark }
					</td>
                </tr>


				<tr>
                    <td>是否启用：</td>
						<c:if test="${position.positionState == 1}"><td>启用</td></c:if>
                     <c:if test="${position.positionState == 2}"><td>禁用</td></c:if>
                </tr>
				
            </table>
            </form>
        </div>
    </body>
</html>