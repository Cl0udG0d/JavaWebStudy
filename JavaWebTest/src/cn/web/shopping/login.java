package cn.web.shopping;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;
import java.text.DateFormat;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

//登陆界面
@WebServlet("/login")
public class login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        String result="";
        System.out.println("username:"+username+" password:"+password);
        try {
            if(checkLogin(username,password)){
                HttpSession session=req.getSession();
                shoppingcart newShoppingCart=new shoppingcart();
                Statement stmt=conMysql();
                String sql=String.format("SELECT * FROM shopuser where username='%s'",username);
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()) { //移动指针
                    result = rs.getString("booklist");
                    session.setAttribute("username",rs.getString("username"));
                }
                if(result.length()!=0){
                    String[] templist = result.split("springbird123");
                    for(int i=0;i<templist.length;i++){
                        System.out.println(templist[i]);
                        String bookname=templist[i].split(":")[0];
                        Integer number= Integer.valueOf(templist[i].split(":")[1]);
                        newShoppingCart.addBookNum(bookname,number);
                    }
                }
                session.setAttribute("shoppingcart",newShoppingCart);
                resp.sendRedirect("/Unit8/shopping.jsp");
            }else{
                resp.sendRedirect("/Unit8/login.jsp");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Statement conMysql() throws SQLException, ClassNotFoundException {
        String mysqlUrl="jdbc:mysql://localhost/javaweb?user=root&password=root";
        Class.forName("com.mysql.jdbc.Driver"); //加载驱动
        Connection conn= DriverManager.getConnection(mysqlUrl);//链接数据库
        Statement stmt = conn.createStatement();
        return stmt;
    }
    public boolean checkLogin(String username, String password) throws SQLException, ClassNotFoundException {
        Statement stmt=conMysql();
        String sql=String.format("SELECT * FROM shopuser where username='%s'",username);
        ResultSet rs = stmt.executeQuery(sql); //执行查询SQL语句
        while(rs.next()) { //移动指针
            String pass = rs.getString("password");
            if(pass.equals(password)){
                System.out.println("登陆成功");
                return true;
            }
        }
        return false;
    }
}
