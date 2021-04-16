package cn.web.servlet4;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/includeTest")
public class includeTest extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("utf-8");
//        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.println("重庆理工大学" );
        out.println("<br>");
        out.println("当前URL:" + req.getRequestURI() );
        out.println("<br>");
        out.println("parameter p1:" + req.getParameter("p1"));
        out.println("<br>");
        RequestDispatcher rd = req.getRequestDispatcher("/repTest?username=admin&password=123456");
        //源组件的响应内容
        out.println("before including" );
        out.println("</br>" );
        //请求包含
        rd.include(req, resp);
        out.println("</br>" );
        out.println("after including" );
    }
}
