<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/8/008
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    请你输入自己的信息进行注册:
    <form action="multiNameForm_result.jsp" method="post">
        请你输入你的电话号码（最多四个）<br>
        <%
            for(int i=0;i<4;i++){
                %>
        号码 <%=i%>:<input name="phone" type="text"><br>
        <%
            }
        %>
        <input type="submit" value="注册">
    </form>
</body>
</html>
