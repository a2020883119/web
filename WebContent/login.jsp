<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="js/js.js"></script>
<title>Login</title>
</head>
<body>
<a href="/web/regis.jsp">regis</a>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
	<center>
		<form action="LoginServlet" method="post" onsubmit="return checkLoginInput()" >
			username: <input type="text" name="username" id="username"/><br>
			password: <input type="password" name="password" id="password"/><br>
			<input type="submit" value="submit"/> 
			<input type="reset" value="reset"/>
		</form>
	</center>
</body>
</html>