<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*,service.*,bean.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改图书类别</title>
</head>
<script language="javascript">
	function CheckForm(){
		if(document.add.categoryName.value==""){
			alert("请输入分类名！");
			document.add,categoryName.focus();
		}else{
			return true;//程序继续执行
		}
		return false;//程序停止提交表单		
	}
</script>

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

					<form action="doCategoryUpdate.jsp" method="post" name="add"
						onSubmit="return CheckForm()">
						<table>
							<tr>
								<td height="30" align="center" colspan="4">添加图书分类</td>
							</tr>
							<tr>
								<td bgcolor="#008B8B" width="100%" height="5" colspan="4"></td>
							</tr>
							<%
							String error = (String)request.getAttribute("insertError");
							if(error != null){
						%>
							<tr>
								<td colspan="2"><font color="red" size="1"><%=error %></td>
							</tr>
							<% } 
							%>
							<%
								request.setCharacterEncoding("utf-8");
								String id = request.getParameter("categoryId");
								CategoryService service = new CategoryService();
								Category bean = service.getCategory(id);
								//bean = new Category(1,"name");
							%>

							<tr>
								<td width=150>图书分类ID：</td>

								<td width="100"><input type="text" name="categoryId"
									value="<%=bean.getId()%>" size="5"></td>
								<td width="150">图书分类</td>
								<td width="150"><input type="text" name="categoryName"
									value="<%=bean.getName()%>" size="10"></td>
							</tr>
							<tr>
								<td colspan="2" align="right"><input type="submit"
									value="提交"></td>
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