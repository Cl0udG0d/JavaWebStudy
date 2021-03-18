<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 13:31
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

<%
    Context ctx = new InitialContext();
    //取得DataSource实例,()中为JNDI名称
    DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/test");
    //取得数据库连接
    Connection conn = ds.getConnection();

%>
<%
    String tempUsername=request.getParameter("name");
    String tempPassword=request.getParameter("password");

    String sql1="SELECT * FROM users where name=? and password=?";
    PreparedStatement  pstmt = conn.prepareStatement(sql1); //创建一个statement实例
    System.out.println(tempUsername+" "+tempPassword);
    pstmt.setString(1,tempUsername);
    pstmt.setString(2,tempPassword);
    try {
        ResultSet rs=pstmt.executeQuery();
        if(rs.next()){ //移动指针
            String un=rs.getString("name");
            int logincount=rs.getInt("logincount");
            session.setAttribute("name",un);
            session.setAttribute("count",logincount);

            logincount++;
            String sql2="update users set logincount=? where name=? and password=?";
            PreparedStatement  pstmt2 = conn.prepareStatement(sql2);
            pstmt2.setInt(1,logincount);
            pstmt2.setString(2,tempUsername);
            pstmt2.setString(3,tempPassword);
            pstmt2.executeUpdate();
            %>
            <jsp:forward page="index.jsp" />
            <%
        }else{

%><jsp:forward page="login.jsp" />
<%
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

%>
<%
    if(session.getAttribute("name")==null){
%><jsp:forward page="login.jsp"/>
<%
    }
%>
</body>
</html>
