package cn.web.servlet4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/refererTest")
public class refererTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out=resp.getWriter();

        String referer=req.getHeader("referer");
        out.println("当前referer:"+referer);
        out.println("<br>");
        String checkurl="http://"+req.getServerName();
        out.println("<br>");

        out.println("对比服务器URL:"+checkurl);
        out.println("<br>");


        if (referer != null && referer.startsWith(checkurl)) {
            out.println("<br>");

            out.println("referer合法");
        } else {
            // 非法下载请求跳转到download.html页面
            out.println("<br>");

            out.println("referer不合法");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
