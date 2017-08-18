<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html xmlns="http://www.w3.org/1999/xhtml">
<!doctype html public "-//w3c//dtd xhtml 1.0 frameset//en" "http://www.w3.org/tr/xhtml1/dtd/xhtml1-frameset.dtd">
<html>
    <head>
<base href="<%=basePath%>">

        <meta http-equiv=content-type content="text/html; charset=utf-8" />
        <meta http-equiv=pragma content=no-cache />
        <meta http-equiv=cache-control content=no-cache />
        <meta http-equiv=expires content=-1000 />
        
        <title>启明星辰人力资源管理V1.0</title>
    </head>
		<frameset cols="170, *">
                <frame name=left src="dept/list.do"  frameborder=0 noresize />
                <frame name=main_right src="resource/demo1/wecom.jsp" frameborder=0 noresize scrolling=yes />
		</frameset>		
    <noframes>	
    </noframes>
</html>