<%@ page language="java" import="java.util.*,bean.*"
	pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>salesInfo</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>

<body>
	<center>
		<jsp:include page="../common/head.jsp">
			<jsp:param value="admin" name="type"/>
		</jsp:include>
		<table width=750>
			<tr>
				<td width="180" valign=top>
				<%@include file="../common/adminMenu.jsp"%>
				</td>

				<td width=420>
					<table>
						 <tr>
							<td height="30" align="center" colspan="5">图书销售信息</td>
						</tr>
						<tr >
							<td bgcolor="#008B8B" width="100%" height="5" colspan="5"></td>
						</tr>
						<tr>
							<td width=84>编号</td>
							<td width=84>用户ID</td>
							<td width=84>图书ID</td>
							<td width=84>数量</td>
							<td width=84>总价</td>
						</tr>

						<%
								ArrayList<TradeRecord> records = (ArrayList<TradeRecord>) request.getAttribute("records");
								for (Iterator<TradeRecord> it = records.iterator(); it.hasNext();) {
									TradeRecord tr = (TradeRecord) it.next();
							%>
						<tr>
							<td><%=tr.getId()%></td>
							<td><%=tr.getUserId()%></td>
							<td><%=tr.getBookId()%></td>
							<td><%=tr.getTradeNum()%></td>
							<td><%=tr.getSum()%></td>
						</tr>
						<%
							}
							%>

					</table>
				</td>
			</tr>

		</table><%@include file="../common/bottom.jsp"%>
	</center>
</body>
</html>
