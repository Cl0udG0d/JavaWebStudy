<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%!
        static int num=0;
    %>
    <%
        num+=1;
        response.setHeader("Refresh","3");
    %>
    <%=num%>
</body>
</html>
