<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/2/002
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test页面</title>
</head>
<body>
    <%
        out.print("欢迎来到本系统:)");
        String name="peter";
        String message="欢迎来到本系统";
    %>
    <br>
    <%=name+","+message%>
</body>
</html>
