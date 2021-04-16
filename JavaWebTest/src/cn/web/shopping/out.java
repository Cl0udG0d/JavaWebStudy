package cn.web.shopping;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;
import java.util.Map;

@WebServlet("/output")
public class out extends HttpServlet {

    public Statement conMysql() throws SQLException, ClassNotFoundException {
        connectMysql coon=new connectMysql();
        Connection connection=coon.con();
        Statement stmt = connection.createStatement();
        return stmt;
    }


    //保存当前角色的数据
    public void saveData(HttpSession session) throws SQLException, ClassNotFoundException {
        String mysqlUrl="jdbc:mysql://localhost/javaweb?user=root&password=root";
        Class.forName("com.mysql.jdbc.Driver"); //加载驱动
        Connection conn= DriverManager.getConnection(mysqlUrl);//链接数据库
        Statement stmt = conn.createStatement();
        shoppingcart nowShoppingCart= (shoppingcart) session.getAttribute("shoppingcart");
        String data="";
        for(Map.Entry<String, Integer> entry:nowShoppingCart.items.entrySet()){
            if(data.equals("")){
                data=entry.getKey()+":"+entry.getValue()+"springbird123";
            }else{
                data+=entry.getKey()+":"+entry.getValue()+"springbird123";
            }
//            out.print(entry.getKey()+":"+entry.getValue()+"本<br>");
        }
        String sql = String.format("update shopuser set booklist = '%s' where username = '%s'",data, session.getAttribute("username"));
        int i=stmt.executeUpdate(sql);
        System.out.print("成功修改 "+i);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        try {
            saveData(session);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        session.invalidate();
        resp.sendRedirect("/Unit8/login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
