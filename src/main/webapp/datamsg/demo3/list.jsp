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

        <link href="../../css/mine.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是：数据分析》》》职员异动情况统计分析</span>
                
            </span>
        </div>
        <div></div>
        <div class="div_search">
            <span>
                <form action="#" method="get">
                    年度：
					<select>
						<option>--请选择--</option>
						<option>2007</option>
						<option>2008</option>
						<option>2009</option>
                        <option>2010</option>
						<option>2011</option>
						<option>2012</option>
                     </select>
                   <input type="submit" value="查询" />
					
                </form>
            </span>
        </div>
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="100%">
                <tbody>
                
					<tr style="font-weight: bold; background-color:#06C">
                    
                        <td style="width:150px; height:50px; text-align:right; border-bottom:none">异动类型</td>
						<td colspan="3" style="width:30px;">入职(人数)</td>
						<td colspan="3" style="width:30px;">转正(人数)</td>
						<td colspan="3" style="width:30px;">调薪(人数)</td>
						<td colspan="3" style="width:30px;">续签(人数)</td>
						<td colspan="3" style="width:30px;">调岗(人数)</td>
						<td colspan="3" style="width:30px;">离职(人数)</td>
						<td colspan="3" style="width:30px;">其他变更(人数)</td>
						<td rowspan="2" style="width:90px;">总计</td>
                    </tr>
					<tr style="font-weight: bold;height:130px;background-color:#06C">
                        <td style="border-top:none; text-align:left;" valign="bottom">时间</td>
						<td >教育产品发展本部</td>
						<td>职业教育研究院</td>
						<td >总计</td>
						<td>教育产品发展本部</td>
						<td>职业教育研究院</td>
						<td >总计</td>
						<td>教育产品发展本部</td>
						<td>职业教育研究院</td>
						<td >总计</td>
						<td>教育产品发展本部</td>
						<td>职业教育研究院</td>
						<td >总计</td>
						<td>教育产品发展本部</td>
						<td>职业教育研究院</td>
						<td >总计</td>
						<td>教育产品发展本部</td>
						<td>职业教育研究院</td>
						<td >总计</td>
						<td>教育产品发展本部</td>
						<td>职业教育研究院</td>
						<td >总计</td>
                    </tr>

					<c:forEach items="${beans}" var="bean">
						<tr id="product1">
                    	<td style="text-align:center"><a href="yuezonglist.html" > ${bean.year} </a></td>
                        <td>${bean.BENBURZ}</td>
                        <td>${bean.YANJYRZ}</td>
                         <td>${bean.YANJYRZ+bean.BENBURZ}</td>
                         
                        <td>${bean.BENBUZZ}</td>
                        <td>${bean.YANJYZZ}</td>
                         <td>${bean.YANJYZZ+bean.BENBUZZ}</td>
                        
                         <td>${bean.BENBUTX}</td>
                        <td>${bean.YANJYTX}</td>
                         <td>${bean.YANJYTX+bean.BENBUTX}</td>
                         
                        <td>${bean.BENBUXQ}</td>
                        <td>${bean.YANJYXQ}</td>
                         <td>${bean.YANJYXQ+bean.BENBUXQ}</td>
                        
                        <td>${bean.BENBUTG}</td>
                        <td>${bean.YANJYTG}</td>
                         <td>${bean.YANJYTG+bean.BENBUTG}</td>
                         
                       <td>${bean.BENBULZ}</td>
                        <td>${bean.YANJYLZ}</td>
                         <td>${bean.YANJYLZ+bean.BENBULZ}</td>
                        
                        <td>${bean.BENBUQT}</td>
                        <td>${bean.YANJYQT}</td>
                         <td>${bean.YANJYQT+bean.BENBUQT}</td>
                         
                        <td>${bean.YANJYRZ+bean.BENBURZ+bean.YANJYZZ+bean.BENBUZZ+bean.YANJYTX+bean.BENBUTX+bean.YANJYXQ+bean.BENBUXQ+bean.YANJYTG+bean.BENBUTG+bean.YANJYLZ+bean.BENBULZ+bean.YANJYQT+bean.BENBUQT}</td>                  
                    </tr> 
					</c:forEach>
                    
                </tbody>
            </table>
        </div>
    </body>
</html>