<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/4/004
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*"%>
<html>
<head>
    <title>购物界面</title>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<%
    String mysqlUrl="jdbc:mysql://localhost/javaweb?user=root&password=root";
    Class.forName("com.mysql.jdbc.Driver"); //加载驱动
    Connection conn=DriverManager.getConnection(mysqlUrl);//链接数据库
    Statement stmt = conn.createStatement(); //创建一个statement实例
    ResultSet rs = stmt.executeQuery("SELECT * FROM booklist"); //执行查询SQL语句


%>
    <ul class="nav nav-tabs">
        <li role="presentation" class="active"><a href="/Unit8/shopping.jsp">主页</a></li>
        <li role="presentation"><a href="/Unit8/cart.jsp">购物车</a></li>
        <li role="presentation"><a href="/output">注销</a></li>
    </ul>
    <h3>请选择你需要购买的图书:</h3>
<hr>
    <form method="post" action="/servletShopping">

        <div class="checkbox">
            <%
                while(rs.next()){ //移动指针
                    String bookname=rs.getString("bookname");
                    %>
            <label><input type="checkbox" name="selectedItems" value=<%=bookname%>><%=bookname%></label>
                    <%
//                            out.print(" "+bookname);
                }

                        //关闭连接
                        stmt.close();
                        conn.close();
            %>

        </div>
        <input type="submit" value="确定">
    </form>

</body>
</html>
