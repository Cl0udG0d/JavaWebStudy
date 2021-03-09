<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%!
        String username="admin";
        String password="123456";
    %>
    <%
        String tempUsername=request.getParameter("username");
        String tempPassword=request.getParameter("password");
        if(tempUsername.equals(username)){
            if(tempPassword.equals(password)){
                out.print("欢迎登陆 "+username);
            }else{
                out.print("密码错误 :)");
            }
        }else{
            out.print("用户名错误");
        }
    %>
</body>
</html>
