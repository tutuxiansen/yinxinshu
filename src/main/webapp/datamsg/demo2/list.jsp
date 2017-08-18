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
        
        <title>数据分析</title>
        
        <link href="css/mine.css" type="text/css" rel="stylesheet" />
        
        <script type="text/javascript" src="js/jquery.js"></script>
		
		<script src="js/highcharts.js"></script>

		<script type="text/javascript">
		
		var years = [];
		var datazk = [];
		var databk = [];
		var databs = [];
		var datass = [];
		
		<c:forEach items="${datas}" var ="data">
			years.unshift('${data.YEAR}');
			datazk.unshift(${data.ZK});
			databk.unshift(${data.BK});
			databs.unshift(${data.BS});
			datass.unshift(${data.SS});
			
		</c:forEach>
		
		
		(function($){ // encapsulate jQuery
		var chart;
		$(document).ready(function() {
			chart = new Highcharts.Chart({
				chart: {
					renderTo: 'container',
					type: 'column'
				},
				title: {
					text: '数据柱形图表'
				},
				subtitle: {
					text: '职员数据综合图表'
				},
				xAxis: {
					categories: years
				},
				yAxis: {
					min: 0,
					title: {
						text: '数据'
					}
				},
				legend: {
					layout: 'vertical',
					backgroundColor: '#FFFFFF',
					align: 'left',
					verticalAlign: 'top',
					x: 100,
					y: 70,
					floating: true,
					shadow: true
				},
				tooltip: {
					formatter: function() {
						return ''+
							this.x +': '+ this.y +' 单位';
					}
				},
				plotOptions: {
					column: {
						pointPadding: 0.2,
						borderWidth: 0
					}
				},
					series: [{
					name: '博士',
					data: databs
		
				}, {
					name: '硕士',
					data: datass
		
				}, {
					name: '本科',
					data: databk
	
				}, {
					name: '专科',
					data: datazk
		
				}]
			});
		});
		
		})(jQuery);
		</script>
		        
    </head>
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是：数据分析 》》》职员数据综合报表</span>
              
            </span>
        </div>
        <div></div>
        <div class="div_search">
            <span>
                <form action="emp/queryEducation.do" method="get">
                 	  年度：
				   <select name = "year">
						<option <c:if test="${year == null || year == ''}">selected = "selected"</c:if>>
							--请选择---
						</option>
						<option <c:if test="${year == years.year0}">selected = "selected"</c:if>>
							${years.year0}
						</option>
						<option <c:if test="${year == years.year1}">selected = "selected"</c:if>>
							${years.year1}
						</option>
						<option <c:if test="${year == years.year2}">selected = "selected"</c:if>>
							${years.year2}
						</option>
						<option <c:if test="${year == years.year3}">selected = "selected"</c:if>>
							${years.year3}
						</option>
				
				   </select>
                    <input value="查询" type="submit" />
					
                </form>
            </span>
        </div>
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="100%" >
                <tbody>
					<tr style="font-weight: bold; background-color:#06F">
                        <td width="90px;" style="text-align:right; border-bottom:none">学历</td>
                        <td width="60px;" rowspan="2" valign="top">全部(人数)</td>						
                        <td width="60px;" rowspan="2" valign="top">博士(人数)</td>
                        <td width="60px;" rowspan="2" valign="top">硕士(人数)</td>
						<td width="60px;" rowspan="2" valign="top">本科(人数)</td>
                        <td width="60px;" rowspan="2" valign="top">专科(人数)</td>                       
                        
                    </tr>
					<tr style="font-weight: bold;background-color:#06F"">
                        <td  style="text-align:left; border-top:none">年度</td>
                    </tr>
                    
                <c:forEach items="${datas}" var ="data" >
					<tr id="product1">
						<td>${data.YEAR}</td>
						<td><a href="emp/queryEducationShowDept.do?year=${data.YEAR}">${data.ALL_MANS}</a></td>
						<td><a href="emp/queryEducationShowDept.do?year=${data.YEAR}">${data.BS}</a></td>
						<td><a href="emp/queryEducationShowDept.do?year=${data.YEAR}">${data.SS}</a></td>
						<td><a href="emp/queryEducationShowDept.do?year=${data.YEAR}">${data.BK}</a></td>
						<td><a href="emp/queryEducationShowDept.do?year=${data.YEAR}">${data.ZK}</a></td>
					</tr>
				</c:forEach>
                    
                </tbody>
            </table>
            <br/>
             <div style="margin: 0 1em">
				<div id="container" style="min-width: 400px; height: 400px; margin: 0 auto"></div>
			</div>
        </div>
    </body>
<script type="text/javascript">
	<c:forEach items="${datas}" var ="data">
		$("#year").append(""+${data.YEAR}+""); 
	</c:forEach>
	
</script>
</html>