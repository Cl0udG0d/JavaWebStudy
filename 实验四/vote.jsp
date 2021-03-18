<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/16/016
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        int tid = Integer.parseInt(request.getParameter("id"));
        String mysqlUrl="jdbc:mysql://localhost/javaweb?user=root&password=root";
        Class.forName("com.mysql.jdbc.Driver"); //加载驱动
        Connection conn=DriverManager.getConnection(mysqlUrl);//链接数据库
        String sql1="update teacher set flag=flag+1 where id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql1);
        pstmt.setInt(1,tid);
        pstmt.executeUpdate(); //执行查询SQL语句

        pstmt.close();
        conn.close();
    %>
<jsp:forward page="display.jsp"/>
</body>
</html>
