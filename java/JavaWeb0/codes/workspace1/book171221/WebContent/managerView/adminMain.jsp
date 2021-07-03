<%@ page language="java" import="dao.*,bean.*"
	pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'categoryManage.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<style type="text/css">
	span.name{
		color:red;
	}
	
</style>
</head>
<body>
	<jsp:include page="../common/head.jsp">
		<jsp:param value="admin" name="type"/>
	</jsp:include>
	<table align="center" width="750">
		<tr>
			<td width=140 align="center">
			<%@include file="../common/adminMenu.jsp" %>
			</td>
			<td width=550 align="center">管理员，<span class="name"><%=((User)session.getAttribute("admin")).getName()%></span>你好！请选择左侧的菜单进行相应的操作！</td>
		</tr>
	</table>
	<table align="center">
		<tr>
			<td ><%@include file="../common/bottom.jsp"%></td>
		</tr>
	</table>
</body>
</html>
