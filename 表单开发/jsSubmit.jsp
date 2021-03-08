<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/8/008
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    欢迎登陆学生管理系统
    <script type="text/javascript">
        function validate() {
            if(loginForm.account.value==""){
                window.alert("账号不能为空");
                loginForm.account.focus();
                return ;
            }else if(loginForm.password.value==""){
                window.alert("密码不能为空");
                loginForm.password.focus();
                return ;
            }
            loginForm.submit();
        }
    </script>
    <form name="loginForm" action="target.jsp" method="post">
        请你输入账号:<input name="account" type="text"><br>
        请你输入密码:<input name="password" type="password"><br>
        <input type="button" value="登陆" onclick="validate()">
    </form>
</body>
</html>
