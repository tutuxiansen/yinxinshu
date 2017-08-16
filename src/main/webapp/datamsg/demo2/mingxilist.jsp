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
		<div style="width: 50%; height: 100%; float: left">明细列表</div>
		<div style="width: 50%; height: 100%; float: right; text-align: right">
			<input type="button" value="返回" onclick="history.go(-1)" />
		</div>
	</div>


	<div style="font-size: 13px; margin: 10px 5px;">
		<table class="table_a" border="1" width="100%">
			<tbody>
				<tr style="font-weight: bold;">
					<td width="110px;">部门</td>
					<td width="110px;">学历</td>
					<td width="140px;">档案编号</td>
					<td width="80px;">员工姓名</td>
					<td width="80px;">性别</td>
					<td width="100px;">职位</td>
					<td width="120px;">职称</td>
					<td width="100px;">电话</td>
					<td width="120px;">档案状态</td>
					<td width="120px;">建档日期</td>
				</tr>
				
				<c:forEach items="${emps}" var="emp">
					<tr id="product1">
						<td>${emp.deptName}</td>
						<td>${map.empEducation}</td>
						<td>${emp.empId}</td>
						<td>${emp.empName}</td>
						<td>${emp.empGender}</td>
						<td>${emp.empPosition}</td>
						<td>${emp.empPositonal}</td>
						<td>${emp.empTel}</td>
						<td>${emp.empRecordState}</td>
						<td>${emp.createYear}-${emp.createMonth}-${emp.createDay}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>