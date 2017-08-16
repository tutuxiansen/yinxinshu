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

<title>薪酬标准管理</title>

<link href="../../css/mine.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery.js"></script>
<script src="js/highcharts.js"></script>
<script type="text/javascript">

	(function($) { // encapsulate jQuery
		var chart;
		$(document).ready(
				function() {
					chart = new Highcharts.Chart({
						chart : {
							renderTo : 'container',
							plotBackgroundColor : null,
							plotBorderWidth : null,
							plotShadow : false
						},
						title : {
							text : '数据饼状图表'
						},
						tooltip : {
							formatter : function() {
								return '<b>' + this.point.name + '</b>: '
										+ this.percentage.toFixed(2) + ' %';
							}
						},
						plotOptions : {
							pie : {
								allowPointSelect : true,
								cursor : 'pointer',
								dataLabels : {
									enabled : true,
									color : '#000000',
									connectorColor : '#000000',
									formatter : function() {
										return '<b>' + this.point.name
												+ '</b>: '
												+ this.percentage.toFixed(2)
												+ ' %';
									}
								}
							}
						},
						series : [ {
							type : 'pie',
							name : 'pie',
							data : [ [ '博士', ${map.BS}.0*10 ], [ '硕士', ${map.SS}.0*10 ], {
								name : '本科',
								y : ${map.BK}.0*10,
								sliced : true,
								selected : true
							}, [ '专科', ${map.ZK}.0*10 ] ]
						} ]
					});
				});
	})(jQuery);
</script>

</head>
<body>
	<style>
.tr_color {
	background-color: #9F88FF
}
</style>
	<script type="text/javascript">
		function fanhui() {
			location.href = "emp/queryEducation.do";
		}
	</script>

	<div class="div_head">
		<span> <span style="float: left;">当前位置是：数据分析 》》》职员数据综合报表</span>

		</span>
	</div>
	<div></div>
	<div class="div_search">
		<span>
			<form action="emp/queryEducationShowDept.do" method="post">
					<input type ="hidden" name = "year" value = "${map.year}">
				部门： <select name = "dept">
					<option>--请选择---</option>
					<option>产品设计中心</option>
					<option>平台研发中心</option>
					<option>人力资源中心</option>
					<option>财务部</option>
				</select> <input type="submit" value="查询" /> <input type="button" value="返回"
					onclick="javascript:fanhui()" />

			</form>
		</span>

	</div>
	<div style="font-size: 13px; margin: 10px 5px;">
		<table class="table_a" border="1" width="100%">
			<tbody>
				<tr style="font-weight: bold;">
					<td width="90px;" style="text-align: right; border-bottom: none">学历</td>
					<td width="60px;" rowspan="2" valign="top">全部(人数)</td>
					<td width="60px;" rowspan="2" valign="top">博士(人数)</td>
					<td width="60px;" rowspan="2" valign="top">硕士(人数)</td>
					<td width="60px;" rowspan="2" valign="top">本科(人数)</td>
					<td width="60px;" rowspan="2" valign="top">专科(人数)</td>

				</tr>
				<tr style="font-weight: bold;">
					<td style="text-align: left; border-top: none">部门</td>
				</tr>

				<c:forEach items="${datas}" var="data">
					<tr id="product1">
						<td style="font-weight: bold;">${data.DEPT}</td>
						<td name="all"><a href="emp/queryEducationByDept.do?dept=${data.DEPT}&year=${map.year}">${data.ALL_MANS}</a></td>
						<td name="bs"><a href="emp/queryEducationByDept.do?dept=${data.DEPT}&year=${map.year}">${data.BS}</a></td>
						<td name="ss"><a href="emp/queryEducationByDept.do?dept=${data.DEPT}&year=${map.year}">${data.SS}</a></td>
						<td name="bk"><a href="emp/queryEducationByDept.do?dept=${data.DEPT}&year=${map.year}">${data.BK}</a></td>
						<td name="zk"><a href="emp/queryEducationByDept.do?dept=${data.DEPT}&year=${map.year}">${data.ZK}</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br/>
		<div style="margin: 0 1em">
			<div id="container"
				style="min-width: 400px; height: 400px; margin: 0 auto"></div>
		</div>
	</div>
</body>

</html>