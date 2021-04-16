<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/8/008
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<ul class="nav nav-tabs">
    <li role="presentation"><a href="/Unit9/index.jsp">主页</a></li>
    <li role="presentation"><a href="/ServletInvalidate">注销</a></li>
</ul>
    <h3>欢迎：</h3><%=session.getAttribute("username")%>

</body>
</html>
