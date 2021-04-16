<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/18/018
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.sql.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--使用常规结果集 Statement --%>
<%@include file="pages1.jsp"%>
<%
    for(int i=1;i<=totalPages;i++){
        if(i==currentPage){
            %>
<%=i%>
<%
        }else{
            %>
<a href="morepages1.jsp?currentPage1=<%=i%>"><%=i%></a>
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
        while(displayrs.next()){
    %>
    <tr>
        <td><%=displayrs.getInt("id")%></td>
        <td><%=displayrs.getString("school")%></td>
        <td><%=displayrs.getString("admin")%></td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
