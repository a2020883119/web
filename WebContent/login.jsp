<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<a href="/web/regis.jsp">regis</a>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	<center>
		<form action="LoginServlet" method="post">
			username: <input type="text" name="username"/><br>
			password: <input type="password" name="password"/><br>
			<input type="submit" value="submit"/> 
			<input type="reset" value="reset"/>
		</form>
	</center>
</body>
</html>