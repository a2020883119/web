<%@page import="entity.Student"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<%
	List list =  (List)session.getAttribute("stulist");	
%>
<body>
	<center>
		当前用户:<%=session.getAttribute("username") %>&nbsp;&nbsp;&nbsp;
		<a href="/web/LoginOutServlet">登出</a>
		<br><br><br><br>
        <div>
       	  <form action="QueryServlet" method="post" name="">&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;ID:&nbsp;<input type="text" name="id"/>&nbsp;&nbsp;
                &nbsp;NAME:&nbsp;<input type="text" name="name"/>&nbsp;&nbsp;
                CLASS:&nbsp;<input type="text" name="clas"/>&nbsp;&nbsp;
                &nbsp;ADDR:&nbsp;<input type="text" name="addr"/><br /><br>
               <input type="submit" value="SERACH"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="RESET"/><br />
          </form>
        </div>
        <br>
        <br>
        <br>
        <br>
        <div>
        	<table style="width:800px;  text-align:left">
            	<tr>
            		<td><span><a href="showTableAdd.jsp">添加信息</a></span></td>
            		
            		<td style="text-align:right">
            			<a href="/web/InsertOneDataServlet">InsertOne</a>&nbsp;&nbsp;
            			<a href="/web/ShowServlet">Refresh</a>&nbsp;&nbsp;
            		</td>
            	</tr>
            </table>   	
        </div>
        <div>
        	<form action="DeletesServlet" method="post">
	        	<table border="1" cellspacing="0"  style="width:800px;  text-align:center">
	              <tr >
	                <th scope="col" style="width:100px; ">选中</th>
	                <th scope="col" style="width:100px; ">序号</th>
	                <th scope="col" style="width:150px; ">姓名</th>
	                <th scope="col" style="width:150px; ">班级</th>
	                <th scope="col" style="width:300px; ">地址</th>
	                <th scope="col" style="width:100px; ">操作</th>
	              </tr>
	              <%
	             	Student stu = new Student();
	              	Iterator it = list.iterator();
	              	while(it.hasNext()){
	              		stu = (Student)it.next();
	              %>
	              <tr  >
	                <td><input type="checkbox" name="nums" value="<%= stu.getId()%>"/> </td>
	                <td><%= stu.getId()%></td>
	                <td><%= stu.getName() + "\t"%></td>
	                <td><%= "\t" + stu.getClas() + "\t"%></td>
	                <td><%=  "\t" + stu.getAddr()%></td>
	                <td><a href="/web/DeleteServlet?id=<%= stu.getId()%>">删除</a>&nbsp;<a href="/web/showTableChange.jsp?id=<%= stu.getId()%>&name=<%= stu.getName()%>&clas=<%= stu.getClas()%>&addr=<%= stu.getAddr()%>">修改</a></td>
	              </tr>
	              <%
	             	}
	              %>
	              <tr >
	                <td><b>选中</b></td>
	                <td><b>序号</b></td>
	                <td><b>姓名</b></td>
	                <td><b>班级</b></td>
	                <td><b>地址</b></td>
	                <td><b>操作</b></td>
	              </tr>
	              <tr >
	              	<td colspan="1"><span><input type="submit" value="批量删除"/></span></td>
	              	<td colspan="2">数据总数：<%= session.getAttribute("total")%></td>
	              	<td colspan="3"><a href="/web/ShowServlet">首页</a>&nbsp;-&nbsp;<a href="/web/PageServlet?n=1&p=<%= session.getAttribute("page")%>">上页</a>&nbsp;-&nbsp<%= session.getAttribute("page") %>/<%= session.getAttribute("last") %>&nbsp;-&nbsp;<a href="/web/PageServlet?n=2&p=<%= session.getAttribute("page")%>">下页</a>&nbsp;-&nbsp;<a href="/web/PageServlet?n=3&p=<%= session.getAttribute("last")%>">末页</a>&nbsp;&nbsp;</td>
	              </tr>
	            </table>
            </form>
        </div>
    </center>
</body>
</html>