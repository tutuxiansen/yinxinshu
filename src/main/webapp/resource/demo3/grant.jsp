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


        <title>权限管理</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="css/mine.css" type="text/css" rel="stylesheet">
        <script  src="js/jquery.js" ></script >
        <script type="text/javascript">
        var SZ_grant = [];
        $(function (){
        	var grant_selected = document.getElementsByName("menues");
        	for(var i =0;i<grant_selected.length;i++){
        		if(grant_selected[i].selected = 'selected'){
        			SZ_grant.unshift(grant_selected[i].value);
        		}
        	}
        });
        
        </script>
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》权限管理</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="/yinxinshu/position/list.do">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>
	
        <div style="font-size: 13px;margin: 10px 5px">
        <form action="/yinxinshu/position/grants.do" method="post">
                 <input type="hidden" name="positionId" value="${position.positionId}">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">职位编码<span style="color:red">*</span>：</td>
                    <td><input type="text" value="${position.positionCode }" /></td>
                </tr>
                <tr>
                    <td>职位名称<span style="color:red">*</span>：</td>
                    <td><input type="text" value="${position.positionName }" /></td>
                </tr>
				 <%-- <c:if test="${position.positionId == menu.pmPositionId }">checked</c:if> --%>
				<tr>
                    <td>菜单权限<span style="color:red">*</span>：</td>
                    <td>
                    <c:forEach items="${menuAll }" var="menu">
                    	<c:if test="${menu.top.menuId == 68 }">
                    		<input type="checkbox" value="${menu.menuId }" name="menus" <c:if test="${menu.flag == true }">checked</c:if> />${menu.menuName }
                    		<br/>
                    		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    		<c:forEach items="${menuAll }" var="child">
                    			<c:if test="${child.top.menuId == menu.menuId }">
                    			<input type="checkbox" value="${child.menuId }" name="menus" <c:if test="${child.flag == true }">checked</c:if>/>${child.menuName }
                    			</c:if>	
                    		</c:forEach>
                    		<br />
                    	</c:if>
                    </c:forEach>
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