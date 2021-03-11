<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 16:13
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
        conn.setAutoCommit(false);
        Statement stmt = conn.createStatement();
        String sql1="update1";
        String sql2="update2";
        try{
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);
            conn.commit();
        }catch (Exception e){
            conn.rollback();
        }finally {
            conn.close();
            stmt.close();
        }

    %>
</body>
</html>
