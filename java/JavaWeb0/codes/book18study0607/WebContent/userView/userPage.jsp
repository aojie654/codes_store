<%@ page language="java" import="bean.*" pageEncoding="UTF-8"%>

<!-- 功能：登陆后的用户首页 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>userpage</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

</head>
<body>
	<table width="750" border="0" align=center>
		<tr>
			<td colspan="2"><jsp:include page="../common/head.jsp">
					<jsp:param value="user" name="type" />
				</jsp:include></td>
		</tr>
		<tr>
			<%@include file="../common/content.jsp"%>
		</tr>
		<tr>
			<td colspan="2"><%@include file="../common/bottom.jsp"%></td>
		</tr>
	</table>
</body>
</html>
