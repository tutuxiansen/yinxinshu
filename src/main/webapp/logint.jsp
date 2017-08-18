<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
﻿
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>银杏树技术服务管理平台</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/jquery.js"></script>
<script src="js/cloud.js" type="text/javascript"></script>
<script language="javascript">
	function changimages(obj) {
		var date = new Date();
		obj.src = "login/image.do?time="+date.getTime();
	}
	
     function gos(){
				if(cknameMessage()&&ckPassword()&&ckval()){
					return true;
				}else{
					return false;
				}
			}
			function messages(){
				var ckname=document.getElementById("ckname");
				ckname.style.color="red";
				ckname.innerHTML="请输入用户名";
			}
			function cknameMessage(){
				var input=document.getElementById("username");
				var ckname=document.getElementById("ckname");
				var t=/^[A-Za-z]{6,12}$/;
				if(t.test(input.value)){
					ckname.style.color="green";
					ckname.innerHTML="*";
					return true;
				}else{
					ckname.style.color="red";
					ckname.innerHTML="用户名是6~12位的英文";
					return false;
				}
			}
			function pwMessage(){
					var ckpw=document.getElementById("ckpw");
					ckpw.style.color="red";
					ckpw.innerHTML="请输入密码";
				}
				function ckPassword(){
					var password=document.getElementById("password");
					var ckpw=document.getElementById("ckpw");
					if(password.value.length!=0){
						ckpw.style.color="green";
						ckpw.innerHTML="*";
						return true;
					}else{
						ckpw.style.color="red";
						ckpw.innerHTML="密码不能为空";
						return false;
					}
				}
				
				function val(){
				var ckpw=document.getElementById("ckvals");
					ckpw.style.color="red";
					ckpw.innerHTML="请输入验证码";
				
				}
				
				
				function ckval(){
				var scode = document.getElementById("scodes");
				var ckvals = document.getElementById("ckvals");
				
				
				if(scode.value.length==4){
				ckvals.style.color="green";
						ckvals.innerHTML="输入正确";
						return true;
				}else{
				ckvals.style.color="red";
						ckvals.innerHTML="验证码错误";
						return false;
				}
				}
				
				
	$(function() {
		$('.loginbox').css({
			'position' : 'absolute',
			'left' : ($(window).width() - 692) / 2
		});
		$(window).resize(function() {
			$('.loginbox').css({
				'position' : 'absolute',
				'left' : ($(window).width() - 692) / 2
			});
		});
	});
</script>


</head>

<body
	style="background-color:#1c77ac; background-image:url(images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">


	<div class="logintop">
		<span>欢迎登录后台管理界面平台</span>
		<ul>
			<li><a href="#">回首页</a>
			</li>
			<li><a href="#">帮助</a>
			</li>
			<li><a href="#">关于</a>
			</li>
		</ul>
	</div>

	<div class="loginbody">

		<span class="systemlogo"> 银杏树信息技术服务(北京)有限公司人力资源管理平台 </span>
		<form action="login/queryUser.do" id="form" method="post"
			onsubmit="return gos()">
			<div class="loginbox">
				<ul>
					<li><input name="username" type="text" class="loginuser"
						id="username" value="${cookie.username.value }"
						onfocus="messages()" onblur="cknameMessage()" /><span
						style="position: absolute; left:540px;top:95px;" id="ckname"></span>
					</li>
					<li><input name="password" type="text" class="loginpwd"
						id="password" value="${cookie.password.value }"
						onfocus="pwMessage()" onblur="ckPassword()" /><span id="ckpw"
						style="position: absolute; left:540px;top:145px;" id="ckname">${errorlogin} </span>
					</li>
					<li><input name="loginval" type="text" class="loginVal" id="scodes"
						onfocus="val()" onblur="ckval()" /> <label><img alt="验证码" id="scode"
							 calss="loginvalImg" src="login/image.do"
							onclick="changimages(this)"
							style="position: absolute; left:425px;top:182px;" /><span
							id="ckvals" style="position: absolute; left:590px;top:195px;"
							id="ckvals"></span> </label></li>
					<li><input  type="submit" class="loginbtn" value="登录" />
						<label> <input type="checkbox" id="remember"
							name="remeber" value="1"
							style="position: absolute; left:425px;top:245px;"
							<c:if test="${cookie.username.value != null	 }">checked="checked"</c:if> /><span
							style="position: absolute; left:455px;top:242px;">记住密码</span> </label></li>

				</ul>
			</div>
		</form>
	</div>

	<div class="loginbm">版权所有 银杏树信息服务有限公司 2017 仅供学习交流，勿用于任何商业用途</div>
</body>
</html>

