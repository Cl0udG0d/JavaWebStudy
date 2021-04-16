<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/15/015
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>用户登录</h3>

    <form action="${pageContext.request.contextPath}/ValidateServlet">
        用户名:<input type="text" name="username"><br>
        密码:<input type="password" name="password"><br>
        验证码:<input type="text" name="code"><br>
        <img id="codeImg" src="${pageContext.request.contextPath}/GenerateCodeServlet"><br>
        <input type="button" onclick="javascript:change()" value="刷新">
        <input type="submit" value="登陆">
    </form>
<script>
    function change() {
        var t = new Date();
        document.getElementById('codeImg').src="<%=request.getContextPath()%>/GenerateCodeServlet?time="+t;
    }
</script>
</body>
</html>
