<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>doLogin</title>
</head>
<body>
	<%
		request.setAttribute("test", "123456");
		String user = request.getParameter("username");
		String pwd = request.getParameter("password");
		String test = request.getAttribute("test").toString();
	%>
	用户名：<%=user %><br>
	密码:<%=pwd %><br>
	test:<%=test %>
</body>
</html>