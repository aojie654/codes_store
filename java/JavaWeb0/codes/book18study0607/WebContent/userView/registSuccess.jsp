<%@ page language="java" pageEncoding="UTF-8"%>

<!-- 功能：用户注册成功提示界面 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>registSuccess</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

</head>

<body>
	<jsp:include page="../common/head.jsp">
		<jsp:param value="noMenu" name="type" />
	</jsp:include>
	<form>
		<table width="100%">
			<tr>
				<td width="100%" align="center">恭喜您,注册成功!</td>
			</tr>
			<tr>
				<td width="100%" align="center">您现在可以<a
					href="<%=request.getContextPath() %>/userView/userLogin.jsp">登陆</a>|<a
					href="<%=request.getContextPath() %>/index.jsp">进入首页</a></td>
			</tr>
		</table>
	</form>
	<%@include file="../common/bottom.jsp"%>
</body>
</html>
