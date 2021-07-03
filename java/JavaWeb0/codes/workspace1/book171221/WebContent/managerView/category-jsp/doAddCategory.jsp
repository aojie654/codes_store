<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="service.*" %>
<%@ page import="bean.*" %>
<%
	request.setCharacterEncoding("utf-8");
	String categoryName = request.getParameter("categoryName");
		
	BookService bs= new BookService();
	bs.addCategory(categoryName);
	
	try {
		response.sendRedirect("categoryManage.jsp");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
%>