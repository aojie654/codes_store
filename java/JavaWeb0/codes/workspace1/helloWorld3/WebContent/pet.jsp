<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>流浪狗之家</title>
<script language="javascript">
	function selectDog() {
		alert("您选择的是"+dogS.options[dogS.options.selectedIndex].value);
		
	}
</script>
</head>
<body>
<%!
	private String[] dogs={"萨摩耶","哈士奇","小鹿","腊肠","金毛","泰迪","京巴"};
	public String showDog(){
		String dogstr="";
		for(String dog:dogs){
			dogstr = dogstr+" "+dog;
		}
		return dogstr;
	}
	
	public void jianDog(String dogS){
		
		for(String dog:dogs){
			if(dogS.equals(dog)){
				
			}
		}
	}
%>
<h2>欢迎来到流浪狗之家</h2>
<h3>我们这里有很多狗，比如<%=showDog()%></h3>
<ol>
<% for(String dog:dogs){ %>
<li><%=dog %></li>
<% } %>
</ol>
<h3>请选择您要领养的流浪狗</h3>
<select name="dogS" onchange="selectDog()">
<% for(String dog:dogs){ %>
<option value="<%=dog%>"><%=dog %></option>
<%} %>
</select>
</body>
</html>