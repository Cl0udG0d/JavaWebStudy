package cn.web.servlert2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

public class JDBCServlet extends HttpServlet {
    private String mysqlUrl;
    private String driver;
    private String user;
    private String password;
    private String Url;
    @Override
    public void init() throws ServletException {
        mysqlUrl=getInitParameter("url");
        driver=getInitParameter("driver");
        user=getInitParameter("user");
        password=getInitParameter("password");

        Url=mysqlUrl+"?user="+user+"&password="+password;

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    private Connection con() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(Url);
        return conn;
    }

    private void insertData(Statement stmt,String sql) throws SQLException {
        int i=stmt.executeUpdate(sql);
        System.out.print("成功添加"+i+"行");
    }

    private void delData(Statement stmt,String sql) throws SQLException {
        int i=stmt.executeUpdate(sql);
        System.out.print("成功删除 "+i+"行");
    }

    private void updateData(Statement stmt,String sql) throws SQLException {
        int i=stmt.executeUpdate(sql);
        System.out.print("成功修改 "+i);
    }

    private ResultSet selectData(Statement stmt,String sql) throws SQLException{
        return stmt.executeQuery(sql);
    }

    private void closeCon(Connection conn) throws SQLException {
        conn.close();
    }

    private void closeStmt(Statement stmt) throws SQLException {
        stmt.close();
    }

    private void outputSelectData(ResultSet rs) throws SQLException {
        while(rs.next()) { //移动指针
            String name = rs.getString("username");
            String pass = rs.getString("password");
            System.out.println(name + ":" + pass);
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        try {
            Connection conn=con();
            Statement stmt = conn.createStatement();
            ResultSet rs = selectData(stmt,"SELECT * FROM admin"); //执行查询SQL语句
            outputSelectData(rs);
            closeStmt(stmt);
            closeCon(conn);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
