<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String sex=request.getParameter("sex");
        String[] talk=request.getParameterValues("talk");
    %>
    <h2><%="用户名:"+username%></h2>
    <h2><%="密码:"+password%></h2>
    <h2><%="性别:"+sex%></h2>
    擅长的语言有:<br>
    <%
        for(int i=0;i<talk.length;i++){
            out.print(talk[i]+" ");
        }
    %>
</body>
</html>
