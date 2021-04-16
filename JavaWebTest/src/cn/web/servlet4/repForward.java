package cn.web.servlet4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/repForward")
public class repForward extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("Content-Type","text/html;charset=UTF-8");
        String username=req.getParameter("username");
        String password=req.getParameter("password");
//        if(username.isEmpty()&&password.isEmpty()){
//            resp.sendRedirect("/Unit/welcome.html");
//        }
        if(username.equals("admin")&&password.equals("123456")){
            req.getRequestDispatcher("/Unit7/welcome.html").forward(req,resp);
        }else{
            req.getRequestDispatcher("/Unit7/fail.html").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
