<%@page import="service.CategoryService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<% 
		String categoryId = (String)request.getParameter("categoryId");
		System.out.println(categoryId);
		CategoryService categoryService = new CategoryService();	
		categoryService.deleteCategory(categoryId);
		response.sendRedirect("categoryManage.jsp");//删除后跳转category查询
%>