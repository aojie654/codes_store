<%@ page language="java" import="java.util.*,service.*,bean.*"
	pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>categoryManage</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>

<body>
	<center>
		<jsp:include page="../../common/head.jsp">
			<jsp:param value="admin" name="type"/>
		</jsp:include>
		<table width=750>
			<tr> 
				<td width=20% align="center"><%@include file="../../common/adminMenu.jsp"%>
				</td>
				<td width=80% align=center>
					<table >
							<tr>
								<td height="30" align="center" colspan="4">图书类别管理</td>
							</tr>
							<tr >
								<td bgcolor="#008B8B" width="100%" height="5" colspan="4"></td>
							</tr>
							<tr>
								<td height="30"  align="right" colspan="4" >
								<a	href="addCategory.jsp">新增图书类型</a></td>
							</tr>
						<tr>
							<td width=105>类别编号</td>
							<td width=105>图书类别</td>
							<td width=105>修改</td>
							<td width=105>删除</td>
						</tr>
						<% 
						BookService bookService = new BookService();
						List<BookCategory> bookCategory = bookService.getCategoryList();
							for(BookCategory bc:bookCategory){
						%>
						<tr>
							<td><%=bc.getId() %></td>
							<td><%=bc.getName() %></td>
							<td><a href="modifyCategory.jsp?categoryId=<%=bc.getId()%>&categoryName=<%=java.net.URLEncoder.encode(bc.getName(),"utf-8")%>">修改</a></td>
							<td>
							<a href="deleteCategory.jsp?categoryId=<%=bc.getId()%>">删除</a>	
							</td>
						</tr>
						<%
							}
						%>
					</table>
				</td>
			</tr>
		</table>
		<%@include file="../../common/bottom.jsp"%>
	</center>
</body>
</html>
