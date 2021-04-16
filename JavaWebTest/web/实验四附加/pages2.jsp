<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/18/018
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.sql.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String mysqlUrl="jdbc:mysql://localhost/javaweb?user=root&password=root";
    Class.forName("com.mysql.jdbc.Driver"); //加载驱动
    Connection conn=DriverManager.getConnection(mysqlUrl);//链接数据库
    Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY); //创建一个statement实例
    int E=3;
    ResultSet rs=stmt.executeQuery("select * from college");
    rs.last();

    int totalCount=rs.getRow();
//    int totalCount=11;

    int totalPages=(totalCount%E==0)?(totalCount/E):(totalCount/E+1);
    //如果没有传递页码,则初始化为1
    int currentPage=request.getParameter("currentPage1")==null?1:Integer.parseInt(request.getParameter("currentPage1"));
//    int p=(currentPage-1)*E;
//    int currentPage=1;
//    int p=0;
//    ResultSet displayrs=rs.absolute(p);

%>
</body>
</html>
