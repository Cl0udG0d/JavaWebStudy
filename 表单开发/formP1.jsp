<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/8/008
  Time: 20:34
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
    该数字的平方为:<%=number*number%><hr>
    <form action="formP2.jsp" method="post">
        <input type="text" name="number" value="<%=number%>">
        <input type="submit" value="到达p2">
    </form>
</body>
</html>
