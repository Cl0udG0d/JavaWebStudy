<%@ page contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@page import="javax.naming.*"%>
<%@page import="javax.sql.*"%>
<%@page import="java.sql.*"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
</head>
<body>

<%
    Context ctx = new InitialContext();
        //取得DataSource实例,()中为JNDI名称
    DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/test");
        //取得数据库连接
    Connection conn = ds.getConnection();
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM admin"); //执行查询SQL语句
    while(rs.next()){ //移动指针
        String name=rs.getString("username");
        System.out.println("链接数据库成功,当前用户名为:"+name);
    }
%>
<!-- 若不为空，则已连接 -->
<%=conn %>
<%
    conn.close();
%>

</body>
</html>