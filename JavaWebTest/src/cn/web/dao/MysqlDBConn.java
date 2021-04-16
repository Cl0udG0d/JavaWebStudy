package cn.web.dao;

import com.mysql.jdbc.Connection;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ResourceBundle;

public class MysqlDBConn {
//    private String driver="";
//    private String url="";
//    private String username="";
//    private String password="";

    public static Connection initConn() throws ClassNotFoundException, SQLException, IOException {
        ResourceBundle resource=ResourceBundle.getBundle("jdbc");
        String driver=resource.getString("jdbc.driverClassName");
        String url=resource.getString("jdbc.connection.url");
        String username=resource.getString("jdbc.connection.username");
        String password=resource.getString("jdbc.connection.password");
        String mysqlUrl= String.format("%s?user=%s&password=%s", url,username,password);
        Class.forName(driver);
        java.sql.Connection conn= DriverManager.getConnection(mysqlUrl);
        System.out.println("连接成功!");
        return (Connection) conn;
    }

    public static void closeConn(Connection conn) throws SQLException {
        conn.close();
        System.out.println("conn close!");
    }
}

