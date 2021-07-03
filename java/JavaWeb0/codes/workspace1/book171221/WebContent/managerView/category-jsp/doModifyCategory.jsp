<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="service.*" %>
<%@ page import="java.io.IOException" %>
<%@ page import="bean.*" %>
<%
	request.setCharacterEncoding("utf-8");
	BookService bookService = new BookService();
	bookService.modifyCategory(request,response);//注释1
%>