<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String realPath = application.getRealPath("");//1 项目绝对路径
		String serverInfo = application.getServerInfo();//2
		String contextPath = application.getContextPath();//3
		//打印字符串变量
		out.print("当前应用在服务器中存放的路径：" + realPath + "<br/>");
		out.print("服务器信息：" + serverInfo + "<br/>");
		out.print("当前应用的上下文路径：" + contextPath + "<br/>");
		
		out.print("向application中放了一棵树！");
		application.setAttribute("tree", "a green tree");
		
		String tree=(String)application.getAttribute("tree");
		out.print("种了一颗这样的树："+tree);
	%>
</body>
</html>