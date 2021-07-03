<%@ page language="java" contentType="text/html; charset=utf-8"
	import="java.util.*,bean.*,service.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%	
			    BookService bsService =new	BookService();
				List<BookCategory> categoryList= bsService.getCategoryList();	
				List<Book> bookList =bsService.getBookList();
			%>
<style>
td.menu {
	color: #FFFFFF;
}

div.img {
	margin: 3px;
	border: 1px solid #bebebe;
	height: auto;
	width: auto;
	float: left;
	text-align: center;
}

div.img img {
	display: inline;
	margin: 2px;
	border: 1px solid #bebebe;
}

div.img a:hover img {
	border: 1px solid #333333;
}

div.desc {
	text-align: center;
	font-weight: normal;
	width: 120px;
	font-size: 12px;
	margin: 8px 5px 8px 5px;
}
</style>

<td width="140">
	<table>
		<tr bgcolor="#008B8B">
			<td class="menu">图书类别</td>
		</tr>
		<%
							for(BookCategory bc:categoryList){
					%>
		<tr>
			<td><%=bc.getName()%></td>
		</tr>
		<%
						}
					%>

		<tr bgcolor="#008B8B">
			<td class="menu">新书上架</td>
		</tr>
		<%
							int num = bookList.size();
							for (int i = (num - 5) >= 0 ? (num - 5) : 0; i < num; i++) {
								Book book = (Book) bookList.get(i);
					%>
		<tr>
			<td><%=book.getName()%></td>
		</tr>
		<%
						}
					%>
	</table>
</td>
<td>
	<div>
		<%
					for(Book book:bookList){
					%>
		<div class="img">
			<a target="_blank"
				href="<%=request.getContextPath()%>/userView/bookInfo.jsp?bookId=<%=book.getId()%>">
				<img
				src="<%=request.getContextPath()%>/upload/images/<%=book.getImage()%>"
				alt="Ballade" width="130">
			</a>
			<div class="desc"><%=book.getName()%></div>
		</div>
		<%
						}
					%>
	</div>
</td>
