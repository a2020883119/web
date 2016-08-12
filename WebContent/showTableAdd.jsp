<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="js/js.js"></script>
<title>Insert title here</title>
</head>

<body>
<a href="ShowServlet">showtable</a>
	<center>
		<form action="InsertServlet" method="post" onsubmit="return checkInput()">
             NAME:&nbsp;<input type="text" name="name" id="name"/>&nbsp;
             CLASS:&nbsp;<input type="text" name="clas" id="clas"/>&nbsp;
             ADDR:&nbsp;<input type="text" name="addr" id="addr"/><br />&nbsp;&nbsp;&nbsp; &nbsp;
            <input type="submit" value="submit" />&nbsp;&nbsp;<input type="reset" value="RESET"/><br />
	    </form>
	</center>
</body>
</html>