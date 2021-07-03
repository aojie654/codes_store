	<%@ page pageEncoding="UTF-8"%>
	<h6>被include 的JSP只包含脚本片段</h6>
	<p>当前访问时间是：
	<%! private String time; %>
	<%
		java.text.SimpleDateFormat df ;
		df= new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		out.print(df.format(new java.util.Date()));//得到当前时间，并输出页面
	%></p> 