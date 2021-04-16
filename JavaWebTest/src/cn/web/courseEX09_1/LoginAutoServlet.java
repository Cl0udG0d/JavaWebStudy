package cn.web.courseEX09_1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;

@WebServlet("/LoginAutoServlet")
public class LoginAutoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        if(username==null&&password==null){
            resp.sendRedirect("/Unit9/login.jsp");
        }else{
            try {
                if(checkUserAndPass(username,password)){
                    HttpSession session=req.getSession();
                    session.setAttribute("username",username);
                    resp.sendRedirect("/Unit9/index.jsp");
                }else{
                    resp.sendRedirect("/Unit9/login.jsp");
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    public boolean checkUserAndPass(String username,String password) throws ClassNotFoundException, SQLException {
        String mysqlUrl="jdbc:mysql://localhost/javaweb?user=root&password=root";
        Class.forName("com.mysql.jdbc.Driver"); //加载驱动
        Connection conn= DriverManager.getConnection(mysqlUrl);//链接数据库
        Statement stmt = conn.createStatement();
        String sql=String.format("SELECT * FROM admin where username='%s'",username);
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()) { //移动指针
            String tempPass = rs.getString("password");
            if(tempPass.equals(password)){
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
