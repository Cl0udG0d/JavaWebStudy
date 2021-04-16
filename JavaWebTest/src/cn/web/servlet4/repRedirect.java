package cn.web.servlet4;

import javafx.print.Printer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/repTest")
public class repRedirect extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String username=req.getParameter("username");
        String password=req.getParameter("password");

//        PrintWriter out=resp.getWriter();
//        out.println("<br>");
//        out.println(username);
//        out.println("<br>");
//        out.println(password);
//        if(username.isEmpty()&&password.isEmpty()){
//            resp.sendRedirect("/Unit/welcome.html");
//        }
        if(username.equals("admin")&&password.equals("123456")){
            resp.sendRedirect("/Unit7/welcome.html");
        }else{
            resp.sendRedirect("/Unit7/fail.html");
        }
    }
}
