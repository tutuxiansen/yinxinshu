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
        <link href="../css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：-》薪酬标准管理》添加</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="salmanager/fenye.do">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form  action="salmanager/insert.do"  method="post">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">薪酬标准编号<span style="color:red">*</span>：</td>
                    <td><input type="text" name="salCode"  /></td>
                </tr>
                <tr>
                    <td>薪酬标准名称<span style="color:red">*</span>：</td>
                    <td>
                       <input type="text" name="salType" /> 
                    </td>
                </tr>
               
                <tr>
                    <td>制定人<span style="color:red">*</span>：</td>
                    <td>
						<input type="text" name="makePeople"  /></td>
                </tr>
                <tr>
                    <td>登记人<span style="color:red">*</span>：</td>
                    <td>
						<input type="text"  name="loginPeole" />
					</td>
                </tr>
                <tr>
                    <td>登记时间<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="auditTime" />
                    </td>
                </tr>


				<tr>
                    <td>基本工资<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="salBase" />元
                    </td>                
                </tr>

				<tr>
                    <td>绩效奖金：</td>
                    <td>
                        <input type="text" name="bonusMoney"/>元
                    </td>                
                </tr>

				<tr>
                    <td>交通补助：</td>
                    <td>
                        <input type="text" name="trafficMoney"/>元
                    </td>                
                </tr>

				<tr>
                    <td>通讯补助：</td>
                    <td>
                        <input type="text" name="callMoney"/>元
                    </td>                
                </tr>

				<tr>
                    <td>餐补：</td>
                    <td>
                        <input type="text" name="eatMoney"/>元
                    </td>                
                </tr>
				<tr>
                    <td>住房补助：</td>
                    <td>
                        <input type="text" name="houseMoney" />元
                    </td>                
                </tr>
				<tr>
                    <td>出差补助：</td>
                    <td>
                        <input type="text" name="workoutMoney"/>元
                    </td>                
                </tr>
				<tr>
                    <td>加班补助：</td>
                    <td>
                        <input type="text" name="overtimeMoney"/>元
                    </td>                
                </tr>	

				<tr>
                    <td>薪酬总额：</td>
                    <td>
						 <input type="text"  name="sumMoney"/>元
                    </td>
                </tr>


				<tr>
                    <td>备注：</td>
                    <td>
                        <input type="text" name="salRemarks"/>
                    </td>                
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="添加"  />
						<input type="reset" value="清空"/>
                    </td>
                </tr>  
            </table>
            </form>
        </div>
    </body>
</html>