<%@ page language="java" import="java.util.*,bean.*,service.*"
	pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>modifyBook</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<script language="javascript">
	function CheckForm() {

		if (document.a.name.value == "") {
			alert("请输入图书名！");
			document.a.name.focus();
		} else if (document.a.price.value.length == 0) {

			alert("请输入图书价格!");
			document.a.price.focus();
		} else if (document.a.author.value.length == 0) {

			alert("请输入图书作者");
			document.a.author.focus();
		} else if (document.a.publishing.value.length == 0) {

			alert("请输入出版社");
			document.a.publishing.focus();
		} else if (document.a.onSaleNum.value.length == 0) {

			alert("请输入入库数量");
			document.a.onSaleNum.focus();
		} else if (document.a.remainNum.value.length == 0) {

			alert("请输入现有库存");
			document.a.remainNum.focus();
		} else if (document.a.onSaleDate.value.length == 0) {

			alert("请输入上架时间");
			document.a.onSaleDate.focus();
		} else if (document.a.introduction.value.length == 0) {

			alert("请输入图书简介");
			document.a.introduction.focus();
		} else {
			return true;
		}

		return false;
	}
</script>
</head>

<body>
	<%
		int bookId = Integer.parseInt(request.getParameter("bookId"));
		BookService bookService = new BookService();
		Book book = bookService.getBook(request.getParameter("bookId"));

		List<BookCategory> categoryList = bookService.getCategoryList();
		Iterator<BookCategory> iter = categoryList.iterator();
		int i = 1;
	%>
	<center>
		<table>
			<tr>
				<td colspan=2><jsp:include page="../common/head.jsp">
						<jsp:param value="admin" name="type" />
					</jsp:include></td>
			</tr>
			<tr>
				<td  width=20% align="center"><%@include file="../common/adminMenu.jsp"%>
				</td>

				<td   width=80%  align="center">
					<%
						String categoryId = request.getParameter("categoryId");
						String categoryName = request.getParameter("categoryName");
					%>
					<form name="a" onSubmit="return CheckForm()"
						action="<%=request.getContextPath() %>/servlet/Admin?requestType=modifyBook&bookId=<%=bookId%>"
						method="post">
						<table>
							<tr>
								<td width="100%" align="center" colspan="2">修改图书信息</td>
							</tr>
							<tr>
								<td width="68%" align="center">图书名称: <input type="text"
									name="name" value="<%=book.getName()%>" size="20">
								</td>
								<td width="32%" align="center"><font color="#FF0000">请输入图书名称</font>
								</td>
							</tr>
							<tr>
								<td width="68%" align="center">图书类别: <select
									name="categoryId" size="1">
										<%
											while (iter.hasNext()) {
												BookCategory bc = (BookCategory) iter.next();
										%>
										<option value="<%=bc.getId()%>" 
										<%
											int id=book.getCategoryId();
											if(bc.getId()==id){
												%>selected="selected"<%
											}
										%>>
											<%=bc.getName()%>
										</option>
										<%
											}
										%>
								</select>
								</td>
								<td width="32%" align="center"><font color="#FF0000">请输入图书类别</font>
								</td>
							</tr>
							<tr>
								<td width="68%" align="center">图书价格: <input type="text"
									name="price" value="<%=book.getPrice()%>" size="20">
								</td>
								<td width="32%" align="center"><font color="#FF0000">请输入图书价格</font>
								</td>
							</tr>
							<tr>
								<td width="68%" align="center">图书作者: <input type="text"
									name="author" value="<%=book.getAuthor()%>" size="20">
								</td>
								<td width="32%" align="center"><font color="#FF0000">请输入图书作者</font>
								</td>
							</tr>
							<tr>
								<td width="68%" align="center">出版社 :&nbsp;&nbsp; <input
									type="text" name="publishing" value="<%=book.getPublishing()%>"
									size="20">
								</td>
								<td width="32%" align="center"><font color="#FF0000">请输入图书出版社</font>
								</td>
							</tr>
							<tr>
								<td width="68%" align="center">入库数量: <input type="text"
									name="onSaleNum" value="<%=book.getOnSaleNum()%>" size="20">
								</td>
								<td width="32%" align="center"><font color="#FF0000">请输入图书入库数量</font>
								</td>
							</tr>
							<tr>
								<td width="68%" align="center">现有库存: <input type="text"
									name="remainNum" value="<%=book.getRemainNum()%>" size="20">
								</td>
								<td width="32%" align="center"><font color="#FF0000">请输入现有图书数量</font>
								</td>
							</tr>
							<tr>
								<td width="68%" align="center">上架时间: <input type="text"
									name="onSaleDate" value="<%=book.getOnSaleDate()%>" size="20">
								</td>
								<td width="32%" align="center"><font color="#FF0000">图书上架时间</font>
								</td>
							</tr>
							<tr>
								<td width="68%" align="center">图书简介: <textarea
										name="introduction" cols="17" rows="3"><%=book.getIntroduction()%></textarea>
								</td>
								<td width="32%" align="center"><font color="#FF0000">请输入图书简介</font>
								</td>
							</tr>
							<tr>
								<td align="center"><input type="submit" value="修改"></td>
								<td><input type="reset" value="重置" name="reset"></td>
							</tr>
						</table> 
					</form>
				</td>
			</tr>
			<tr>
				<td align="center" colspan=2><%@include
						file="../common/bottom.jsp"%></td>
			</tr>
		</table>


	</center>
</body>
</html>
