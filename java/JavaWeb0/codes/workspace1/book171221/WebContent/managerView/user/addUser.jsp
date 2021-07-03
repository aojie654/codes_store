<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*,service.*,bean.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js.js"></script>
</head>
<% String service = request.getContextPath(); %>
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
					<form action="<%=service %>/UserManage.action" name="a" onsubmit="return CheckForm()"  method="post">
						<input type="hidden" name="doType" value="addUser">
					<table >
						<tr>
							<td height="30" align="center" colspan="3">新增用户</td>
						</tr>
						<tr >
							<td bgcolor="#008B8B" width="100%" height="5" colspan="3"></td>
						</tr>
						<tr>
							<td width=105>用户姓名:</td>
							<td width=105><input name="name" type="text" onblur="return isName(this.value)"></td>
							<td style="color: red">*</td>
						</tr>
						<tr>
							<td width=105>真实姓名:</td>
							<td width=105><input name="realName" type="text"></td><td style="color: red">*</td>
						</tr>
						<tr>
							<td width=105>手机号码:</td>
							<td width=105><input name="phone" type="text" onblur="return isPhone(this.value)"></td>
							<td style="color: red">*</td>
						</tr>
						<tr>
							<td width=105>邮箱地址:</td>
							<td width=105><input name="email" type="text" onblur="return isEmail(this.value)"></td>
							<td style="color: red">*</td>
						</tr>
						<tr>
							<td width=105>联系地址:</td>
							<td width=105><input name="address" type="text"></td><td style="color: red">*</td>
						</tr>
						<tr>
							<td width=105>年龄:</td>
							<td width=105><input name="age" type="text" onblur="return isAge(this.value)"></td>
							<td style="color: red">*</td>
						</tr>
						<tr>
							<td width=105>性别:</td>
							<td width=105>男：<input name="sex" type="radio" value="1" checked="checked" >
							                            女：<input name="sex" type="radio" value="0">
							</td>
							<td style="color: red">*</td>
						</tr>
						<tr><td></td><td><input type="submit" value="提交"></td></tr>
					
					</table>
					</form>
				</td>
			</tr>
		</table>
		<%@include file="../../common/bottom.jsp"%>
	</center>
</body>
</html>