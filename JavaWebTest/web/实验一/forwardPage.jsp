<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    <jsp:forward page="dynamicTable.jsp"></jsp:forward>--%>
    <jsp:forward page="dynamicTable.jsp">
        <jsp:param name="id" value="007"/>
    </jsp:forward>
</body>
</html>
