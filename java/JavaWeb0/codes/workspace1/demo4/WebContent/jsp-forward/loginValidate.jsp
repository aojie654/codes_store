<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 	//使用request的getParameter方法得到请求的参数值。
	String name = request.getParameter("userName");
	String pwd = request.getParameter("userPwd");
	//使用java代码判断用户名和密码是否正确
	if(name.equals("tom")&&pwd.equals("123")){
		//如果正确，则使用请求转发将页面跳转到main.jsp主页面。
		request.setAttribute("user",name );//在request中存放user变量
		//RequestDispatcher rd=request.getRequestDispatcher("main.jsp");
		//rd.forward(request,response);
%>
		<jsp:forward page="main.jsp"/>
<%
	}else{//如果错误，则将页面跳转到login.jsp登录页面。
		response.sendRedirect("login.jsp");
	}
%>