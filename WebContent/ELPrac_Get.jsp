<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="message" class="entity.Student"></jsp:useBean>
<jsp:setProperty property="*" name="message"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

%>
	<table>
		<tr>
		<td>
			<h1>test</h1>
			${"haha"}
		</td>
		</tr>	
		<tr>
			<td>id:${id}</td>
		</tr>
		<tr>
			<td>name:${name}</td>
		</tr>
		<tr>
			<td>addr:${test }</td>
		</tr>
		<tr>
			<td>price:${testArr }</td>
		</tr>
		<tr>
			<td>count:${testArr[1] }</td>
			<td>count:${testArr[2] }</td>
			<td>count:${message }</td>
			<td>count.:${message.id }</td>
			<td>count[]:${message[id] }</td>
			
		</tr>
	</table>
</body>
</html>