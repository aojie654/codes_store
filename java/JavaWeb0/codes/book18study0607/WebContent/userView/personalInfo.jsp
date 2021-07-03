<%@ page language="java" import="bean.*" pageEncoding="UTF-8"%>

<!-- 功能：用户个人信息显示界面 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>personalInfo</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<%
		User user = (User) session.getAttribute("userInfo");
%>
</head>
<body>
	<jsp:include page="../common/head.jsp">
		<jsp:param value="user" name="type" />
	</jsp:include>
	<center>
		<table align="center" width="600">
			<tr>
				<td height="30" align="center" colspan="2">用户详细信息</td>
			</tr>
			<tr>
				<td bgcolor="#008B8B" width="100%" height="5" colspan="2"></td>
			</tr>
			<tr height="30">
				<td width=50%>用户名：<%=user.getName() %></td>
				<td>真实姓名：<%=user.getRealName() %></td>
			</tr>
			<tr height="30">
				<td>性别：<%=user.getSex() %></td>
				<td>年龄：<%=user.getAge() %></td>
			</tr>
			<tr height="30">
				<td>Email:<%=user.getEmail() %></td>
				<td>联系方式：<%=user.getPhone() %></td>
			</tr>
			<tr height="30">
				<td width=50>联系地址：<%=user.getAddress() %></td>
				<td>注册时间：<%=user.getRegisterDate() %></td>
			</tr>
		</table>
		<br>
	</center>
	<%@include file="../common/bottom.jsp"%>
</body>
</html>
