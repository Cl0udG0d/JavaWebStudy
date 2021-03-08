<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/8/008
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String str="12";
        int number=Integer.parseInt(str);
    %>
    该数字的平方为：<%=number*number%>
    <a href="urlP2.jsp?number=<%=number%>">到达p2页面</a>
</body>
</html>
