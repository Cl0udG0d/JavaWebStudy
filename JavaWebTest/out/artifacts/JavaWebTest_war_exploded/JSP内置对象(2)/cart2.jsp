<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    购物车中的内容为:
    <hr>
    <%
        ArrayList books=new ArrayList();
        for(int i=0;i<books.size();i++){
            String book=(String)books.get(i);
            out.println(book+"<br>");
        }
    %>
</body>
</html>
