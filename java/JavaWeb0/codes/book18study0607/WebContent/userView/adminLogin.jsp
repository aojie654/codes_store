<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>adminLogin</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

</head>
<body>
	<center>
		<jsp:include page="../common/head.jsp">
			<jsp:param value="common" name="type" />
		</jsp:include>
		<form
			action="<%=request.getContextPath() %>/servlet/Index?requestType=adminLogin"
			method="post" name="ad">
			<table width="550" align="center">
				<tr>
					<td height="30" align="center" colspan="4">管理员登陆</td>
				</tr>
				<tr>
					<td bgcolor="#008B8B" width="100%" height="5" colspan="3"></td>
				</tr>
				<tr height="10px"></tr>
				<tr>
					<td align="center" width="20%" height="30px">用户名:</td>
					<td><input type="text" name="name" size="20"></td>
				</tr>
				<tr>
					<td align="center" height="30px">密码:</td>
					<td><input type="password" name="password" size="20"></td>
				</tr>
				<tr>
					<td align="right" height="30px"><input type="submit"
						value="登陆"></td>
					<td align="center"><input type="reset" value="取消"></td>
					<td><a href="/BookStore/index.jsp" class="common">返回首页</a></td>
				</tr>
				<tr height="20px"></tr>
				<tr bgcolor="#008B8B">
					<td colspan="3" align="center"><small>友情提示:管理员用户名和密码均为<font
							color="#FF0000">admin</font></small></td>
				</tr>
			</table>
		</form>
		<br> <br> <br> <br>
		<%@include file="../common/bottom.jsp"%>
	</center>
</body>
</html>
