<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>书店</title>
</head>
<body>
<h2>欢迎来到小二书店！</h2>
<hr>
<h3>畅销书排行榜！</h3>
<table align="center" border="1">
<caption>
畅销书榜单
</caption>
<tr align="center">
<th>三重门</th><th>老人与海</th><th>福尔摩斯</th>
</tr>
<tr>
<td><img alt="" src="9787506382298.jpg" width="150"></td>
<td><img alt="" src="9787506385831.jpg" width="150"></td>
<td><img alt="" src="9787530955574.jpg" width="150"></td>
</tr>
</table>
<!-- 使用page命令将foot.jsp页面添加进来 -->
<%@include file="foot.jsp" %> 
</body>
</html>