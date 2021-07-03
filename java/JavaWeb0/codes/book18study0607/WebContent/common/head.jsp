<%@ page language="java" import="bean.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<style>
td.title {
	color: #FFFFFF;
	font-size: 5em;
	font-family: Microsoft YaHei;
}

td.menu {
	color: #FFFFFF;
}

a.menu:link {
	color: #FFFFFF;
} /* 未被访问的链接 */
a.menu:visited {
	color: #FFFFFF;
} /* 已被访问的链接 */
a.menu:hover {
	color: #66CDAA;
}

a.common:link {
	color: #000000;
} /* 未被访问的链接 */
a.common:visited {
	color: #000000;
} /* 已被访问的链接 */
a.common:hover {
	color: #008B8B;
}
</style>

<table bgcolor=#008B8B width="750" align="center">
	<%
    
	User user=	 (User)session.getAttribute("userInfo");
	User admin = (User)session.getAttribute("admin");
	String type = request.getParameter("type"); 
	
	if(type.equals("noMenu")){
	%>
	<tr>
		<td class="title" align="center">三味书屋</td>
	</tr>
	<%}else	if(type.equals("common")||(user==null&&admin==null)){%>
	<tr>
		<td class="title" align="center" colspan=4>三味书屋</td>
	</tr>
	<%@include file="commonMenu.jsp"%>
	<%	}else if(type.equals("user")&&user!=null){ 
	%>
	<tr>
		<td class="title" align="center" colspan=5>三味书屋</td>
	</tr>
	<%@include file="userMenu.jsp"%>
	<%} else if(type.equals("admin")&&admin!=null){ 
	%>
	<tr>
		<td class="title" align="center">三味书屋</td>
	</tr>
	<%} %>

</table>


