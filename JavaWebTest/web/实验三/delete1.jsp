<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 15:28
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
        Connection conn=DriverManager.getConnection(mysqlUrl);
        Statement stmt = conn.createStatement();
        String sql="delete from admin where id=5";
        int i=stmt.executeUpdate(sql);
        out.print("成功删除 "+i+"行");
        stmt.close();
        conn.close();
    %>
</body>
</html>
