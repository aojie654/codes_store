<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
		String dogSpecies = request.getParameter("dogSpecies");
		String dogName = request.getParameter("nickName");
	%>
	<h3>你好，我想领养一只<%=dogSpecies %></h3>
	<h3>就叫它<%= dogName%>吧,请大家多多关照！</h3>
