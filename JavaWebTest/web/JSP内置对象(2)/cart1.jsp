<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 18:36
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
    %>
    <a href="cart2.jsp">查看购物车</a>
<%--    购物车中的内容为:--%>
<%--    <hr>--%>
<%--    <%--%>
<%--        for(int i=0;i<books.size();i++){--%>
<%--            String book=(String)books.get(i);--%>
<%--            out.println(book+"<br>");--%>
<%--        }--%>
<%--    %>--%>
</body>
</html>
