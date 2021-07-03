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
	int num = User.checkLogin3(userName, passWord);
//3 根据结果，跳转到不同页面。
	if(num==1){
		//app中放入访问人数！
		Long loginNum =(Long)application.getAttribute("loginNum");
		if(loginNum==null){ 
			loginNum=new Long(0);
		}
		application.setAttribute("loginNum", ++loginNum);
		
		//在session中放入成功登陆的用户名。
		session.setAttribute("loginName", userName);
		//正确则跳转到主页
		response.sendRedirect("book.jsp");//重定向！让浏览器再次请求服务器book.jsp页面！
	}else{//错误则跳转回原先的登录页面！
		//response.sendRedirect("login.jsp");
		//使用请求转发的方式。延长request的生命周期。将错误信息放到request中！
		if(num==0){
			request.setAttribute("loginError", "没有此用户名！");
		}
		if(num==-1){
			request.setAttribute("loginError", "输入密码有误！");
		}
		//得到request对象的请求转发器。转发目的地是参数login.jsp。
		RequestDispatcher rd =request.getRequestDispatcher("login.jsp");
		//将请求和响应对象转发下去即转发到login.jsp！
		rd.forward(request, response);
	}

%>