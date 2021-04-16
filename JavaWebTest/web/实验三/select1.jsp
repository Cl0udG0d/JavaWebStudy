<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 14:48
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
    Class.forName("com.mysql.jdbc.Driver"); //加载驱动
    Connection conn=DriverManager.getConnection(mysqlUrl);//链接数据库
    Statement stmt = conn.createStatement(); //创建一个statement实例
    ResultSet rs = stmt.executeQuery("SELECT * FROM admin"); //执行查询SQL语句
    while(rs.next()){ //移动指针
        String name=rs.getString("username");
        String pass=rs.getString("password");
        out.print(name+":"+pass+"<br>");
    }
    //关闭连接
    stmt.close();
    conn.close();
%>
</body>
</html>
