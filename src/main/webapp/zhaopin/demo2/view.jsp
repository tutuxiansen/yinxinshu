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

        <title>薪酬标准管理</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="/css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：简历管理-》查看简历信息</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="resume/queryAll.do">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="./admin.php?c=goods&a=add" method="post" enctype="multipart/form-data">
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">应聘职位名称：</td>
                    <td><input type="text" name="f_goods_name" value="${resume.resumePosition }" /></td>
                </tr>
                <tr>
                    <td>应聘职位编码：</td>
                    <td>
                       <input type="text" name="f_goods_name" value="${resume.resumeCode }" /> 
                    </td>
                </tr>
               
                <tr>
                    <td>职位分类：</td>
                    <td>
						<input type="text" name="f_goods_price" value="${resume.resumeClass }" /></td>
                </tr>
                <tr>
                    <td>姓名：</td>
                    <td>
						<input type="text" readonly name="f_goods_image" value="${resume.resumeName }" />
					</td>
                </tr>
                <tr>
                    <td>性别：</td>
                    <td>
                        <select>
							<option>${resume.resumeGender }</option>
						</select>
                    </td>
                </tr>


				<tr>
                    <td>招聘类型：</td>
                    <td>
                       <select>
                      	<c:if test="${resume.resumeType==1 }">
                    			<option>社会招聘</option>
                    	</c:if>
						<c:if test="${resume.resumeType==2 }">
                    			<option>校园招聘</option>
                    	</c:if>
					   </select>
                    </td>                
                </tr>

				<tr>
                    <td>EMAIL：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="${resume.resumeEmail }"  />
                    </td>                
                </tr>

				<tr>
                    <td>联系电话：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="${resume.resumePhone }" />
                    </td>                
                </tr>


				<tr>
                    <td>住址：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="${resume.resumeAddress }" />
                    </td>                
                </tr>
				<tr>
                    <td>政治面貌：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="${resume.resumeIdentity }"  />
                    </td>                
                </tr>
				<tr>
                    <td>身份证号：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="${resume.resumeIdnumber }" />
                    </td>                
                </tr>
				<tr>
                    <td>毕业院校：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="${resume.resumeCollege }" />
                    </td>                
                </tr>	

				<tr>
                    <td>学历：</td>
                    <td>
						<input type="text" name="f_goods_image" value="${resume.resumeEducation }" />
                    </td>
                </tr>
				<tr>
                    <td>专业：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="${resume.resumeMajor }" />
                    </td>                
                </tr>
					<tr>
                    <td>工作经验：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="${resume.resumeExperience }" />
                    </td>                
                </tr>
					<tr>
                    <td>薪资要求：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="${resume.resumeMoney }" />（月薪）
                    </td>                
                </tr>
					<tr>
                    <td>是否在职：</td>
                    <td>
                        <select>
                        	<c:if test="${resume.resumeWork==1 }">
                    			<option>在职</option>
                    		</c:if>
							<c:if test="${resume.resumeWork==2 }">
                    			<option>离职</option>
                    		</c:if>
						</select>
                    </td>                
                </tr>
					<tr>
                    <td>是否应届生：</td>
                    <td>
                         <select>
                             <c:if test="${resume.resumeStudent==1 }">
                    			<option>是</option>
                    		</c:if>
							<c:if test="${resume.resumeStudent==2 }">
                    			<option>否</option>
                    		</c:if>
						</select>
                    </td>                
                </tr>
				</tr>
					<tr>
                    <td>登记时间：</td>
                    <td>
                        <input type="text" name="f_goods_image" value="${resume.resumeTime }" />
                    </td>                
                </tr>
				</tr>
					<tr>
                    <td>个人履历：</td>
                    <td>
                       <textarea cols="70" rows="13">${resume.resumeResume }</textarea>
                    </td>                
                </tr>
				</tr>
					<tr>
                    <td>简历附件：</td>
                    <td>
                        <a href="#">张华个人简历.doc</a>
                    </td>                
                </tr>
				</tr>
					<tr>
                    <td>是否推荐面试：</td>
                    <td>
                    <select>
                    <c:if test="${resume.resumeRecommend==1 }">
                    	<option>是</option>
                    </c:if>
					<c:if test="${resume.resumeRecommend==2 }">
                    	<option>否</option>
                    </c:if>
					</select>
						推荐人：<input type="text" value="${resume.resumeRecommender }">
						推荐时间：<input type="text" value="${resume.resumeRecommendTime }">
                    </td>                
                </tr>
				</tr>
					<tr>
                    <td>推荐面试意见：</td>
                    <td>
                       <textarea cols="70" rows="4">${resume.resumeRecommendOpinion }  </textarea>
                    </td>                
                </tr>
                <!-- <tr>
                    <td colspan="2" align="center">
						<input type="button" value="返回">
                    </td>
                </tr> -->  
            </table>
            </form>
        </div>
    </body>
</html>