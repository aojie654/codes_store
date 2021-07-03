<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//此页面只需要java代码。说明此jsp页面不是用来显示内容的。而是进行业务逻辑的处理的。
//此页面不需要html标签！
//验证用户名是否正确！

//1 取得表单提供的用户名和密码！
//使用jsp内置对象request的方法。
    
	request.setCharacterEncoding("utf-8");//对编码设置
	String userName=  request.getParameter("user");
	String passWord = request.getParameter("pass");
//2 进行判断。一般是访问数据库
    //boolean ok=User.checkLogin(userName,passWord);
	boolean ok=userName.equals("bi")&&passWord.equals("123");
//3 根据结果，响应正确或错误的页面！
	if(ok){//验证成功 重定向到book页面 
		//response jsp的内置对象，方便编程。
		response.sendRedirect("book.jsp");//让客户的浏览器再次向服务器发送请求！请求的地址就是字符串内容。
	}else{//验证失败！
		response.sendRedirect("login.jsp");//让客户端的浏览器向服务器发送login.jsp页面的请求！
	}

%>