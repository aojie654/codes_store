
<%@ page import="dao.*" %>
<%@ page import="service.*" %>
<%@ page import="java.io.IOException" %>
<%
	String id =request.getParameter("userId");
	UserService userService = new UserService();
	userService.deleteUser(id); 
	response.sendRedirect("userManage.jsp");

%>