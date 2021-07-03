<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>书店登录</title>
</head>
<body>
<h2>欢迎登录小二书店</h2>

<form action="doLogin.jsp">
<table border="1">
<%
   //清空缓存。js脚本
   session.invalidate();//让session失效！清空session中原先的信息，比如登录名。
   String error = (String)request.getAttribute("loginError");
%>
<% if(error!=null){ %>
<tr><td colspan="2" ><font color="red" size="1"><%=error %></font></td></tr>
<% } %>
<tr><td>用户名：</td><td><input type="text" name="user" size="10"></td></tr>
<tr><td>密码</td><td><input type="password" name="pass" size="12"></td></tr>
<tr><td colspan="2"><input type="submit" value="提交" ></td></tr>
</table>
</form>
<%@include file="bottom/foot.jsp" %>
</body>
</html>