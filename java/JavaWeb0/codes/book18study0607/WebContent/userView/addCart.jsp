<%@ page language="java" import="bean.*,service.*" pageEncoding="UTF-8"%>

<!-- 功能：图书加入购物车 -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>addCart</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<%  Book book = (Book)request.getAttribute("addBook");
		int remainNum = book.getRemainNum();
		int cartBookNum=	(Integer)request.getAttribute("cartBookNum");
		String sqlType = (String)request.getAttribute("sqlType");
	%>
</head>

<body>
	<Script>
  		function checkNum(obj){
  		
  			var remain = <%=remainNum%>
  			if(obj<1){
  			
  				alert("请输入有效购买数量!");
  				document.buy.number.focus();
  				return false;
  			}else if(((obj*10)%10)!="0"){
  			
  				alert("请输入整数");
  				document.buy.number.focus();
  				return false;
  			
  			}else if(obj>remain){
  			
  				alert("库存不足!我们会尽快提供!");
  				document.buy.number.focus();
  				return false;
  				
  			}else{
  			
  				return true;
  			}
  		}
  		
  		function sum(){
  		
  			document.buy.totalPrice.value=document.buy.number.value*
  		document.buy.unitPrice.value;
  		
  		}
  </Script>

	<jsp:include page="../common/head.jsp">
		<jsp:param value="user" name="type" />
	</jsp:include>

	<form name="buy" onSubmit="return checkNum(number.value)"
		action="<%=request.getContextPath()%>/servlet/Customer?requestType=changeCart"
		method="post">
		<input type="hidden" name="bookName" value="<%=book.getName() %>">
		<input type="hidden" name="unitPrice" value="<%=book.getPrice() %>">
		<input type="hidden" name="bookId" value=<%=book.getId() %>> <input
			type="hidden" name="sqlType" value="<%=sqlType%>">
		<table width="600" align="center">
			<tr>
				<td height="30" align="center" colspan="6">图书加入购物车</td>
			</tr>
			<tr>
				<td bgcolor="#008B8B" width="100%" height="5" colspan="4"></td>
			</tr>
			<tr>
				<td width="150">图书名称</td>
				<td width="150">单价</td>
				<td width="150">数量</td>
				<td width="150">总价</td>
			</tr>
			<tr>
				<td width="150"><%=book.getName() %></td>
				<td width="150"><%=book.getPrice() %></td>
				<td width="150"><input type="text" value="<%=cartBookNum%>"
					size=1 name="number" onblur="sum();">本</td>
				<td width="150"><input type="text" name="totalPrice" size="10"
					value="<%=book.getPrice() %>" disabled="disabled">元</td>
			</tr>
			<tr>
				<td colspan="4" align="center"><input type="submit"
					value="加入购物车"></td>
			</tr>
		</table>
	</form>
	<%@include file="../common/bottom.jsp"%>
	<%--! <%@include page="" %> Mandatory attribute file missing --%>
</body>
</html>
