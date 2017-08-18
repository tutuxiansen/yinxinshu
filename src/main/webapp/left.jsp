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

        <meta http-equiv=content-type content="text/html; charset=utf-8" />
        <link href="css/admin.css" type="text/css" rel="stylesheet" />
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
    <body background=img/menu_bg.jpg >
        <table height="100%" cellspacing=0 cellpadding=0 width=170   background=./img/menu_bg.jpg border=0>
            <tr>
                <td valign=top align=middle>
                    <table cellspacing=0 cellpadding=0 width="100%" border=0>
						<tr>
                            <td height=10></td>
						</tr>
					</table>
                    <table cellspacing=0 cellpadding=0 width=150 border=0>
                        <tr height=22>
                            <td style="padding-left: 30px" background=./img/menu_bt.jpg>
							   <a     class=menuparent onclick=expand(1)  href="javascript:void(0);">个人信息</a>
							 </td>
						</tr>
                        <tr height=4>
                            <td></td>
						</tr>
					</table>
                    <table id=child1 style="display: none" cellspacing=0 cellpadding=0  width=150 border=0>
                        
						<tr height=20>
                            <td align=middle width=30>
								<img height=9 src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="msg.jsp"  target="right">个人信息修改</a>
							</td>
						</tr>
                        <tr height=20>
                            <td align=middle width=30>
								<img height=9   src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="password.jsp"  target="right">密码修改</a>
							</td>
						</tr>
                       
                        <tr height=4>
                            <td colspan=2></td>
						</tr>
					</table>
                    
					<table cellspacing=0 cellpadding=0 width=150 border=0>
                        <tr height=22>
                            <td style="padding-left: 30px" background=./img/menu_bt.jpg>
							   <a     class=menuparent onclick=expand(2)    href="javascript:void(0);">薪酬管理</a>
							 </td>
						</tr>
                        <tr height=4>
                            <td></td>
						</tr>
					</table>		
							
					<table id=child2 style="display: none" cellspacing=0 cellpadding=0  width=150 border=0>
                        
						<tr height=20>
                            <td align=middle width=30>
								<img height=9  src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="salmanager/fenye.do"   target="right">薪酬标准管理</a>
							</td>
						</tr>
						
						<tr height=20>
                            <td align=middle width=30>
								<img height=9  src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="salmanager/shenpifenye.do"   target="right">薪酬标准审批</a>
							</td>
						</tr>
						
						
                        <tr height=20>
                            <td align=middle width=30>
								<img height=9 src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="salmanager/fafangfenye.do"  target="right">薪酬发放管理</a>
							</td>
						</tr>
						
                        <tr height=4>
                            <td colspan=2></td>
						</tr>
					</table>
					
					<table cellspacing=0 cellpadding=0 width=150 border=0>
                        <tr height=22>
                            <td style="padding-left: 30px" background=./img/menu_bt.jpg>
							   <a     class=menuparent onclick=expand(3)    href="javascript:void(0);">人事管理</a>
							 </td>
						</tr>
                        <tr height=4>
                            <td></td>
						</tr>
					</table>		
							
					<table id=child3 style="display: none" cellspacing=0 cellpadding=0  width=150 border=0>
                        <tr height=20>
                            <td align=middle width=30>
								<img height=9  src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="pmag/demo1/list.html"   target="right">人事档案管理</a>
							</td>
						</tr>
						 <tr height=20>
                            <td align=middle width=30>
								<img height=9  src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="pmag/demo1/list2.html"   target="right">人事档案审批</a>
							</td>
						</tr>
						
                        <tr height=4>
                            <td colspan=2></td>
						</tr>
					</table>	
					
					<table cellspacing=0 cellpadding=0 width=150 border=0>
                        <tr height=22>
                            <td style="padding-left: 30px" background=./img/menu_bt.jpg>
							   <a     class=menuparent onclick=expand(4)    href="javascript:void(0);">招聘管理</a>
							 </td>
						</tr>
                        <tr height=4>
                            <td></td>
						</tr>
					</table>		
							
					<table id=child4 style="display: none" cellspacing=0 cellpadding=0  width=150 border=0>
                        <tr height=20>
                            <td align=middle width=30>
								<img height=9  src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="recruit/queryAll.do"   target="right">职位发布管理</a>
							</td>
						</tr>
                        <tr height=20>
                            <td align=middle width=30>
								<img height=9 src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="resume/queryAll.do"  target="right">简历管理</a>
							</td>
						</tr>
						<tr height=20>
                            <td align=middle width=30>
								<img height=9 src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="resume/queryAll2.do"  target="right">面试管理</a>
							</td>
						</tr>
						
						<tr height=20>
                            <td align=middle width=30>
								<img height=9 src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="resume/queryAll3.do"  target="right">录用管理</a>
							</td>
						</tr>
						
                        <tr height=4>
                            <td colspan=2></td>
						</tr>
					</table>	

					
					<table cellspacing=0 cellpadding=0 width=150 border=0>
                        <tr height=22>
                            <td style="padding-left: 30px" background=./img/menu_bt.jpg>
							   <a     class=menuparent onclick=expand(5)    href="javascript:void(0);">培训管理</a>
							 </td>
						</tr>
                        <tr height=4>
                            <td></td>
						</tr>
					</table>		
							
					<table id=child5 style="display: none" cellspacing=0 cellpadding=0  width=150 border=0>
                        <tr height=20>
                            <td align=middle width=30>
								<img height=9  src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="px/list.do"   target=right >培训计划</a>
							</td>
						</tr>
                        <tr height=20>
                            <td align=middle width=30>
								<img height=9 src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="px/list2.do"  target="right">培训复核</a>
							</td>
						</tr>
						<tr height=20>
                            <td align=middle width=30>
								<img height=9 src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="px/list3.do"  target="right">培训考核与反馈</a>
							</td>
						</tr>
						
                        <tr height=4>
                            <td colspan=2></td>
						</tr>
					</table>	
					
					<table cellspacing=0 cellpadding=0 width=150 border=0>
                        <tr height=22>
                            <td style="padding-left: 30px" background=./img/menu_bt.jpg>
							   <a     class=menuparent onclick=expand(6)    href="javascript:void(0);">数据分析</a>
							 </td>
						</tr>
                        <tr height=4>
                            <td></td>
						</tr>
					</table>		
							
					<table id=child6 style="display: none" cellspacing=0 cellpadding=0  width=150 border=0>
                        <tr height=20>
                            <td align=middle width=30>
								<img height=9  src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="emp/queryByIf.do"   target="right">职员明细表</a>
							</td>
						</tr>
                        <tr height=20>
                            <td align=middle width=30>
								<img height=9 src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="emp/queryEducation.do"  target="right">职员数据综合报表</a>
							</td>
						</tr>
						<tr height=20>
                            <td align=middle width=30>
								<img height=9 src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="headQ/queryAll.do"  target="right">职员异动情况统计分析</a>
							</td>
						</tr>
						<tr height=20>
                            <td align=middle width=30>
								<img height=9 src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="reser/queryByName.do"  target="right">储备人才统计表</a>
							</td>
						</tr>
						
						<tr height=20>
                            <td align=middle width=30>
								<img height=9 src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="datamsg/demo5/list.html"  target="right">公司各体系结构分析</a>
							</td>
						</tr>
						
                        <tr height=4>
                            <td colspan=2></td>
						</tr>
					</table>	
					
                    
					<table cellspacing=0 cellpadding=0 width=150 border=0>
                        <tr height=22>
                            <td style="padding-left: 30px" background=./img/menu_bt.jpg>
							   <a     class=menuparent onclick=expand(7)    href="javascript:void(0);">系统管理</a>
							 </td>
						</tr>
                        <tr height=4>
                            <td></td>
						</tr>
					</table>		
							
					<table id=child7 style="display: none" cellspacing=0 cellpadding=0  width=150 border=0>
                        <tr height=20>
                            <td align=middle width=30>
								<img height=9  src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="resource/demo1/ifm.jsp"   target="right">部门管理</a>
							</td>
						</tr>
                        <tr height=20>
                            <td align=middle width=30>
								<img height=9 src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="user/listUser.do"  target="right">用户管理</a>
							</td>
						</tr>
						<tr height=20>
                            <td align=middle width=30>
								<img height=9 src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="position/list.do"  target="right">职位设置</a>
							</td>
						</tr>
						
						<tr height=20>
                            <td align=middle width=30>
								<img height=9 src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="menu/list.do"  target="right">菜单管理</a>
							</td>
						</tr>
						
						
						<!--
						<tr height=20>
                            <td align=middle width=30>
								<img height=9 src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="resource/demo4/list.html"  target="right">职称设置</a>
							</td>
						</tr>
						
						x
						<tr height=20>
                            <td align=middle width=30>
								<img height=9 src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="resource/demo5/list.html"  target="right">题库管理设置</a>
							</td>
						</tr>
						
						-->
						<!--
						<tr height=20>
                            <td align=middle width=30>
								<img height=9 src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="resource/demo6/list.html"  target="right">公共属性设置</a>
							</td>
						</tr>
					
						<tr height=20>
                            <td align=middle width=30>
								<img height=9 src="./img/menu_icon.gif" width=9>
							</td>
                            <td>
								<a class=menuchild  href="resource/demo7/list.html"  target="right">酬薪项目设置</a>
							</td>
						</tr>	

	                      -->						
                        <tr height=4>
                            <td colspan=2></td>
						</tr>
					</table>						
				</td>
                <td width=1 bgcolor=#d1e6f7></td>
            </tr>
        </table>
    </body>
</html>