<%@ page language="java" import="java.util.*,bean.*,service.*"
	pageEncoding="UTF-8"%>

<!-- 功能：图书详细信息界面 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>detailAboutBook</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<style type="text/css">
a.close:link {color:#000000;}	/* 未被访问的链接 */
a.close:visited {color:#000000;}	/* 已被访问的链接 */
a.close:hover {color:#008B8B;}

td.bookInfo{
	text-align: center;
	width: 100px;
}
</style>
</head>

<body>
	<jsp:include page="../common/head.jsp">
		<jsp:param value="noMenu" name="type"/>
	</jsp:include>	 
	<% 

	BookService bsService =new	BookService();
	List<BookCategory> categoryList= bsService.getCategoryList();	
	String bookId=	request.getParameter("bookId");
	Book book =bsService.getBook(bookId); 	 	
	String categoryName =bsService.getOneBookCategory(book);

  	%>
	<center>
		<table border="1" width=750 >
			<tr>
				<td width="100%" colspan="4" class="bookInfo"><strong>图书详细信息</strong></td>
			</tr>
			<tr>
				<td rowspan="10" colspan="2"><img  width="300" src="<%=request.getContextPath()%>/upload/images/<%=book.getImage()%>"/> </td>
			</tr>
			<tr>
				<td class="bookInfo">图书名称:</td>
				<td ><%=book.getName() %></td>
			</tr>
			<tr>
				<td   class="bookInfo">类别:</td>
				<td ><%=categoryName %></td>
			</tr>
			<tr>
				<td   class="bookInfo">单价:</td>
				<td ><%=book.getPrice() %></td>
			</tr>
			<tr>
				<td  class="bookInfo">作者:</td>
				<td ><%=book.getAuthor() %></td>
			</tr>
			<tr>
				<td   class="bookInfo">出版社:</td>
				<td ><%=book.getPublishing() %></td>
			</tr>
			<tr>
				<td  class="bookInfo">入库数:</td> 
				<td ><%=book.getOnSaleNum()%></td>
			</tr>
			<tr>
				<td   class="bookInfo">现有库存:</td>
				<td ><%=book.getRemainNum() %></td>
			</tr>
			<tr>
				<td   class="bookInfo">上架时间:</td>
				<td ><%=book.getOnSaleDate() %></td>
			</tr>
			<tr>
				<td  class="bookInfo" >图书简介:</td>
				<td  ><%=book.getIntroduction()%></td>
			</tr>
			<tr>
				<td  colspan="2"  class="bookInfo">
					<a href="#" class="common"
					onClick="window.close()"> 关闭窗口</a>
				</td>
				
			<%
			User userCheck = (User) session.getAttribute("userInfo");
			if (userCheck!=null){ %>
			
			  <td  colspan="2"  class="bookInfo">
					<a href="#"
					onClick="window.opener.location.href='<%=request.getContextPath() %>/servlet/Customer?requestType=addCart&bookId=<%=book.getId() %>';"
					>加入购物车</a></td>
			
			<%}else{ %>	
				<td  colspan="2"  class="bookInfo">
					购物请登录</td>
			
			<%} %>
			</tr>
		</table>
		<%@include file="../common/bottom.jsp"%>
	</center>
</body>
</html>
