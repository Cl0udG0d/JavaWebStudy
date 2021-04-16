package cn.web.servlet3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "testWebServlet",
        urlPatterns = "/webServlet",
        initParams = {
                @WebInitParam(name="p1",value = "10"),
                @WebInitParam(name="p2",value = "20")
        })
public class test extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("访问成功");
        System.out.println(getInitParameter("p1"));
        System.out.println(getInitParameter("p2"));

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
