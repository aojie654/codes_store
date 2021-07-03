<%@ page import="demo.Time"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示时间</title>
</head>
<body>
<%-- jsp注释！可以保留到java中 --%>
<!-- html注释，可以保留到客户端 -->

<%--使用脚本语言 --%>
<%String time = Time.showTime();
	int i=10;
%>
<%--使用表达式 --%>
<h2>当前时间：<%=time%></h2>
<h3>当前时间：<%=Time.showTime()%></h3>
<h3><%=1+2%></h3>
</body>
</html>