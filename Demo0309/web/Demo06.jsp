<%--
  Created by IntelliJ IDEA.
  User: yaozhijie
  Date: 2021/3/9
  Time: 2:43 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
pageContext域的值<%=pageContext.getAttribute("key")%>
request域的值<%=request.getAttribute("key")%>
session域的值<%=session.getAttribute("key")%>
application域的值<%=application.getAttribute("key")%>
</body>
</html>
