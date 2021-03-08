<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/8/008
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String str=request.getParameter("nunmber");
        int number=Integer.parseInt(str);
    %>
    该数字的立方为:<%=number*number*number%><hr>
</body>
</html>
