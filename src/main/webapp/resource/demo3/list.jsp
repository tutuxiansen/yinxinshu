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

        <title>职位管理</title>

        <link href="css/mine.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是：系统管理-》职位设置</span>
                <span style="float: right; margin-right: 8px; font-weight: bold;">
                    <a style="text-decoration: none;" href="/yinxinshu/position/preAdd.do">【添加】</a>
					<a style="text-decoration: none;" href="">【删除】</a>
                </span>
            </span>
        </div>
        <div></div>
        <div class="div_search">
            <span>
                <form action="/yinxinshu/position/list.do" method="post">
                    职位名称: 
					<input type="text"  name="positionName" value="${position.positionName }"/>
					 所属部门: 
					<input type="text"  />
					是否启用: 
					<select>
						<option >---请选择---</option>
						<option >是</option>
						<option >否</option>
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
                        <td width="80px;"> 职位编码</td>
                        <td >职位名称</td>
						<td width="100px;">职位分类</td>
                        <td width="120px;">所属部门</td>                       
						<td width="120px;">状态</td>  
                        <td align="center" width="100px;">操作</td>
                    </tr>

                    <c:forEach items="${positions }" var="position">
                    <tr id="product1">
                        <td>${position.positionId}</td>
                        <td><input type="checkbox" /></td>
						<td>${position.positionCode}</td>
                        <td><a href="/yinxinshu/position/view.do?id=${position.positionId }">${position.positionName }</a></td> 
						<c:if test="${position.positionClass == 1}"><td>管理</td></c:if> 
						<c:if test="${position.positionClass == 2}"><td>技术</td></c:if>	
						<c:if test="${position.positionClass == 3}"><td>实施</td></c:if>							
                        <td>${position.deptBean.deptName }</td>
						<c:if test="${position.positionState == 1}"><td>启用</td></c:if> 
						<c:if test="${position.positionState == 2}"><td>禁用</td></c:if>	
                        <td>
							<a href="/yinxinshu/position/preUpdate.do?id=${position.positionId}">修改</a>						   
							<a href="/yinxinshu/position/delete.do?id=${position.positionId}">删除</a>
						</td>                        
                    </tr> 
			</c:forEach>
                    <tr>
                        <td colspan="20" style="text-align: center;">						
						<a style="text-decoration: none;" href="#"></a>
						<a href="/yinxinshu/position/list.do?nowPage=1&positionName=${keys.positionName }">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="/yinxinshu/position/list.do?nowPage=${pageUtil.nowPage - 1 }&positionName=${keys.positionName}">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="/yinxinshu/position/list.do?nowPage=${pageUtil.nowPage + 1 }&positionName=${keys.positionName}">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="/yinxinshu/position/list.do?nowPage=${pageUtil.totalPage }&positionName=${keys.positionName}">尾页</a>&nbsp;&nbsp;&nbsp;&nbsp;
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