<%@page import="demo.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//此jsp页面不需要显示html内容。只需要对前页面传送的参数进行验证。
//本页面只处理逻辑。不显示内容。

//1 从前页面取得user 和pass的参数值。
	request.setCharacterEncoding("utf-8");//设置编码格式
	//request是请求对象。封装了所有http请求的内容。也叫作内置对象。
	String userName =request.getParameter("user");//内置对象。jsp内置的可以使用对象。
	String passWord =request.getParameter("pass");//得到另一个参数的值

	System.out.println(request.getContextPath());
//2 验证两个参数是否正确
    //boolean ok = userName.equals("bi")&&passWord.equals("123");
	//修改此行代码。使用User类的CheckLogin方法对用户名和密码进行判断。
	boolean ok = User.checkLogin2(userName, passWord);
//3 根据结果，跳转到不同页面。
	if(ok){//正确则跳转到主页
		//在session中放置了用户的信息。
		session.setAttribute("loginUser", userName);
		//放登录人数。 放到application中。所有人公用的。
		//1第一个人需要初始化。 2,3,4,5,.....2以后的人逻辑是一样的。 
		Long loginNum =(Long)application.getAttribute("loginNum");
		if(loginNum==null){
			loginNum=new Long(0);
		}
		application.setAttribute("loginNum", ++loginNum);
		
		
		response.sendRedirect("book.jsp");//重定向！让浏览器再次请求服务器book.jsp页面！
		
	}else{//错误则跳转回原先的登录页面！
		//response.sendRedirect("login.jsp");
		request.setAttribute("loginError", "用户名或密码错误！");
		RequestDispatcher rs=request.getRequestDispatcher("login.jsp");
		rs.forward(request, response);
	}

%>