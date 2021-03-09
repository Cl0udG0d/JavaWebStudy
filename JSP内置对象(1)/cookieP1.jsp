<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%@ page import="java.net.CookieManager" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String str1="12";
        int number=Integer.parseInt(str1);
    %>
    该数字的平方为:<%=number*number%>
    <%
        Cookie cookie=new Cookie("number",str1);
        cookie.setMaxAge(10);
        response.addCookie(cookie);
    %>
    <a href="cookieP2.jsp">到达P2</a>
</body>
</html>
