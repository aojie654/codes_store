<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>小二书店</title>
</head>
<body>
<h2>欢迎光临小二书店</h2>
<!-- hr横线 -->
<hr>
<h3>下面是本周的畅销书榜单！</h3>

<table border="1" align="center">
<caption>畅销书榜</caption>
<tr><th>三重门</th><th>老人与海</th><th>福尔摩斯</th></tr>
<tr>
<td><img alt="sanchongmen" src="9787506382298.jpg" width="150"></td>
<td><img alt="men&sea" src="9787506385831.jpg" width="150"></td>
<td><img alt="fuermosi" src="9787530955574.jpg" width="150"></td>
</tr> 
</table>
<%@include file="bottom/foot.jsp" %><%--使用include指令，加入jsp片段！ --%>
</body>
</html>