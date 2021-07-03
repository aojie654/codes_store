<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*,service.*,bean.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图书类别查询</title>
</head>
<%String service =request.getContextPath() ; %>
<body>
	<center>
		<jsp:include page="../../common/head.jsp">
			<jsp:param value="admin" name="type" />
		</jsp:include>
		<table width=750>
			<tr>
				<td width=20% align="center"><%@include
						file="../../common/adminMenu.jsp"%></td>
				<td width=80% align=center>
					<table>
						<tr>
							<td height="30" align="center" colspan="4">图书分类信息管理</td>
						</tr>
						<tr>
							<td bgcolor="#008B8B" width="100%" height="5" colspan="4"></td>
						</tr>
						<tr>
							<td height="30" align="right" colspan="4"><a
								href="addCategory.jsp">新增图书分类</a></td>
						</tr>
						<tr>
							<td width=50>序号</td>
							<td width=80>分类名称</td>
							<td width=80>修改</td>
							<td width=80>删除</td>
						</tr>
						<%  //使用service 取得list数据 然后循环显示
						    CategoryService cateServer = new CategoryService();
							List<Category> list= cateServer.getCategoryList();
							for(Category bean:list){
						%>
						<tr>
							<td><%=bean.getId() %></td>
							<td><%=bean.getName() %></td>
							<td><a href="">修改</a></td>
							<td><a
								href="doCategoryDelete.jsp?categoryId=<%= bean.getId() %>">删除</a></td>
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