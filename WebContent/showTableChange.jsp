<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="js/js.js"></script>
<title>Insert title here</title>
</head>
<%
%>
<body>
<a href="ShowServlet">shaotable</a>
	<center>
		<form action="ChangeServlet" method="post" onsubmit="return checkInput()">
			 ID:<input type="text" readonly="readonly" id = "id" name = "id" value="<%= request.getParameter("id")%>"/>&nbsp;
             NAME:&nbsp;<input type="text" name="name" id = "name" value="<%= request.getParameter("name")%>"/>
             CLASS:&nbsp;<input type="text" name="clas" id = "clas" value="<%= request.getParameter("clas")%>"/>
             ADDR:&nbsp;<input type="text" name="addr" id = "addr" value="<%= request.getParameter("addr")%>"/><br />&nbsp;
            &nbsp;&nbsp;&nbsp; &nbsp;<input type="submit" value="submit"/>&nbsp;&nbsp;<input type="reset" value="RESET"/><br />
	    </form>
	</center>
</body>
</html>