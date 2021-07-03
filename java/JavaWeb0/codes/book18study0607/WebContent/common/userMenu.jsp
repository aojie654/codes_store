<%@ page language="java" import="bean.*" pageEncoding="UTF-8"%>

<tr>
	<td class="menu" width=26%>尊敬的 <%=((User)session.getAttribute("userInfo")).getName()%>,欢迎你的到来!
	</td>
	<td width=18% align=center><a class="menu"
		href="<%=request.getContextPath() %>/userView/userPage.jsp">用户首页</a></td>
	<td width=18% align=center><a class="menu"
		href="<%=request.getContextPath() %>/userView/personalInfo.jsp">用户信息</a></td>
	<td width=18% align=center><a class="menu"
		href="<%=request.getContextPath() %>/servlet/Customer?requestType=showCart">查看购物车</a></td>
	<td width=18% align=center><a class="menu"
		href="<%=request.getContextPath() %>/userView/userExit.jsp">退出登陆</a></td>
</tr>

