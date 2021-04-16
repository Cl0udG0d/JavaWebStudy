<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/16/016
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if(session.getAttribute("name")==null){
%><jsp:forward page="login.jsp"/>
    <%
    }
    %>
    <h2>index页面</h2>
<h3>欢迎<%=session.getAttribute("name")%></h3>
<h3>这是你第<%=session.getAttribute("count")+"登陆"%></h3>
<a href="logout.jsp">注销</a>

</body>
</html>
