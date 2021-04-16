<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String id=session.getId();
        out.println("当前session id 为:"+id);
    %>
    <hr>
    <a href="sessionId2.jsp">到达下一个页面</a>
</body>
</html>
