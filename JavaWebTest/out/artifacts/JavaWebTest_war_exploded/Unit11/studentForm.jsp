<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/15/015
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>填写信息</h3>
    <form method="post" action="./showStudent2.jsp">
        姓名:<input name="username"><br>
        年龄:<input name="age"><br>
        性别:<input name="sex" type="radio" value="男">男<input name="sex" type="radio" value="女">女<br>
        学位:<input name="level"><br>
        <input type="submit" value="添加">
        <input type="reset" value="重置">
    </form>
</body>
</html>
