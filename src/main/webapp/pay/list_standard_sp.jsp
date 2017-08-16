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

        <title>薪酬标准审批</title>

        <link href="../css/mine.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是：薪酬管理-》薪酬标准审批</span>
                <span style="float: right; margin-right: 8px; font-weight: bold;">
                   
                </span>
            </span>
        </div>
        <div></div>
        <div class="div_search">
            <span>
                <form action="salmanager/shenpifenye.do" method="post">
             
                    薪酬标准编号: 
					<input type="text"  />
					 
                    <input value="查询" type="submit" />
					
                </form>
            </span>
        </div>
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="100%">
                <tbody><tr style="font-weight: bold;">
                        <td width="40px;">序号</td>
                        <td width="30px;"><input type="checkbox" /></td>						
                        <td width="80px;">薪酬编码</td>
                        <td >薪酬标准类型</td>
						<td width="100px;">审核状态</td>
                        <td width="120px;">时间</td>                       
                        <td align="center" width="100px;">操作</td>
                    </tr>

                 <c:forEach items="${salManagers}" var="salManager">
					 <tr id="product1">
                        <td>${salManager.managerId}</td>
                        <td><input type="checkbox" /></td>
						<td>${salManager.salCode}</td>
                        <td><a href="salmanager/listNameById.do?id=${salManager.managerId}">${salManager.salType}</a></td> 
						<c:if test="${salManager.auditState==2}">
						<td>审核中</td> 
						</c:if> 						
                        <td>${salManager.auditTime}</td>
                        <td>
							<a href="salmanager/listUserShenhe.do?id=${salManager.managerId}">审核</a>						   							
						</td>                        
                    </tr>
 </c:forEach>					
					
					
                    <tr>
                        <td colspan="20" style="text-align: center;">						
						<a style="text-decoration: none;" href="#">
                 <!--            首页 上一页  ... 7 8 9 10 11 12 ... 下一页 尾页 共1234条 每页显示 10/23 </a> -->
                 <a href="salmanager/fenye.do?nowPage=1&salType=${keys.salType }">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="salmanager/fenye.do?nowPage=${pageUtil.nowPage - 1 }&salType=${keys.salType}">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="salmanager/fenye.do?nowPage=${pageUtil.nowPage + 1 }&salType=${keys.salType}">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="salmanager/fenye.do?nowPage=${pageUtil.totalPage }&salType=${keys.salType}">尾页</a>&nbsp;&nbsp;&nbsp;&nbsp;
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