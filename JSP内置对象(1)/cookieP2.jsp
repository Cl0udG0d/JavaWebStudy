<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String str1=null;
        Cookie[] cookies=request.getCookies();
        out.print("cookie中存储的信息有:<br>");
        for(int i=0;i<cookies.length;i++){
            out.print(cookies[i].getName()+":"+cookies[i].getValue()+"<br>");
        }
    %>
</body>
</html>
