<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
  String realPath = application.getRealPath("");
  String projectName=	application.getContextPath();
  String serverInfo=	application.getServerInfo();
%>
<p>realPath=<%=realPath %></p>
<p>projectName=<%=projectName %></p>
<p>serverInfo=<%=serverInfo %></p>
</body>
</html>