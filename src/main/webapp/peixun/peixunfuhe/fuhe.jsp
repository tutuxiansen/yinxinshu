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

        <title>培训管理</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="../../css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》培训管理 -》培训复核</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="../peixunfuhe/list.html">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="./admin.php?c=goods&a=add" method="post" enctype="multipart/form-data">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">培训名称<span style="color:red">*</span>：</td>
                    <td><input type="text" name="f_goods_name" readonly value="技术专家和教学专家的合作" /></td>
                </tr>
                <tr>
                    <td>培训讲师<span style="color:red">*</span>：</td>
                    <td>
                       <input type="text" name="f_goods_name" readonly value="杨驰" /> 
                    </td>
                </tr>
               
                <tr>
                    <td>培训时间<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" name="f_goods_price" readonly value="2013-10-10" /></td>
                </tr>
                <tr>
                    <td>至</td>
                    <td>
						<input type="text" readonly name="f_goods_image" readonly value="2013-12-10" />
					</td>
                </tr>
                <tr>
                    <td>培训目的<span style="color:red">*</span>：</td>
                    <td>
                        <textarea readonly>一个新开辟领域的探讨，探讨摸索</textarea>
                    </td>
                </tr>


				<tr>
                    <td>参训人员<span style="color:red">*</span>：</td>
                    <td>
                        <textarea readonly >李明、 潘贞玉、 李治、 武欣、 孙威、 韩健、 周嵘、 李红、 乔伟、 冯娜娜、 王艳丽、 蒋红林、 韩露、 于学杰、 李娜、 王俊鑫、 田仲义、 袁震</textarea>
                    </td>                
                </tr>

				<tr>
                    <td>培训简介：</td>
                    <td>
                        <textarea readonly >技术专家和教学专家合作开发技术类课程的方法，包括开发流程、岗位职责与沟通方式。</textarea>
                    </td>                
                </tr>

				<tr>
                    <td>培训资料：</td>
                    <td>
                        <input type="file" name="f_goods_image" value=""/>
                    </td>                
                </tr>

				<tr>
                    <td></td>
                    <td>
                        <a href="" >技术专家和教学专家的合作.zip</a> &nbsp;&nbsp;<a href="">删除</a>
                    </td>                
                </tr>
				<tr>
					<td>审核意见：</td>
					<td>
						<textarea></textarea>
					</td>
				</tr>
				
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="审核通过">
						<input type="button"  value="驳回">
                    </td>
                </tr>  
            </table>
            </form>
        </div>
    </body>
</html>