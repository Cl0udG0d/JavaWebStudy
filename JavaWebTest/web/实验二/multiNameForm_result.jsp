<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/8/008
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String[] phoneList=request.getParameterValues("phone");
        for(int i=0;i<4;i++){
            out.println(phoneList[i]);
        }
    %>
</body>
</html>
