<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file = "top.jsp" %>

	<a href="ShowServlet">shaotable</a>
	<!-- <input type="text"/> -->
	<!--<button>haha</button> -->
	
	<%
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String datee = sdf.format(date);
	%>
	<br>
	<h1>Time:<%= datee %></h1>
	<table>
		<%
		for(int i = 1; i < 10; i++){
		%>
			<tr>
			<%
			for(int j = 1; j < i; j++){
			%>
				<td><%=j %>*<%=i %>=<%=i*j %>&nbsp&nbsp</td>
			<%
			}
			%>
			</tr>			
		<%
		}
		%>
	</table>
	<h1><%= application.getAttribute("count") %></h1>
	<%@ include file = "bottom.jsp" %>
</body>
</html>