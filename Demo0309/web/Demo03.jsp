<%--
  Created by IntelliJ IDEA.
  User: yaozhijie
  Date: 2021/3/9
  Time: 10:33 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>九九乘法表</title>
</head>
<body>
<%
    for (int i = 1; i <10 ; i++) {
        %>
<br>
<%
        for (int j = i; j <10 ; j++) {
           %>
<%=i%>*<%=j%>=<%=i*j%> &nbsp;&nbsp;&nbsp;
<%
        }
    }
%>
</body>
</html>
