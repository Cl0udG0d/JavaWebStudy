<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="main.jsp" method="post">
        <input name="username" type="text"><br>
        <input name="password" type="password"><br>
        <input name="sex" value="boy" type="radio" checked>男
        <input name="sex" value="girl" type="radio">女<br>
        <select name="talk" multiple>
            <option value="c">C</option>
            <option value="python">python</option>
            <option value="go">go</option>
            <option value="java">java</option>
        </select>
        <br>
        <input type="submit" value="注册">
    </form>
</body>
</html>
