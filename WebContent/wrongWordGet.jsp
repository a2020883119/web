<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	name:<%=new String(request.getParameter("name")) %><br>
	pass:<%=new String(request.getParameter("pass")) %><br>
	name1:<%=new String(request.getParameter("name1").getBytes("iso-8859-1"), "utf-8") %><br>
	pass1:<%=new String(request.getParameter("pass1").getBytes("iso-8859-1"), "utf-8") %><br>
	头信息:<%= request.getHeaderNames()%><br>
	getmethod:<%= request.getMethod() %><br>
	协议名称:<%= request.getProtocol()%><br>
	客户端地址:<%= request.getRequestURI()%><br>
	请求文件绝对路径:<%= request.getRealPath("wrongWrodGet.jsp")%><br>
	获取客户端ip地址:<%= request.getRemoteAddr()%><br>
	获取客户端主机姓名:<%= request.getRemoteHost()%><br>
	获取服务器名称:<%= request.getServerName()%><br>
	获取客户端请求的脚本文件路径:<%= request.getServletPath()%><br>
	获取服务器端口号:<%= request.getServerPort()%><br>
</body>
</html>