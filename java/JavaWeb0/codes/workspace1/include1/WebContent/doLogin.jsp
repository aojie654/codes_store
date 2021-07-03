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
    boolean ok = userName.equals("bi")&&passWord.equals("123");

//3 根据结果，跳转到不同页面。
	if(ok){//正确则跳转到主页
		response.sendRedirect("book.jsp");//重定向！让浏览器再次请求服务器book.jsp页面！
	}else{//错误则跳转回原先的登录页面！
		response.sendRedirect("login.jsp");		
	}

%>