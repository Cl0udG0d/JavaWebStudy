package cn.web.dao;

import cn.web.vo.book;

import java.sql.*;
import java.util.HashMap;

public class DBUtils {

    public HashMap<String ,String> getAllBook(Connection conn) throws SQLException {
        HashMap<String, String> booklist = new HashMap<String, String>();
        Statement stmt = conn.createStatement();
        try{
            ResultSet rs = stmt.executeQuery("SELECT * FROM booklist"); //执行查询SQL语句
            while(rs.next()){ //移动指针
                booklist.put(rs.getString("id"),rs.getString("bookname"));
            }
        }catch (Exception e){
            conn.rollback();
        }finally {
            conn.close();
            stmt.close();
        }
        return booklist;
    }

    public void insertRecord(book book,String sql){

    }
    public static void closeStatement(Statement statement){

    }
    public void updateAndDelete(String sql){

    }
}
