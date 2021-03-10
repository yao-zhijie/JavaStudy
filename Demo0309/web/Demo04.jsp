<%@ page import="com.demo.test02.bean.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: yaozhijie
  Date: 2021/3/9
  Time: 11:28 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>
</head>
<body>
<%
List<Student> students = (List<Student>) request.getAttribute("student");
%>
<table>
    <thead>
    <th>
    <td>编号</td>
    <td>姓名</td>
    <td>年纪</td>
    </th>
    </thead>
    <tbody>
<%
    for (int i = 0; i <students.size() ; i++) {
%>
<tr>
<td>
<%=students.get(i).getId()%>
</td>
<td>
<%=students.get(i).getName()%>
</td>
    <td>
        <%=students.get(i).getAge()%>
    </td>
</tr>

<%
    }
%>
    </tbody>
</table>



</body>
</html>
