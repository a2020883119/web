<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="test" class="servlets.JavaBeanPrac"></jsp:useBean>
<jsp:setProperty name="test" property="*"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
		<td>
			<h1>test</h1>
		</td>
		</tr>
		<tr>
			<td>id:<jsp:getProperty property="id" name="test"/></td>
		</tr>
		<tr>
			<td>name:<jsp:getProperty property="name" name="test"/></td>
		</tr>
		<tr>
			<td>addr:<jsp:getProperty property ="addr" name="test"/></td>
		</tr>
		<tr>
			<td>price:<jsp:getProperty property="price" name="test"/></td>
		</tr>
		<tr>
			<td>count:<jsp:getProperty property="count" name="test"/></td>
		</tr>
	</table>
</body>
</html>