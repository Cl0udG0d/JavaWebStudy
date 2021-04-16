<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Integer count=(Integer)application.getAttribute("count");
        if(count==null){
            count=new Integer(0);
        }
        count++;
        application.setAttribute("count",count);
    %>
    你是该页面的第<%=count%>访问者
</body>
</html>
