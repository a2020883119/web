<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie [] cookies = request.getCookies();
		//String [] strArr = cookies.;
		out.println(cookies.toString() + "<br>");
		out.println(cookies[0].getName() + " : " + cookies[0].getValue() + "<br>");
		out.println(cookies[1].getName() + " : " + cookies[1].getValue() + "<br>");
		out.println(cookies[2].getName() + " : " + cookies[2].getValue() + "<br>");
		for(int i = 0; i < cookies.length; i++){
			out.println(cookies[i].getName() + " : " + cookies[i].getValue() + "<br>");
		}
	%>
</body>
</html>