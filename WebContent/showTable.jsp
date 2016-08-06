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
	List list =  (List)session.getAttribute("stuList");	
%>
<body>
	<center>
		<a href="/web/ShowServlet">see table</a>
        <div>
       	  <form action="QueryServlet" method="post" name="">
                &nbsp;&nbsp;&nbsp;ID:&nbsp;<input type="text" name="id"/>
                &nbsp;NAME:&nbsp;<input type="text" name="name"/>
                CLASS:&nbsp;<input type="text" name="clas"/>
                &nbsp;ADDR:&nbsp;<input type="text" name="addr"/><br />
               &nbsp;&nbsp;&nbsp; &nbsp;<input type="submit" value="SERACH"/>&nbsp;&nbsp;<input type="reset" value="RESET"/><br />
          </form>
        </div>
        <div>
        	<table  style="text-align: right; width:770">
            	<tr><td><span><a href="showTableAdd.jsp">添加信息</a></span></td></tr>
            </table>   	
        </div>
        <div>
        	<table border="1" cellspacing="0"  style="width:800px;  text-align:center">
              <tr >
                <th scope="col" style="width:100px; ">序号</th>
                <th scope="col" style="width:150px; ">姓名</th>
                <th scope="col" style="width:150px; ">班级</th>
                <th scope="col" style="width:400px; ">地址</th>
                <th scope="col" style="width:100px; ">操作</th>
              </tr>
              <%
             	Student stu = new Student();
              	Iterator it = list.iterator();
              	while(it.hasNext()){
              		stu = (Student)it.next();
              %>
              <tr  >
                <td><%= stu.getId()%></td>
                <td><%= stu.getName() + "\t"%></td>
                <td><%= "\t" + stu.getClas() + "\t"%></td>
                <td><%=  "\t" + stu.getAddr()%></td>
                <td><a href="/web/DeleteServlet?id=<%= stu.getId()%>">删除</a>&nbsp;<a href="/web/showTableChange.jsp?id=<%= stu.getId()%>&name=<%= stu.getName()%>&clas=<%= stu.getClas()%>&addr=<%= stu.getAddr()%>">修改</a></td>
              </tr>
              <%
             	}
              %>
            </table>
        </div>
    </center>
</body>
</html>