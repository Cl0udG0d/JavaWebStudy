<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/16/016
  Time: 18:29
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
    }else{
        %><%=session.getAttribute("name")+"注销成功"%><%
        session.invalidate();
    }
%>


</body>
</html>
