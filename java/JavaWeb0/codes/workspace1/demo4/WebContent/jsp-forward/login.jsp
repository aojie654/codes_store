<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
	<form action="loginValidate.jsp">
	<%--表单将提交到同一目录下的loginValidate.jsp页面。 --%>
		用户名：<input type="text" name="userName"/> <br><br>
		密码：<input type="password" name="userPwd"/> <br><br>
		<input type="submit" value="登录"/>
	</form>
</body>
</html>