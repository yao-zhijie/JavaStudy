<%--
  Created by IntelliJ IDEA.
  User: yaozhijie
  Date: 2021/3/9
  Time: 10:22 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jspTest</title>
</head>
<body>
<%
int score = 90;
if (score>=90){
%>
<h1>你得到了A</h1>
<%
    } else if (score>=80){
%>
<h1>你得到了B</h1>
<%
    }else {
%>
<h1>你的到了一顿毒打</h1>
<%
    }
%>
</body>
</html>
