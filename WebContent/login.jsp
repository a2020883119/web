<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>login</title>
</head>
<%
	request.setAttribute("test", "你收到了吗？");
%>
<body>
	<center>
		<form action="doLogin.jsp" method="post" name="form1"/>
			用户名：<input type="text" id="username" name="username"/>
			密&nbsp码：<input type="password" id="password" name="password"/>
			<input type="submit" value="提交">
		</form>
	</center>
</body>
</html>