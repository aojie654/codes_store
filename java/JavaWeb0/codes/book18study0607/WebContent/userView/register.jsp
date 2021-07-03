<%@ page language="java" import="java.util.*,bean.*"
	pageEncoding="UTF-8"%>

<!-- 功能：用户注册界面 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>register</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">


<script language="javascript">
 	function CheckForm(){
 	if(document.a.username.value.length == 0){
 		alert("请输入用户名！");
 		document.a.username.focus();
 	}
 	else if(document.a.password.value.length==0){
 		alert("请输入密码！");
 		document.a.password.focus();
 	}else if(document.a.realname.value.length==0){
 	
 		alert("请输入真实姓名!");
 		document.a.realname.focus();
 	}else if(document.a.age.value.length==0){
 	
 		alert("请输入您的年龄");
 		document.a.age.focus();
 	}else if(document.a.connectnumber.value.length==0){
 	
 		alert("请输入您的联系方式");
 		document.a.connectnumber.focus();
 	}else if(document.a.address.value.length==0){
 	
 		alert("请输入您的联系地址");
 		document.a.address.focus();
 	}else if((!document.a.gender[0].checked)&&(!document.a.gender[1].checked)){
 	
 		alert("请选择您的性别");
 		document.a.gender[0].focus();
 	}
 	else{
 		return true;
 	}
 	return false;
 }
function isEmail(strEmail) {

	if (strEmail.search(/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*/) != -1)
		return true;
	else{
		alert("请输入正确的Email!");
		document.a.email.focus();
		}
	
}

function isAge(strAge) {

	if (strAge.search(/^[0-9]{1,2}$/) != -1)
		return true;
	else{
		alert("请输入正确的年龄!");
		document.a.age.focus();
	}
}
</script>
<style type="text/css">
td.note {
	color: #FF0000;
	text-align: left;
	font-size: 12px;
}
</style>

</head>
<body>
	<jsp:include page="../common/head.jsp">
		<jsp:param value="common" name="type" />
	</jsp:include>
	<form name=a
		action="<%=request.getContextPath()%>/servlet/Index?requestType=register"
		onSubmit="return CheckForm()" method="post">
		<table width="650" align="center">
			<tr>
				<td height="30" align="center" colspan="3">欢迎注册</td>
			</tr>
			<tr>
				<td bgcolor="#008B8B" width="100%" height="5" colspan="3"></td>
			</tr>
			<tr height="10px"></tr>
			<tr>
				<td width="15%">用户名:</td>
				<td width="45%"><input type="text" name="username"> <%if(request.getAttribute("alert")!=null){%><%=request.getAttribute("alert")%>
					<%} %></td>
				<td class="note">*请输入用户名</td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="password" name="password" size="20"></td>
				<td class="note">*请填写密码</td>
			</tr>
			<tr>
				<td>真实姓名:</td>
				<td><input type="text" name="realname" size="20"></td>
				<td class="note">*请填写您的真实姓名</td>
			</tr>
			<tr>
				<td>性 别:</td>
				<td><input type="radio" name="gender" value="1"
					checked="checked">男 <input type="radio" name="gender"
					value="0">女</td>
				<td class="note">*请选择您的性别</td>
			</tr>
			<tr>
				<td>年 龄:</td>
				<td><input type="text" name="age" size="20"
					onblur=isAge(this.value)></td>
				<td class="note">*请填写您的年龄</td>
			</tr>
			<tr>
				<td>User Email:</td>
				<td><input type="text" name="email" size="20"
					onblur=isEmail(this.value)></td>
				<td class="note">*请输入您常用的电子邮件</td>
			</tr>
			<tr>
				<td>联系方式:</td>
				<td><input type="text" name="connectnumber" size="20"></td>
				<td class="note">*请输入您的联系方式，以便我们及时联系您</td>
			</tr>
			<tr>
				<td>联系地址:</td>
				<td><input type="text" name="address" size="40"></td>
				<td class="note">*请填写您的地址，以便我们发货给您</td>
			</tr>
			<tr>
				<td>注册时间:</td>
				<td>
					<%Calendar c = Calendar.getInstance();%><%=c.get(Calendar.YEAR)%>-<%=c.get(Calendar.MONTH)%>-<%=c.get(Calendar.DATE)%>
				</td>
			</tr>
			<tr>
				<td width="100%" colspan="5" align="center">
					<table>
						<tr>
							<td><input type="submit" value="提交"></td>
							<td>
								<p>
									<input type="button" value="取消"
										onClick="document.location.href='<%=request.getContextPath() %>/index.jsp'">
								</p>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>
	<%@include file="../common/bottom.jsp"%>
</body>
</html>
