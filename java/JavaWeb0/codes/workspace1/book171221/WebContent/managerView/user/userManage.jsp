<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*,service.*,bean.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%String service =request.getContextPath() ; %>
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
				<form action="<%=service %>/UserManage.action" method="post">
					<input type="hidden" name="doType" value="multiDelete">
					<table >
							<tr>
								<td height="30" align="center" colspan="6">用户信息管理</td>
							</tr>
							<tr >
								<td bgcolor="#008B8B" width="100%" height="5" colspan="6"></td>
							</tr>
							<tr>
								<td height="30"  align="right" colspan="6" >
								<a	href="managerView/user/addUser.jsp">新增用户</a></td>
							</tr>
						<tr><td width=50>选择</td>
							<td width=80>用户姓名</td>
							<td width=80>用户年龄</td>
							<td width=80>用户性别</td>
							<td width=80>修改</td>
							<td width=80>删除</td>
						</tr>					
						<%  
						//UserService userService = new UserService();
						//List<User> userList = userService.getUserList();
						List<User> userList =(List<User>)request.getAttribute("userList");
							for(User user:userList){
						%>
						<tr>
							<td><input name="delete" type="checkbox" value="<%=user.getId() %>"/></td> 
							<td><%=user.getName() %></td> 
							<td><%=user.getAge() %></td>
							<td><%=user.getSex() %></td>
							<td><a href="managerView/user/modifyUser.jsp?userId=<%=user.getId()%>">修改</a></td>
							<td>
							<a href="<%=service %>/UserManage.action?doType=deleteUser&userId=<%=user.getId()%>">删除</a>	
							</td>
						</tr>
						<%
							}
						%>	
						<tr>
							<td height="30"  align="left" colspan="6" >
							<input type="submit" value="删除" ></td>
						</tr>
					</table>
					</form>
				</td>
			</tr>
		</table>
		<%@include file="../../common/bottom.jsp"%>
	</center>
</body>
</html>