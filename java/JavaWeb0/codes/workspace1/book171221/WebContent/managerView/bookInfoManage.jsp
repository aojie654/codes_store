<%@ page language="java" import="java.util.*,bean.*,service.*"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>bookInfoManage</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>

<body>
	<center>
		<jsp:include page="../common/head.jsp">
			<jsp:param value="admin" name="type"/>
		</jsp:include>
		<table width=750 > 
			<tr>
				<td width=20% align="center"><%@include file="../common/adminMenu.jsp"%>
				</td>
				<td  width=80% align=center>
						<%
								BookService bookService = new BookService();
								List<Book> bookList = bookService.getBookList();
							%>
						<table >
							<tr>
								<td colspan="8" height="30" align="center" >图书信息管理</td>
							</tr>
							<tr >
								<td colspan="8" bgcolor="#008B8B" width="100%" height="5" colspan="3"></td>
							</tr>
							<tr>
								<td colspan="8" height="30"  align="right" >
								<a	href="addBook.jsp">新增图书</a></td>
							</tr>	
						
							<tr>
								<td width="8%" >编号</td>
								<td width="25%">图书名称</td>
								<td width="15%">ISBN</td>
								<td width="10%">单价</td>
								<td width="10%">库存</td>
								<td width="12%">详细信息</td>
								<td width="10%">修改</td>
								<td width="10%">删除</td>
							</tr>
							<%for (Book book:bookList ) {		%>
							<tr>
								<td ><%=book.getId()%></td>
								<td ><%=book.getName()%></td>
								<td ><%=book.getIsbn()%></td>
								<td ><%=book.getPrice()%></td>
								<td ><%=book.getRemainNum()%></td>
								<td >
									<a target="_blank"
										href="<%=request.getContextPath()%>/userView/bookInfo.jsp?bookId=<%=book.getId()%>">
									查看</a></td> 
								<td ><a
									href="modifyBook.jsp?bookId=<%=book.getId()%>">修改</a>
								</td>
								<td ><a
									href="<%=request.getContextPath()%>/servlet/Admin?ID=<%=book.getId()%>&requestType=deleteBook">删除</a>
								</td>
							</tr>
							<%
								}
								%>
						</table>
				</td>
			</tr>
			<tr>
				<td colspan=2>	<%@include file="../common/bottom.jsp"%></td>
			</tr>
		</table>
	</center>
</body>
</html>
