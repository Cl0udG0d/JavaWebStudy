package cn.web.vo;

import cn.web.dao.DBUtils;
import cn.web.dao.MysqlDBConn;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;

public class book {
    public static void main(String[] arvgs) throws SQLException, IOException, ClassNotFoundException {
        MysqlDBConn temp=new MysqlDBConn();
        Connection conn=temp.initConn();
        DBUtils tempDBUtil=new DBUtils();
        HashMap<String,String> booklist=tempDBUtil.getAllBook(conn);
        for (String i : booklist.keySet()) {
            System.out.println("图书编号" + i + "的名字:" + booklist.get(i));
        }
    }
}
