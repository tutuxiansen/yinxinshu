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
     <script type="text/javascript">
   /*  function fun(){
		var form = document.getElementsByTagName("form")[0];
		if(form){
			form.action = "px/xuigai4.do";
			form.submit();
		}
    } */
    function aa(){
    	window.history.back();

    	}
    </script>
<base href="<%=basePath%>">

        <title>培训管理</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="../../css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》培训管理 -》培训反馈</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                     <input type="button" value="返回" onclick="aa();"/>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
         <form action="px/xuigai5.do" method="post" name="query" >
             <input type="hidden" name="pxId" value="${px.pxId }" />
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">培训名称<span style="color:red">*</span>：</td>
                    <td><input type="text" name="pxName" value="${ px.pxName}" /></td>
                </tr>
                <tr>
                    <td>培训讲师<span style="color:red">*</span>：</td>
                    <td>
                       <input type="text" name="pxJiangshi" value="${ px.pxJiangshi}" /> 
                    </td>
                </tr>
               
                <tr>
                    <td>培训时间<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" name="pxTime" value="${ px.pxTime}" /></td>
                </tr>
                <tr>
                    <td>至</td>
                    <td>
                    <input type="text" readonly name="pxEnd" value="${ px.pxEnd}" />
						
					</td>
                </tr>
                <tr>
                    <td>培训目的<span style="color:red">*</span>：</td>
                    <td>
                        <textarea name="pxMudi">${ px.pxMudi}</textarea>
                    </td>
                </tr>


				<tr>
                    <td>参训人员<span style="color:red">*</span>：</td>
                    <td>
                        <textarea name="pxCxry">${ px.pxCxry}</textarea>
                    </td>                
                </tr>

				<tr>
                    <td>培训简介：</td>
                    <td>
                        <textarea name="pxJianjie">${ px.pxJianjie}</textarea>
                    </td>                
                </tr>

				<tr>
                    <td>培训资料：</td>
                    <td>
                        <input type="file" name="pxZiliao" value=""/>
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
						<textarea name="pxShyj">${px.pxShyj }</textarea>
					</td>
				</tr>
            </table>


        </div>
	<hr>
	培训反馈
		<div style="font-size: 13px;margin: 10px 5px">
			 <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">培训反馈<span style="color:red">*</span>：</td>
                    <td><select name="pxFankui" value="${px.pxFankui }">
						<option>请选择</option>
						<option>优</option>
						<option>良</option>
						<option>差</option>
					</select></td>
                </tr>
                <tr>
                    <td>培训总结<span style="color:red">*</span>：</td>
                    <td>
                      <textarea name="pxZongjie">${px.pxZongjie }</textarea>
                    </td>
                </tr>
               
                <tr>
                    <td>考核结果<span style="color:red">*</span>：</td>
                    <td>
						<textarea name="pxShjg">${px.pxShjg }</textarea>
					</td>
                </tr>
                 <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="保存">
                    </td>
                </tr>  
				
            </table>
		   </form>
		</div>
    </body>
</html>