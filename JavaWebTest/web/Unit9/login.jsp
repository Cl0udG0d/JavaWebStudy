<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/5/005
  Time: 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="./css/bootstrap-clearmin.min.css">
    <link rel="stylesheet" type="text/css" href="./css/roboto.css">
    <link rel="stylesheet" type="text/css" href="./css/font-awesome.min.css">
</head>
<body class="cm-login">

<div class="text-center" style="padding:90px 0 30px 0;background:#fff;border-bottom:1px solid #ddd">
    <h1>Login</h1>
</div>

<div class="col-sm-6 col-md-4 col-lg-3" style="margin:40px auto; float:none;">
    <form method="post" action="/LoginAutoServlet">
        <div class="col-xs-12">
            <div class="form-group">
                <div class="input-group">
                    <div class="input-group-addon"><i class="fa fa-fw fa-user"></i></div>
                    <input type="text" name="username" class="form-control" placeholder="用户名">
                </div>
            </div>
            <div class="form-group">
                <div class="input-group">
                    <div class="input-group-addon"><i class="fa fa-fw fa-lock"></i></div>
                    <input type="password" name="password" class="form-control" placeholder="密码">
                </div>
            </div>
        </div>
        <div class="col-xs-6">
            <div class="checkbox"><label><input name="remeber" type="checkbox"> 记住我</label></div>
        </div><div class="col-xs-6">
        <button type="submit" class="btn btn-block btn-primary">登录</button>
    </div>
    </form>
</div>
</body>
</html>
