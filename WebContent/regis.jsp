<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<a href="/web/login.jsp">login</a>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	<center>
		<form action="RegisServlet" method="post">
			&nbsp;username&nbsp;&nbsp;: <input type="text" name="username"/><br>
			password1: <input type="password" name="password1"/><br>
			password2: <input type="password" name="password2"/><br>
			<input type="submit" value="submit"/> 
			<input type="reset" value="reset"/>
		</form>
	</center>
</body>
</html>