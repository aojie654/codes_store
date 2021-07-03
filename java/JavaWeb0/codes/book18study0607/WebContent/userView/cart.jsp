<%@ page language="java" import="java.util.*,bean.*"
	pageEncoding="UTF-8"%>

<!-- 功能：购物车列表 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>Cart</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

</head>

<body>
	<jsp:include page="../common/head.jsp">
		<jsp:param value="user" name="type" />
	</jsp:include>

	<%
		ArrayList<BookCart> al = (ArrayList<BookCart>) request.getAttribute("cart");
		if (al == null) {
			al = new ArrayList<BookCart>();
		}
	%>
	<form
		action="<%=request.getContextPath()%>/servlet/Customer?requestType=payBook"
		method="post">
		<table align="center" width="600">
			<tr>
				<td height="30" align="center" colspan="6">购物车列表</td>
			</tr>
			<tr>
				<td bgcolor="#008B8B" width="100%" height="5" colspan="6"></td>
			</tr>
			<tr>
				<td width="30$" align="center">图书名称</td>
				<td width="15%">单价</td>
				<td width="10%">数量</td>
				<td width="15%">总价</td>
				<td width="15%">加入日期</td>
				<td width="15%">移出购物车</td>
			</tr>
			<%
				for (BookCart bookCart : al) {
			%>
			<tr>
				<td align="center"><%=bookCart.getName()%></td>
				<td><%=bookCart.getUnitPrice()%></td>
				<td><%=bookCart.getNumber()%></td>
				<td><%=bookCart.getTotalPrice()%></td>
				<td><%=bookCart.getAddDate()%></td>
				<td width="15%"><a
					href="<%=request.getContextPath()%>/servlet/Customer?bookId=<%=bookCart.getBookId()%>&requestType=deleteBook">移出</a></td>
			</tr>
			<%
				}
			if(al.size()>0){
			%>
			<tr>
				<td colspan="6" align="center"><input type="submit" value="结帐"></td>
			</tr>
			<% }%>
		</table>
	</form>
	<%@include file="../common/bottom.jsp"%>
</body>
</html>
