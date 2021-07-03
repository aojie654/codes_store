<!-- 下行是java指令内容 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>流浪狗之家</title>
</head>
<body>
<!-- html注释，此注释在最终html页面中可见。 -->
<%-- jsp注释，此注释在最终html页面中不可见。 --%>
<%!
	//jsp声明部分
	//声明变量： 流浪狗种类
	private String[] dogSpecies={"泰迪","金毛","八哥犬","小鹿犬","拉布拉多","萨摩耶","哈士奇"};
	
	//声明方法： 得到宠物种类	
	public String getDogSpecies(){
		String speciesStr="";
		for(int i=0;i<this.dogSpecies.length;i++){
				speciesStr=speciesStr+" "+this.dogSpecies[i];
		}
		return speciesStr;
	}
%>
<p>你好，朋友！欢迎来到流浪狗之家，我们这里有很多流浪狗！</p><hr/>
<p>它们是：
<%	out.print(this.getDogSpecies());//在此 嵌入java代码	%></p>

<h3>流浪狗种类</h3>
<ul>
<!-- 使用scriptlet语法，嵌入java代码使用for循环实现遍历输出宠物种类。 -->
<%	for(int i=0;i<dogSpecies.length;i++){ %>
		<%--表达式--%>
	<li><%=this.dogSpecies[i] %></li>
	<%} %>
</ul>
</body>
</html>