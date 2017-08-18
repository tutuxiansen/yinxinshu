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

        <title>用户管理</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>
        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》资源管理》用户管理</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="/yinxinshu/user/listUser.do">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="/yinxinshu/user/updateUser.do" method="post">
            <input type="hidden" name="userId" value="${user.userId }">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">用户编号<span style="color:red">*</span>：</td>
                    <td><input type="text" name="userCode" value="${user.userCode }" /></td>
                </tr>
                <tr>
                    <td>登录账号<span style="color:red">*</span>：</td>
                    <td>
                       <input type="text" name="userUserName" value="${user.userUserName }" /> 
                    </td>
                </tr>
               
                <tr>
                    <td>用户姓名<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" name="userName" value="${user.userName }"/></td>
                </tr>
                <tr>
                    <td>密码<span style="color:red">*</span>：</td>
                    <td>
						<input type="text"  name="userPassWord" value="${user.userPassWord }"/>
					</td>
                </tr>
                <tr>
                    <td>所属职位<span style="color:red">*</span>：</td>
                    <td>
                        
							<select name="positionId">
        	<c:forEach items="${positions }" var="position">
        		<option value="${position.positionId }" <c:if test="${user.positionBean.positionId == position.positionId }">selected</c:if>>${position.positionName }</option>
        	</c:forEach>
        </select>
                    </td>
                </tr>


				<tr>
                    <td>所属部门<span style="color:red">*</span>：</td>
                    <td>
                       
						<select name="deptId">
        	<c:forEach items="${depts }" var="dept">
        		<option value="${dept.deptId }" <c:if test="${user.deptBean.deptId == dept.deptId }">selected</c:if>>${dept.deptSimplicityName }</option>
        	</c:forEach>
        </select>
        
                    </td>                
                </tr>

				<tr>
                    <td>身份证<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="userIdCard" value="${user.userIdCard }" />
                    </td>                
                </tr>

				<tr>
                    <td>联系电话<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="userPhone" value="${user.userPhone }"/>
                    </td>                
                </tr>

				<tr>
                    <td>邮箱<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="userEmail" value="${user.userEmail}"/>
                    </td>                
                </tr>

				<tr>
                    <td>联系地址：</td>
                    <td>
                        <input type="text" name="userAddress" value="${user.userAddress }"/>
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