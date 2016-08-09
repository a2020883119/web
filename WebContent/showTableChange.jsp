<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<%
%>
<body>
	<center>
		<form action="ChangeServlet" method="post" name="">
			ID:<input type="text" readonly="readonly" name = "id" value="<%= request.getParameter("id")%>"/>
             &nbsp;NAME:&nbsp;<input type="text" name="name" value="<%= request.getParameter("name")%>"/>
             CLASS:&nbsp;<input type="text" name="clas" value="<%= request.getParameter("clas")%>"/>
             &nbsp;ADDR:&nbsp;<input type="text" name="addr" value="<%= request.getParameter("addr")%>"/><br />
            &nbsp;&nbsp;&nbsp; &nbsp;<input type="submit" value="submit"/>&nbsp;&nbsp;<input type="reset" value="RESET"/><br />
	    </form>
	</center>
</body>
</html>