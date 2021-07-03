<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="dao.*" %>
<%@ page import="service.*" %>
<%@ page import="java.io.IOException" %>
<% 
	String id =request.getParameter("categoryId");
	BookService bookService = new BookService();
	bookService.deleteCategory(id);
	try {
		response.sendRedirect("categoryManage.jsp");
	} catch (IOException e) { 
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

%>