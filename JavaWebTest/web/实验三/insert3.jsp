<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        int id=Integer.parseInt(request.getParameter("id"));
        String username=request.getParameter("username");
        String password=request.getParameter("password");

        String mysqlUrl="jdbc:mysql://localhost/javaweb?user=root&password=root";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(mysqlUrl);
        Statement stmt = conn.createStatement();
        String sql="insert into admin(id,username,password) values(?,?,?)";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setInt(1,id);
        ps.setString(2,username);
        ps.setString(3,password);
        int i=ps.executeUpdate();
        out.print("成功执行了 "+i+"行");

        stmt.close();
        conn.close();
    %>
</body>
</html>
