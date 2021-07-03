<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="dao.*"%>
<%@ page import="service.*"%>
<%@ page import="java.io.IOException"%>
<%
	//把所有的被选上的id取过来！
	String[] ids=request.getParameterValues("delete");
	
	UserService userService = new UserService();
	userService.deleteUsers(ids);   
	response.sendRedirect("userManage.jsp");

%>