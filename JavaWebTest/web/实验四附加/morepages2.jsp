<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/18/018
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.sql.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="pages2.jsp"%>
<%
    for(int i=1;i<=totalPages;i++){
        if(i==currentPage){
%>
<%=i%>
<%
}else{
%>
<a href="morepages2.jsp?currentPage1=<%=i%>"><%=i%></a>
<%
        }
    }
%>
共<%=totalPages%>页,共<%=totalCount%>条记录
<table border="1">
    <tr>
        <td>编号</td>
        <td>学院</td>
        <td>负责人</td>
    </tr>
    <%
        for(int i=1;i<=3;i++){
            int currentP=(currentPage-1)*E+i;
            if(currentP>totalCount){
                break;
            }
            System.out.println(currentP);
            rs.absolute(currentP);
            int id=rs.getInt("id");
            String school=rs.getString("school");
            String admin=rs.getString("admin");
    %>
    <tr>
        <td><%=id%></td>
        <td><%=school%></td>
        <td><%=admin%></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
