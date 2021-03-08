<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/8/008
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String home=request.getParameter("home");
        out.print("家乡为 "+home);
    %>
</body>
</html>
