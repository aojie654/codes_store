<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pageContext</title>
</head>
<body>
<%  //1 小猫
    //2 把pageContext修改成对应的 request ,session application内置对象的存储代码。
	String cat="catName";	   
	String dogName="dogName";
	pageContext.setAttribute(cat, "小花猫");
	request.setAttribute(cat, "英国短毛");
	session.setAttribute(cat, "波斯猫");
	application.setAttribute(cat, "加菲猫");

	String catInpage=(String)pageContext.getAttribute(cat);
	String catInRequest=(String)request.getAttribute(cat);
	String catInSession =(String)session.getAttribute(cat); 
	String catInApp = (String)application.getAttribute(cat);
		
	out.print("pageContext空间中的小猫是："+catInpage+"<br/>");//将pageContext空间的catName输出
	out.print("request空间中的小猫是："+catInRequest+"<br/>");//将request空间的catName输出
	out.print("session空间中的小猫是："+catInSession+"<br/>");//将session空间的catName输出
	out.print("application空间中的小猫是："+catInApp+"<br/>");//将session空间的catName输出
%>
</body>
</html>