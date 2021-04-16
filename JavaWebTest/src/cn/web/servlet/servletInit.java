package cn.web.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class servletInit extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("web.xml初始化参数值为:");
        System.out.println("直接通过 getInitParameter");
        System.out.println(getInitParameter("p1"));
        System.out.println(getInitParameter("p2"));
        System.out.println("通过 getServletConfig接口");
        System.out.println(getServletConfig().getInitParameter("p1"));
        System.out.println(getServletConfig().getInitParameter("p2"));
//        System.out.println("通过 getServletContext");
//        System.out.println(getServletContext().getInitParameter("p1"));
//        System.out.println(getServletContext().getInitParameter("p2"));
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
