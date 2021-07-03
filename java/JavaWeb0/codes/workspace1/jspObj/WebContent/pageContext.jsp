<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>pageContext</title>
</head>
<body>
<%  
	String dogName="dogName";

	pageContext.setAttribute(dogName, "小泰迪");//1 在JSP本页面中存储dogName对象。
	pageContext.setAttribute(dogName, "小萨摩",PageContext.REQUEST_SCOPE);//2 在request请求空间中存储dogName对象。
	pageContext.setAttribute(dogName, "小哈士奇",PageContext.SESSION_SCOPE);//3 在session会话空间中存储dogName对象。
	pageContext.setAttribute(dogName, "小拉布拉多",PageContext.APPLICATION_SCOPE);//4  在application应用空间中存储dogName对象。
	
	String dogInPage =(String)pageContext.getAttribute(dogName);//5 将dogName数据从pageContext中取出
	String dogInRequest =(String)pageContext.getAttribute(dogName, PageContext.REQUEST_SCOPE);//6 将dogName数据从request中取出
	String dogInSession =(String)pageContext.getAttribute(dogName, PageContext.SESSION_SCOPE);//7将dogName数据从session中取出
	String dogInApp =(String)pageContext.getAttribute(dogName, PageContext.APPLICATION_SCOPE);//8将dogName数据从application中取出
	
	pageContext.getOut().print("pageContext空间中的小狗是："+dogInPage+"<br/>");//将pageContext空间的dogName输出
	pageContext.getOut().print("request空间中的小狗是："+dogInRequest+"<br/>");//将request空间的dogName输出
	pageContext.getOut().print("session空间中的小狗是："+dogInSession+"<br/>");//将session空间的dogName输出
	pageContext.getOut().print("application空间中的小狗是："+dogInApp+"<br/>");//将application空间的dogName输出
%>
</body>
</html>