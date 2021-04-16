<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/15/015
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="student" scope="page" class="cn.web.javabean.student"></jsp:useBean>
<jsp:setProperty name="student" property="username" value="张三"></jsp:setProperty>
<jsp:setProperty name="student" property="age" value="18"></jsp:setProperty>
<jsp:setProperty name="student" property="sex" value="男"></jsp:setProperty>
<jsp:setProperty name="student" property="level" value="大学"></jsp:setProperty>

<h3>姓名:<jsp:getProperty name="student" property="username"/></h3>
<h3>年龄:<jsp:getProperty name="student" property="age"/></h3>
<h3>性别:<jsp:getProperty name="student" property="sex"/></h3>
<h3>学位:<jsp:getProperty name="student" property="level"/></h3>

</body>
</html>
