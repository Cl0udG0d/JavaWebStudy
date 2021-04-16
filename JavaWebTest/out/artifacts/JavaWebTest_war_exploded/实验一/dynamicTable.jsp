<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9/009
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        for(int i=1;i<=10;i+=1){
    %>
    <%=i%>:欢迎来到本系统<br>
    <%
        }
    %>
    <%!
        String[] str1=new String[]{"java","c#","python","c++","r","php"};
        String[] rank=new String[]{"1","4","2","3","5","6"};
    %>
    <table border="1">
        <tr>
            <td>自然编号</td>
            <td>语言名称</td>
            <td>目前排名</td>
        </tr>
        <%
            for(int i=0;i<str1.length;i++){
                %>
        <tr>
            <td><%=i+1%></td>
            <td><%=str1[i]%></td>
            <td><%=rank[i]%></td>
        </tr>
        <%
            }
        %>
    </table>
    <%
        String str1=request.getParameter("id");
        out.print(str1);
    %>
</body>
</html>
