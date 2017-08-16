<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!doctype html>
<html xmlns="http://www.w3.org/1999/xhtml">
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>
<head>
<base href="<%=basePath%>">

<meta http-equiv="content-type" content="text/html; charset=UTF-8" />

<title>数据分析</title>

<link href="../../css/mine.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<style>
.tr_color {
	background-color: #9F88FF
}
</style>
	<div class="div_head">
		<span> <span style="float: left;">当前位置是：数据分析 ---》职员明细表</span> <span
			style="float: right; margin-right: 8px; font-weight: bold;"> </span>
		</span>
	</div>
	<br/>
	
	<div class="div_search">
		<span>
			<form action="emp/queryByIf.do" method="post">
				部门: <select name = "select">
					<option>--请选择---</option>
					<option value = "产品设计中心"<c:if test="${map.deptName == '产品设计中心'}"> selected = "selected"</c:if>>产品设计中心</option>
					<option value = "平台研发中心"<c:if test="${map.deptName == '平台研发中心'}"> selected = "selected"</c:if>>平台研发中心</option>
					<option value = "人力资源中心"<c:if test="${map.deptName == '人力资源中心'}"> selected = "selected"</c:if>>人力资源中心</option>
					<option value = "财务部"<c:if test="${map.deptName == '财务部'}"> selected = "selected"</c:if>>财务部</option>
					
					</select > 
					员工姓名：<input  name = "empName" type="text" value="${map.empName}"/> 
					档案状态： <select name = "recordState">
					<option>--请选择---</option>
					<option <c:if test="${map.empRecordState == '试用期'}"> selected = "selected"</c:if>>试用期</option>
					<option <c:if test="${map.empRecordState == '正式员工'}"> selected = "selected"</c:if>>正式员工</option>
					<option <c:if test="${map.empRecordState == '离职'}"> selected = "selected"</c:if>>离职</option>
					<option <c:if test="${map.empRecordState == '已删除'}"> selected = "selected"</c:if>>已删除</option>

				</select> 建档时间: <input name = "createTimeOne" type="text" /> 至 <input name = "createTimeTwo" type="text" /> 
				<input value="查询" type="submit" />

			</form>
		</span>
	</div>
	<div style="font-size: 13px; margin: 10px 5px;">
		<table class="table_a" border="1" width="100%">
			<tbody>
				<tr style="font-weight: bold;">
					<td width="110px;">部门</td>
					<td width="140px;">档案编号</td>
					<td width="80px;">员工姓名</td>
					<td width="80px;">性别</td>
					<td width="100px;">职位</td>
					<td width="120px;">职称</td>
					<td width="100px;">电话</td>
					<td width="120px;">档案状态</td>
					<td width="120px;">建档日期</td>
				</tr>

				<c:forEach items="${emps}" var ="emp">
					<tr id="product1">
						<td rowspan="1">${emp.deptName}</td>
						<td>${emp.empId}</td>
						<td>${emp.empName}</td>
						<td>${emp.empGender}</td>
						<td>${emp.empPosition}</td>
						<td>${emp.empPositonal}</td>
						<td>${emp.empTel}</td>
						<td>${emp.empRecordState}</td>
						<td>${emp.createYear}+"-"+${emp.createMonth}+"-"+${emp.createDay}</td>
					</tr>
				</c:forEach>
				<tr>
					<td colspan="20" style="text-align: center;">
					<a style="text-decoration: none;" href="#">
					<a href="emp/queryAll.do?nowPage=1&userName=${emp.empName }">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="emp/queryByIf.do?nowPage=${pageUtil.nowPage - 1 }&empName=${emp.empName}">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
					 ... 7 8 9 10 11 12 ... 
					<a href="emp/queryByIf.do?nowPage=${pageUtil.nowPage + 1 }&empName=${emp.empName}">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="emp/queryAll.do?nowPage=${pageUtil.totalPage }&empName=${emp.empName}">尾页</a>&nbsp;&nbsp;&nbsp;&nbsp; 
					共${pageUtil.totalCount }条 每页显示${pageUtil.pageSize }&nbsp;  
					 ${pageUtil.nowPage }/${pageUtil.totalPage } </a></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>