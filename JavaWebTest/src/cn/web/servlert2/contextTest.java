package cn.web.servlert2;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class contextTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("请求");
        ServletContext application= this.getServletContext();
        Enumeration ctx=application.getInitParameterNames();
        while(ctx.hasMoreElements()){
            String name= (String) ctx.nextElement();
            String value=(String) application.getInitParameter(name);
            System.out.println("name:"+name+" value:"+value);
        }

        System.out.println("多个servlet共享数据为:");
        ServletContext temp=this.getServletContext();
        System.out.println("value: "+temp.getAttribute("test"));
//        System.out.println(application.getInitParameter("global"));

        System.out.println("web应用的URL:"+temp.getContextPath());
        System.out.println("WEB-INF的物理路径为:"+temp.getRealPath("/"));
        System.out.println("Servlet AIP主版本是:"+temp.getMajorVersion());
        System.out.println("Servlet容器的名称和版本是:"+temp.getServerInfo());


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
