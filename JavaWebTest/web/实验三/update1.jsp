<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String mysqlUrl="jdbc:mysql://localhost/javaweb?user=root&password=root";
        Class.forName("com.mysql.jdbc.Driver");
        Connection coon=DriverManager.getConnection(mysqlUrl);
        Statement stat=coon.createStatement();

        String sql="update admin set id=3 where username='guest'";
        int i=stat.executeUpdate(sql);
        out.print("成功修改 "+i);

        stat.close();
        coon.close();
    %>
</body>
</html>
