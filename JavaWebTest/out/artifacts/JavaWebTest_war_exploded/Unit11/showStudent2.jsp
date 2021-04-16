<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/15/015
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8");%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="student" scope="page" class="cn.web.javabean.student"></jsp:useBean>
<jsp:setProperty name="student" property="username" param="username"></jsp:setProperty>
<jsp:setProperty name="student" property="age" param="age"></jsp:setProperty>
<jsp:setProperty name="student" property="sex" param="sex"></jsp:setProperty>
<jsp:setProperty name="student" property="level" param="level"></jsp:setProperty>

<h3>姓名:<jsp:getProperty name="student" property="username"/></h3>
<h3>年龄:<jsp:getProperty name="student" property="age"/></h3>
<h3>性别:<jsp:getProperty name="student" property="sex"/></h3>
<h3>学位:<jsp:getProperty name="student" property="level"/></h3>

</body>
</html>
