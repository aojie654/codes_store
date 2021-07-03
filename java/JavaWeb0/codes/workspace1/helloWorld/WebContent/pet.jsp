<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>流浪狗之家</title>
</head>
<body>
<%!
 private String[] dogs={"金毛","八哥","斗牛","泰迪","牧羊","田园","腊肠"};
 public String showDogs(){
	 String str="";
	 for(int i=0;i<dogs.length;i++){
		 str = str+" "+dogs[i];
	 }
	 return str;
 }
%>
<h1>欢迎来到流浪狗之家</h1>
<p>我们家里有<%=showDogs() %>这些狗。</p>
<ul>
<% for(String dog:dogs){ %>
<li>小狗：<%=dog %></li>
<%} %>
</ul>
</body>
</html>