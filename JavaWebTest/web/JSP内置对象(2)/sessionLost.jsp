<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 18:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="sessionLost.jsp" method="post">
        请你输入书本:<input name="book" type="text">
        <input type="submit" value="添加到购物车">
    </form>
    <hr>
    <%
        ArrayList books=new ArrayList();
        session.setAttribute("books",books);
        String book=request.getParameter("book");
        if(book!=null){
            books.add(book);
        }
    %>
    购物车中的内容是:<br>
    <%
        for(int i=0;i<books.size();i++){
            out.println(books.get(i)+"<br>");
        }
    %>
</body>
</html>
