<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="test" class="servlets.JavaBeanPrac" scope="page"></jsp:useBean>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<form action="javaBeanPrac_Get.jsp" method="post">
	<table>
		<tr>
		<td>
			<h1>test</h1>
		</td>
		</tr>
		<tr>
			<td>id:<input type="text"/ name="id"></td>
		</tr>
		<tr>
			<td>name:<input type="text" name="name"/></td>
		</tr>
		<tr>
			<td>addr:<input type="text" name="addr"/></td>
		</tr>
		<tr>
			<td>price:<input type="text" price="price"/></td>
		</tr>
		<tr>
			<td>count:<input type="text" name="count"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="submit"></td>
		</tr>
	</table>
	</form>
</center>
</body>
</html>