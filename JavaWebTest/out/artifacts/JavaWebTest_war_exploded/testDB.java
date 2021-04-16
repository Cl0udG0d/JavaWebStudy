package cn.web.jdbc;
import java.sql.*;
//import java.lang.Class;

public class testDB {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String mysqlUrl="jdbc:mysql://localhost/javaweb?user=root&password=root";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(mysqlUrl);
        Statement stmt = conn.createStatement();
        try{
            ResultSet rs = stmt.executeQuery("SELECT * FROM admin"); //执行查询SQL语句
            while(rs.next()){ //移动指针
                String name=rs.getString("username");
                String pass=rs.getString("password");
                System.out.println("username:"+name+" password:"+pass+"\n");
            }
        }catch (Exception e){
            conn.rollback();
        }finally {
            conn.close();
            stmt.close();
        }
    }
}
