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

        <title>薪酬标准管理添加</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-系统管理》部门管理</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                  
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="/yinxinshu/dept/update.do" method="post" >
            <input type="hidden" name="deptId" value="${dept.deptId }">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">部门编码：<span style="color:red">*</span>：</td>
                    <td><input type="text" name="deptCode" value="${dept.deptCode }" /></td>
                </tr>
                <tr>
                    <td>部门简称：<span style="color:red">*</span>：</td>
                    <td>
                       <input type="text" name="deptSimplicityName" value="${dept.deptSimplicityName }" /> 
                    </td>
                </tr>
               
                <tr>
                    <td>部门全称：<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" name="deptName" value="${dept.deptName }" /></td>
                </tr>
                <tr>
                    <td>上级部门：<span style="color:red">*</span>：</td>
                    <td>
        	<select name="deptTop">
        	<c:forEach items="${deptTops }" var="deptTop">
        		<option  value="${deptTop.deptId }" <c:if test="${dept.top.deptId == deptTop.deptId }">selected</c:if>>${deptTop.deptSimplicityName }</option>
        	</c:forEach>
        	</select>
                    
					</td>
                </tr>
                <tr>
                    <td>地址<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="deptAddress"  value="${dept.deptAddress }" />
                    </td>
                </tr>


				<tr>
                    <td>简介：</td>
                    <td>
                        
						 <textarea name="deptIntroduction" >${dept.deptIntroduction }</textarea>
                    </td>                
                </tr>

				<tr>
                    <td>备注：</td>
                    <td>
                        
						 <textarea name="deptRemark">${dept.deptRemark }</textarea>
                    </td>                
                </tr>
				<tr>
                    <td>是否启用：</td>
                    <td>
                       <select name="deptState">
							<option value="1" <c:if test="${dept.deptState == 1 }">selected</c:if>>启用</option>
							<option value="2" <c:if test="${dept.deptState == 2 }">selected</c:if>>禁用</option>						
						 </select>
                    </td>                
                </tr>

                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="添加">
						<input type="reset" value="清空">
                    </td>
                </tr>  
            </table>
            </form>
        </div>
    </body>
</html>