<%@ page import="cn.web.shopping.shoppingcart" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/5/005
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>
<ul class="nav nav-tabs">
    <li role="presentation"><a href="/Unit8/shopping.jsp">主页</a></li>
    <li role="presentation" class="active"><a href="/Unit8/cart.jsp">购物车</a></li>
    <li role="presentation"><a href="/output">注销</a></li>
</ul>
<h3>当前购物车中有:</h3>
<hr>
<%
    response.setCharacterEncoding("UTF-8");
    String username= (String) session.getAttribute("username");
    System.out.println(username);
    if(username==null){
        response.sendRedirect("/Unit8/login.jsp");
        return ;
    }
    shoppingcart nowShoppingCart= (shoppingcart) session.getAttribute("shoppingcart");
    for(Map.Entry<String, Integer> entry:nowShoppingCart.items.entrySet()){
        out.print(entry.getKey()+":"+entry.getValue()+"本<br>");
    }
%>
</body>
</html>
