package cn.web.courseEX10;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.concurrent.atomic.AtomicInteger;

@WebListener
public class OnlineUserListener implements HttpSessionListener {

    ServletContext sc;
    AtomicInteger atomicInteger;

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        sc=httpSessionEvent.getSession().getServletContext();
        if(sc.getAttribute("user")==null){
            setAttribute(httpSessionEvent);
        }
        atomicInteger.incrementAndGet();
        sc.setAttribute("user",atomicInteger);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        atomicInteger.decrementAndGet();
        sc.setAttribute("user",atomicInteger);
    }

    public void setAttribute(HttpSessionEvent httpSessionEvent){
        atomicInteger= new AtomicInteger(0);
        System.out.println(atomicInteger.get());
        sc.setAttribute("user",atomicInteger);
    }
}
