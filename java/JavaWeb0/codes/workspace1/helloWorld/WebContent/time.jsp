<%@ page import="java.text.SimpleDateFormat" import="java.util.Date"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- html注释 -->
<%-- jsp注释 下面是定义java的变量和方法！<%! 定义方法，变量！  %> --%>
<%! 
 private int i;
 public String sayhello(){
	SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
	String time =df.format(new Date());
	return time;
}
%>
<%-- jsp注释 下面是使用java语句的写法！<% java语句 %> --%>
<% String time =sayhello();
%>
<%-- jsp注释 下面是表达式的写法！java 表达式不需要“；” --%>
<h2><%=time %></h2>
<h3><%=sayhello()%></h3>
</body>
</html>