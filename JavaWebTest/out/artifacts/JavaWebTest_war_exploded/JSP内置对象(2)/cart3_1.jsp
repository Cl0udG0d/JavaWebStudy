<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        ArrayList books=new ArrayList();
        books.add("三国演义");
        books.add("西游记");
        books.add("水浒传");
        session.setAttribute("books",books);
    %>
    <a href="cart3_2.jsp">查看购物车</a>
</body>
</html>
