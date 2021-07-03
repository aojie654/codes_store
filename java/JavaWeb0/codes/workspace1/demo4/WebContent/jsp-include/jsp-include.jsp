<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8"); //设置编码格式，解决参数传递的乱码问题 %>
	<jsp:include  page="showDog.jsp">
		<jsp:param name="nickName" value="大哈"/>
		<jsp:param name="dogSpecies" value="哈士奇"/>
	</jsp:include>
</body>
</html>