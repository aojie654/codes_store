<%@ page language="java" import="bean.*" pageEncoding="UTF-8"%>

<!-- 功能：用户退出登陆界面 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>用户退出</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


</head>  
<body>
	<jsp:include page="../common/head.jsp">
		<jsp:param value="noMenu" name="type"/>
	</jsp:include>	
	<center>
	<table >
		<tr height="40">
		<%session.invalidate(); %>
		<td >尊敬的用户,您已经推出本系统，欢迎您的使用！</td>
		</tr>
		<tr>
		<td  height="40" align="center"><a class="common" href="<%=request.getContextPath() %>/index.jsp">返回主页</a>||
		<a class="common" href="<%=request.getContextPath() %>/userView/userLogin.jsp">重新登录</a>
		</td>
		</tr>	
	</table>
	</center>
	<%@include file="../common/bottom.jsp"%>
