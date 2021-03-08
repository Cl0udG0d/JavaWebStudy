<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/8/008
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    请你输入自己的信息进行注册
    <form action="selectForm_result.jsp" method="post">
        请你输入账号 <input name="account" type="text"><br>
        请你输入密码 <input name="password" type="password"><br>
        <select name="home">
            <option value="beijing">北京</option>
            <option value="shanghai">上海</option>
            <option value="guangdong">广东</option>
        </select>
        <input type="submit" value="注册">
    </form>
</body>
</html>
