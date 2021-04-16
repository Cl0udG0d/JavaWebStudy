<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/8/008
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>目前在线人数为:</h3><%=application.getAttribute("user")%>
    <a href="/ServletLogout">注销</a>
</body>
</html>
