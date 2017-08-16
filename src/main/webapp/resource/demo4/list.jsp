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

        <title>薪酬标准管理</title>

        <link href="../../css/mine.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <style>
            .tr_color{background-color: #9F88FF}
        </style>
        <div class="div_head">
            <span>
                <span style="float: left;">当前位置是：系统设置-》职称管理</span>
                <span style="float: right; margin-right: 8px; font-weight: bold;">
                    <a style="text-decoration: none;" href="add.html">【添加】</a>
					<a style="text-decoration: none;" href="#">【删除】</a>
                </span>
            </span>
        </div>
        <div></div>
        <div class="div_search">
            <span>
                <form action="#" method="get">
                    职称名称: 
					<input type="text"  />
					 所属部门 
					<input type="text"  />
					 状态
					<select>
							<option>是</option>
							<option>否</option>
						</select>
                    <input value="查询" type="submit" />
					
                </form>
            </span>
        </div>
        <div style="font-size: 13px; margin: 10px 5px;">
            <table class="table_a" border="1" width="100%">
                <tbody><tr style="font-weight: bold;">
                        <td width="40px;">序号</td>
                        <td width="30px;"><input type="checkbox" /></td>						
                        <td width="80px;">职称编码</td>
                        <td >职称名称</td>
						<td width="100px;">所属部门</td>
                        <td width="120px;">是否启用</td>                       
                        <td align="center" width="100px;">操作</td>
                    </tr>

                    <tr id="product1">
                        <td>1</td>
                        <td><input type="checkbox" /></td>
						<td>QMXC-001002</td>
                        <td><a href="view.html">高级技术顾问</a></td> 
						<td>人力资源部</td> 						
                        <td>是</td>
                        <td>
							<a href="add.html">修改</a>						   
							<a href="#">删除</a>
						</td>                        
                    </tr> 
					 <tr id="product1">
                        <td>1</td>
                        <td><input type="checkbox" /></td>
						<td>QMXC-001002</td>
                        <td><a href="view.html">高级技术顾问</a></td> 
						<td>人力资源部</td> 						
                        <td>是</td>
                        <td>
							<a href="add.html">修改</a>						   
							<a href="#">删除</a>
						</td>                        
                    </tr> 
					 <tr id="product1">
                        <td>1</td>
                        <td><input type="checkbox" /></td>
						<td>QMXC-001002</td>
                        <td><a href="view.html">高级技术顾问</a></td> 
						<td>人力资源部</td> 						
                        <td>是</td>
                        <td>
							<a href="add.html">修改</a>						   
							<a href="#">删除</a>
						</td>                        
                    </tr> 
					 <tr id="product1">
                        <td>1</td>
                        <td><input type="checkbox" /></td>
						<td>QMXC-001002</td>
                        <td><a href="view.html">高级技术顾问</a></td> 
						<td>人力资源部</td> 						
                        <td>是</td>
                        <td>
							<a href="add.html">修改</a>						   
							<a href="#">删除</a>
						</td>                        
                    </tr> 
					 <tr id="product1">
                        <td>1</td>
                        <td><input type="checkbox" /></td>
						<td>QMXC-001002</td>
                        <td><a href="view.html">高级技术顾问</a></td> 
						<td>人力资源部</td> 						
                        <td>是</td>
                        <td>
							<a href="add.html">修改</a>						   
							<a href="#">删除</a>
						</td>                        
                    </tr> 
					
					
                    <tr>
                        <td colspan="20" style="text-align: center;">						
						<a style="text-decoration: none;" href="#">
                            首页 上一页  ... 7 8 9 10 11 12 ... 下一页 尾页 共1234条 每页显示 10/23 </a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>