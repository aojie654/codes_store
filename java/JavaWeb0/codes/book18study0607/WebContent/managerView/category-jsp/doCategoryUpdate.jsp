<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="service.*"%>
<%
	//实现对分类信息的添加操作
	request.setCharacterEncoding("utf-8");
	//1取得前一个页面传递的参数
	String name=request.getParameter("categoryName");
	String id=request.getParameter("categoryId");
	System.out.println(name);
	System.out.println(id);
	
	//2调用相关方法，对数据进行插入操作
	CategoryService service = new CategoryService();
	int count = service.updateCategory(id,name);
	//int count = -1;
	if(count==0){
		response.sendRedirect("error.jsp");
	}else{
		response.sendRedirect("categoryManage1.jsp");
	}

%>