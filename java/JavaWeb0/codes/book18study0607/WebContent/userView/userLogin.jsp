<%@ page language="java" pageEncoding="UTF-8"%>

<!-- 功能：将登陆、注册提示界面整合到一起 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>login</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

</head>

<body>
	<jsp:include page="../common/head.jsp">
		<jsp:param value="common" name="type" />
	</jsp:include>
	<form
		action="<%=request.getContextPath() %>/servlet/Index?requestType=userLogin"
		method="post">
		<table width="500" align="center">
			<tr>
				<td height="30" align="center" colspan="3">欢迎登陆</td>
			</tr>
			<tr>
				<td bgcolor="#008B8B" width="100%" height="5" colspan="3"></td>
			</tr>
			<tr>
				<td align="center" width="20%" height="30px">用户名 :</td>
				<td width="30%"><input type="text" name="username"></td>
				<td></td>
			</tr>
			<tr>
				<td align="center" height="30px">密码:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center" height="30px"><input
					type="submit" value="登录" name="button1"></td>
			</tr>
			<tr>
				<td align="right" colspan="3" height="30px">没有注册？<input
					type="button" name="register" value="新用户注册"
					onClick="document.location.href='./register.jsp'">
				</td>
			</tr>
		</table>
	</form>

	<br>
	<br>
	<br>
	<%@include file="../common/bottom.jsp"%>
</body>

</html>
