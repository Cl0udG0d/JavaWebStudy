package cn.web.courseEX10;

import javafx.print.Printer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CountUser")
public class CountUser extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        ServletContext servletContext=this.getServletContext();
        Integer counter= (Integer) servletContext.getAttribute("counter");
        if(counter==null){
            servletContext.setAttribute("counter",1);
            counter=1;
        }
        PrintWriter out=resp.getWriter();
        out.print(String.format("这是你第%d次登陆", counter));
        servletContext.setAttribute("counter",counter+1);
    }
}
