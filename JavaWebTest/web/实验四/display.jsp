<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/16/016
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*"%>
<%@page import="javax.naming.*"%>
<%@page import="javax.sql.*"%>
<%@page import="java.sql.*"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table align="center">
        <caption>欢迎给教师投票</caption>
        <tr bgcolor="yellow">
            <td>编号</td>
            <td>姓名</td>
            <td>票数</td>
            <td>投票</td>
        </tr>
        <%
            Context ctx = new InitialContext();
            //取得DataSource实例,()中为JNDI名称
            DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/test");
            //取得数据库连接
            Connection conn = ds.getConnection();
            Statement stmt = conn.createStatement(); //创建一个statement实例
            ResultSet rs = stmt.executeQuery("SELECT * FROM teacher"); //执行查询SQL语句
            while(rs.next()){ //移动指针
                Integer id=rs.getInt("id");
                String name=rs.getString("username");
                Integer flag=rs.getInt("flag");
                %>
            <tr bgcolor="pink">
                <td><%=id%></td>
                <td><%=name%></td>
                <td><%=flag%></td>
                <td><a href="vote.jsp?id=<%=id%>">投票</a></td>
            </tr>
        <%
            }
            //关闭连接
            stmt.close();
            conn.close();
        %>
    </table>
</body>
</html>
