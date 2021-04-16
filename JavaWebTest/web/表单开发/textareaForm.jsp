<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/8/008
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="textareaForm_result.jsp" method="post">
        请你输入账号:<input name="account" type="text"><br>
        请你输入密码:<input name="password" type="password"><br>
        请你输入个人信息:<br>
        <textarea name="info" rows="5" cols="30"></textarea>
        <input type="submit" value="注册">
    </form>
</body>
</html>
