<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="bean.*" %>
<%@ page import="service.*" %>
<%@ page import="java.io.IOException" %>
<%
	request.setCharacterEncoding("utf-8");//解码！
	
	String name=request.getParameter("name");
	String realName=request.getParameter("realName");
	String phone=request.getParameter("phone");
	String email=request.getParameter("email");
	String address=request.getParameter("address");
	String age=request.getParameter("age");
	String sex=request.getParameter("sex");

	//int id, String name, String pass, String sex, int age, int role, String realName, String phone, String email, String address, Date registerDate
	User user = new User(name,realName,phone,email,address,age,sex); 
	UserService us= new UserService();
	us.insertUser(user); 
	 
	response.sendRedirect("userManage.jsp");

%>