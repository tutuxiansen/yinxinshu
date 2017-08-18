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
    <base href="<%=basePath %>"/>
        <meta http-equiv=content-type content="text/html; charset=utf-8" />
        <link href="css/admin.css" type="text/css" rel="stylesheet" />
		
		<link rel="StyleSheet" href="resource/demo1/dtree.css" type="text/css" />
		
		<script type="text/javascript" src="resource/demo1/dtree.js"></script>
		<% 
			System.out.println("okokok...");
		%>
		<script language=javascript>
            function expand(el)
            {
                childobj = document.getElementById("child" + el);

                if (childobj.style.display == 'none')
                {
                    childobj.style.display = 'block';
                }
                else
                {
                    childobj.style.display = 'none';
                }
                return;
            }
        </script>
    </head>
    <body>
	
        <table height="100%" cellspacing=0 cellpadding=0 width=170    border=0>
            <tr>
                <td valign=top align=middle>
                   

				   <table cellspacing=0 cellpadding=0 width="100%" border=0>
						<tr>
                            <td height=10></td>
						</tr>
					</table>
               			
				</td>
                <td width=1 bgcolor=#d1e6f7></td>
            </tr>
        </table>
       <script type="text/javascript">
       	d = new dTree('d');
		d.config.target = "main_right";
			d.add(0,-1,'部门管理');
		<c:forEach items="${depts}" var="dept">
		<c:if test="${dept.top.deptId != 0 }" >
			d.add(${dept.deptId},${dept.top.deptId},'${dept.deptSimplicityName}','dept/view.do?id=${dept.deptId}');
		</c:if>
		<c:if test="${dept.top.deptId == 0 }" >
		d.add(${dept.deptId},${dept.top.deptId},'${dept.deptSimplicityName}','javascript:void(0)');
	</c:if>
			</c:forEach>
		/* d.add(1,0,'人事部','baidu.com');
		d.add(2,0,'财务部','view.html');
		d.add(3,0,'教学部','view.html');
		d.add(4,3,'教务','view.html');					
		d.add(5,3,'教学','view.html');
		d.add(6,3,'项目','view.html');					
		d.add(7,0,'业务部门','view.html');	
		d.add(8,7,'业务一部','view.html');	
		d.add(9,7,'业务二部','view.html');	
		d.add(10,7,'业务三部','view.html');	
		d.add(11,7,'业务四部','view.html');	
		d.add(12,7,'业务五部','view.html');	
		d.add(13,7,'业务六部','view.html'); */						
		document.write(d);
				</script>
   </body>
</html>