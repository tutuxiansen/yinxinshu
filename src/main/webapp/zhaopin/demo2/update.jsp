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

        <title>简历管理添加</title>
        <meta http-equiv="content-type" content="text/html;charset=utf-8">
        <link href="/css/mine.css" type="text/css" rel="stylesheet">
    </head>

    <body>

        <div class="div_head">
            <span>
                <span style="float:left">当前位置是：招聘管理-》简历管理-》简历登记</span>
                <span style="float:right;margin-right: 8px;font-weight: bold">
                    <a style="text-decoration: none" href="list.html">【返回】</a>
                </span>
            </span>
        </div>
        <div></div>

        <div style="font-size: 13px;margin: 10px 5px">
            <form action="resume/updateResume.do" method="post" >
            <input type="hidden" name="resumeId" value="${resume.resumeId }" />
            <table border="1" width="100%" class="table_a">
                <tr>
                    <td width="120px;">应聘职位名称<span style="color:red">*</span>：</td>
                    <td>
					<select ><!-- name="resumePosition" -->
						<option>---请选择---</option>
						<option>---技术培训师---</option>
					
					</select>
					
					</td>
                </tr>
				
                <tr>
                    <td>应聘职位编码<span style="color:red">*</span>：</td>
                    <td>
                       <input type="text"  /> <!-- name="resumeCode"  -->
                    </td>
                </tr>
               
                <tr>
                    <td>职位分类<span style="color:red">*</span>：</td>
                    <td>
						<input type="text"  /></td><!-- name="resumeClass"  -->
                </tr>
                <tr>
                    <td>姓名<span style="color:red">*</span>：</td>
                    <td>
						<input type="text"  name="resumeName" value="${resume.resumeName }" />
					</td>
                </tr>
                <tr>
                    <td>性别<span style="color:red">*</span>：</td>
                    <td>
                        <input type="text" name="resumeGender" value="${resume.resumeGender }"  />
                    </td>
                </tr>


				<tr>
                    <td>招聘类型<span style="color:red">*</span>：</td>
                    <td>
                       <select ><!-- name="resumeType" -->
						<option>-请选择-</option>
						<option>社会招聘</option>
						<option>校园招聘</option>
					   </select>
                    </td>                
                </tr>

				<tr>
                    <td>EMAIL：</td>
                    <td>
                        <input type="text" name="resumeEmail" value="${resume.resumeEmail }" />
                    </td>                
                </tr>

				<tr>
                    <td>联系电话：</td>
                    <td>
                        <input type="text" name="resumePhone" value="${resume.resumePhone }" />
                    </td>                
                </tr>


				<tr>
                    <td>住址：</td>
                    <td>
                        <input type="text" name="resumeAddress" value="${resume.resumeAddress }" />
                    </td>                
                </tr>
				<tr>
                    <td>政治面貌：</td>
                    <td>
                        <input type="text" name="resumeIdentity" value="${resume.resumeIdentity }"/>
                    </td>                
                </tr>
				<tr>
                    <td>身份证号：</td>
                    <td>
                        <input type="text" name="resumeIdnumber" value="${resume.resumeIdnumber }" />
                    </td>                
                </tr>
				<tr>
                    <td>毕业院校：</td>
                    <td>
                        <input type="text" name="resumeCollege" value="${resumeCollege }" />
                    </td>                
                </tr>	

				<tr>
                    <td>学历：</td>
                    <td>
						  <select ><!-- name="resumeEducation" -->
						<option>-请选择-</option>
						<option>本科</option>
						<option>硕士</option>
					   </select>
                    </td>
                </tr>
				<tr>
                    <td>专业：</td>
                    <td>
                        <input type="text" name="resumeMajor" value="${resume.resumeMajor }" />
                    </td>                
                </tr>
					<tr>
                    <td>工作经验：</td>
                    <td>
                        <input type="text" name="resumeExperience" value="${resume.resumeExperience }" />
                    </td>                
                </tr>
					<tr>
                    <td>薪资要求：</td>
                    <td>
                        <input type="text" name="resumeMoney" value="${resume.resumeMoney }" />（月薪）
                    </td>                
                </tr>
					<tr>
                    <td>是否在职：</td>
                    <td>
                        <select ><!-- name="resumeWork" -->
							<option>-请选择-</option>
							<option>在职</option>
							<option>离职</option>
						</select>
                    </td>                
                </tr>
					<tr>
                    <td>是否应届生：</td>
                    <td>
                         <select ><!-- name="resumeStudent" -->
							<option>-请选择-</option>
							<option>应届</option>
							<option>毕业</option>
						</select>
                    </td>                
                </tr>
				</tr>
					<tr>
                    <td>登记时间：</td>
                    <td>
                        <input type="text" name="resumeTime" value="${resume.resumeTime }" />
                    </td>                
                </tr>
				</tr>
					<tr>
                    <td>个人履历：</td>
                    <td>
                       <textarea cols="70" rows="13" name="resumeResume" >${resume.resumeResume }</textarea>
                    </td>                
                </tr>
				</tr>
					<tr>
                    <td>简历附件：</td>
                    <td>
                        <input type="file" name="resumeEnclosure" ${resume.resumeEnclosure } />
                    </td>                
                </tr>
				</tr>
					<tr>
                    <td>是否有人推荐面试：</td>
                    <td>
                      <select ><!-- name="resumeRecommend" -->
							<option>-请选择-</option>
							<option>是</option>
							<option>否</option>
						</select>
						推荐人：<input type="text" name="resumeRecommender" value="resume.resumeRecommender" >
						推荐时间：<input type="text" name="resumeRecommendTime" value="${resume.resumeRecommendTime }">
                    </td>                
                </tr>
				</tr>
					<tr>
                    <td>推荐面试意见：</td>
                    <td>
                       <textarea cols="70" rows="13" name="resumeRecommendOpinion">${resume.resumeRecommendOpinion }</textarea>
                    </td>                
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="保存">
						<input type="button" value="返回">
                    </td>
                </tr>  
            </table>
            </form>
        </div>
    </body>
</html>