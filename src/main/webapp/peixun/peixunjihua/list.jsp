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

        <title>培训管理</title>

        <link href="../../css/mine.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是：培训管理-》培训计划</span>
                <span style="float: right; margin-right: 8px; font-weight: bold;">
                    <a style="text-decoration: none;" href="peixun/peixunjihua/add.jsp">【新增培训计划】</a>
                </span>
            </span>
        </div>
        <div></div>
        <div class="div_search">
            <span>
                <form action="px/list.do" method="post">
                                        培训名称: 
					<input type="text" name="pxName" value="${keys.pxName }"/>
					 审核状态: 
					<select name="">
						<option>--请选择--</option>
						<option>起草</option>
						<option>审核中</option>
						<option>审核通过</option>
						<option>驳回</option>
					</select>
					培训时间：
					<input type="text"/>至<input type="text"/>
                    <input value="查询" type="submit" />
					
                </form>
            </span>
        </div>
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="100%">
                <tbody>
                <tr style="font-weight: bold;">
                        <td width="">培训名称</td>
                        <td width="15%">培训讲师</td>						
                        <td width="15%">培训时间</td>
                        <td>培训反馈</td>
						<td width="15%">审核状态</td>                   
                        <td align="center" width="15%" $>操作</td>
                    </tr>
                <c:forEach items="${pxs }" var="px">
                

                    <tr id="product1">
                        <td>${px.pxName }</td>
                        <td>${px.pxJiangshi }</td>
						<td>${px.pxTime }</td>
						<td>${px.pxFankui }</td>
                        <td>${px.pxShzt }</td> 
										
                        <td>
                            <c:if test="${px.pxStatus ==3}">
                            <a href="px/preXiugai2.do?id=${px.pxId }">培训复核</a>
                            </c:if>
                            <c:if test="${px.pxStatus ==2}">
                            <a href="px/view.do?id=${px.pxId }">明细</a>
                            </c:if>
                            <c:if test="${px.pxStatus == 1}">
							<a href="px/preXiugai.do?id=${px.pxId }">修改</a>
							<a href="px/view.do?id=${px.pxId }">明细</a>
							<a href="px/delete.do?id=${px.pxId }">删除</a>
							</c:if>
						</td>                        
                    </tr> 
                </c:forEach>
					 
					
				
					
                    <tr>
                        <td colspan="20" style="text-align: center;">						
						
        
                         <!--    首页 上一页  ... 7 8 9 10 11 12 ... 下一页 尾页 共1234条 每页显示 10/23 -->
    <c:if test="${pageUtil.nowPage  == 1}">
             首页&nbsp;&nbsp;&nbsp;&nbsp;
	    上一页&nbsp;&nbsp;&nbsp;&nbsp;
	</c:if>
	
	<c:if test="${pageUtil.nowPage > 1 }"><!-- &pxName=${keys.pxName } -->
    <a href="px/list.do?nowPage=1">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="px/list.do?nowPage=${pageUtil.nowPage - 1 }">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	</c:if>
	
	 <c:if test="${pageUtil.nowPage == pageUtil.totalPage }">
	 下一页&nbsp;&nbsp;&nbsp;&nbsp;
	 尾页&nbsp;&nbsp;&nbsp;&nbsp;
	 </c:if>
	 
	 <c:if test="${pageUtil.nowPage != pageUtil.totalPage }"> <!-- &pxDel=1 -->
	<a href="px/list.do?nowPage=${pageUtil.nowPage + 1 }">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="px/list.do?nowPage=${pageUtil.totalPage }">尾页</a>&nbsp;&nbsp;&nbsp;&nbsp;
	 </c:if>
	当前页 ${pageUtil.nowPage }&nbsp;&nbsp;&nbsp;&nbsp;
	分页单位${pageUtil.pageSize }&nbsp;&nbsp;&nbsp;&nbsp;
	总页数${pageUtil.totalPage }&nbsp;&nbsp;&nbsp;&nbsp;
	总条数${pageUtil.totalCount }              
                            
                          
                            
                            
                             </a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>