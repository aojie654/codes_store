<%@ page language="java" import="bean.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<Style>
	tr.menu{
		height: 25;
	}
</Style>
 
	<table> 
		<tr class="menu">
			<td>管理员操作</td>
		</tr>
		<tr  class="menu">
			<td><span class="name"><%=((User)session.getAttribute("admin")).getName()%></span>,您好!</td>
		</tr>
		<tr class="menu"> 
			<td><a class="common" href="<%=request.getContextPath() %>/managerView/adminMain.jsp">后台管理首页</a></td>
		</tr>
		<tr class="menu">
			<td>	
			<%--jsp+javabean 图书类别管理 --%>
			<a class="common" href="<%=request.getContextPath() %>/managerView/category-jsp/categoryManage.jsp">图书类别管理</a>
			<%--jsp+servlet 图书类别管理 --%>
			<a class="common" href="<%=request.getContextPath() %>/managerView/categoryManage.jsp">图书类别管理</a>
			</td>
		</tr>
		<tr class="menu">
			<td><a class="common" href="<%=request.getContextPath() %>/UserManage.action?doType=userDisplay">用户信息管理</a></td>
		</tr>
		<tr class="menu">
			<td><a class="common" href="<%=request.getContextPath() %>/managerView/bookInfoManage.jsp">图书信息管理</a></td>
		</tr>
		<tr class="menu">
			<td><a class="common" href="<%=request.getContextPath() %>/servlet/Admin?requestType=sales">图书销售信息</a></td>
		</tr>
		<tr  class="menu">
			<td><a class="common" href="<%=request.getContextPath() %>/servlet/Admin?requestType=logout">退出管理系统</a></td>
		</tr>
	</table>