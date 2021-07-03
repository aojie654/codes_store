<%@ page language="java" import="java.util.*,bean.*,service.*"
	pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>addBook</title>

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
		} else if (document.a.isbn.value == "") {

			alert("请输入图书ISBN号！");
			document.a.isbn.focus();
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
		} else if (document.a.onPublishDate.value.length == 0) {

			alert("请输入出版时间");
			document.a.onPublishDate.focus();
		} else if (document.a.image.value.length == 0) {

			alert("请上传图书图片");
			document.a.image.focus();
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
	<center>
		<table>
			<tr>
				<td colspan=2><jsp:include page="../common/head.jsp">
						<jsp:param value="admin" name="type" />
					</jsp:include></td>
			</tr> 
			<tr>
				<td><%@include file="../common/adminMenu.jsp"%>
				</td>

				<td align="center">
					<form name="a"
						action="<%=request.getContextPath()%>/servlet/Admin?requestType=addBook"
						onSubmit="return CheckForm()" method="post"
						enctype="multipart/form-data">
						<%-- 类型enctype用multipart/form-data，这样可以把文件中的数据作为流式数据上传，不管是什么文件类型，均可上传。--%>
						<%
							BookService bookService = new BookService();
							List<BookCategory> categoryList = bookService.getCategoryList();
							Iterator<BookCategory> iter = categoryList.iterator();
							int i = 1;
						%>
						<table width="100%">
							<tr>
								<td width="100%" colspan="3" align="center">新增图书</td>
							</tr>
							<tr>
								<td width="22%" align="right">图书名称:</td>
								<td width="38%"><input type="text" name="name" size="30"></td>
								<td width="40%" align="center"><font color="#FF0000">请输入图书名称</font></td>
							</tr>
							<tr>
								<td width="22%" align="right">ISBN:</td>
								<td width="38%"><input type="text" name="isbn" size="30"></td>
								<td width="40%" align="center"><font color="#FF0000">请输入图书ISBN号</font></td>
							</tr>
							<tr>
								<td width="22%" align="right">图书类别:</td>
								<td width="38%"><select name="categoryId">
										<%
											while (iter.hasNext()) {
												BookCategory bc = (BookCategory) iter.next();
										%>
										<option value="<%=bc.getId()%>"><%=bc.getName()%></option>
										<%
											}
										%>
								</select></td>
								<td width="40%" align="center"><font color="#FF0000">请输入图书类别</font></td>
							</tr>
							<tr>
								<td width="22%" align="right">图书价格:</td>
								<td width="38%"><input type="text" name="price" size="30"></td>
								<td width="40%" align="center"><font color="#FF0000">请输入图书价格</font></td>
							</tr>
							<tr>
								<td width="22%" align="right">图书作者:</td>
								<td width="38%"><input type="text" name="author" size="30"></td>
								<td width="40%" align="center">请输入图书作者</td>
							</tr>
							<tr>
								<td width="22%" align="right">出版社 :</td>
								<td width="38%"><input type="text" name="publishing"
									size="30"></td>
								<td width="40%" align="center"><font color="#FF0000">请输入图书出版社</font></td>
							</tr>
							<tr>
								<td width="22%" align="right">入库数量:</td>
								<td width="38%"><input type="text" name="onSaleNum"
									size="20"></td>
								<td width="40%" align="center"><font color="#FF0000">请输入图书入库数量</font></td>
							</tr>
							<tr> 
								<td width="22%" align="right">现有库存:</td>
								<td width="38%"><input type="text" name="remainNum"
									size="20"></td>
								<td width="40%" align="center"><font color="#FF0000">请输入现有图书数量</font></td>
							</tr>
							<tr>
								<td width="22%" align="right">上架时间:</td>
								<td width="38%"><input type="text" name="onSaleDate"
									size="30"></td>
								<td width="40%" align="center"><font color="#FF0000">图书上架时间</font></td>
							</tr>
							<tr>
								<td width="22%" align="right">出版时间:</td>
								<td width="38%"><input type="text" name="onPublishDate"
									size="30"></td>
								<td width="40%" align="center"><font color="#FF0000">图书出版时间</font></td>
							</tr>
							<tr>
								<td width="22%" align="right">图书图片:</td>
								<td width="38%"><input type="file" name="image" size="30"></td>
								<td width="40%" align="center"><font color="#FF0000">请上传图书封面</font></td>
							</tr>
							<tr>
								<td width="22%" align="right">图书简介:</td>
								<td width="38%"><textarea name="introduction" cols="36"
								 rows="8"></textarea></td>
								<td width="40%" align="center">请输入图书简介</td>
							</tr>
							<tr>
								<td width="100%" align="center" colspan="3"><table>
										<tr>
											<td>
												<p>
													<input type="submit" value="提交">
												</p>

											</td>
											<td><input type="button" value="取消" onclick="">
											</td>
										</tr>
									</table></td>
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
