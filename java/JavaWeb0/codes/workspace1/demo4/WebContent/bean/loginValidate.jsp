<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="bean.*,service.*" %>

<% 	//使用request的getParameter方法得到请求的参数值。
	String name = request.getParameter("userName");
	String pwd = request.getParameter("userPwd");
	
	//使用javaBean,封装参数。
	UserBean  userBean =new UserBean(name,pwd);
	//使用UserService判断用户名和密码是否正确
	if(UserService.checkLogin(userBean)){
		request.setAttribute("user", name);
		//如果正确，则使用请求转发将页面跳转到main.jsp主页面。
		RequestDispatcher rd=request.getRequestDispatcher("main.jsp");
		rd.forward(request,response);
	}else{//如果错误，则将页面跳转到login.jsp登录页面。
		response.sendRedirect("login.jsp");
	}
%>