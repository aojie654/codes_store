<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="service.CategoryService"%>
<%
 	request.setCharacterEncoding("utf-8");
	String[] ids =request.getParameterValues("deleteId");//得到delete对应的多个值
	CategoryService categoryService = new CategoryService();//得到service 对象
	
	categoryService.deleteCategoryMutil(ids);//执行多重删除操
	response.sendRedirect("categoryManage1.jsp");
%>