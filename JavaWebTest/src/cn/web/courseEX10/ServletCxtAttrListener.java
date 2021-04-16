package cn.web.courseEX10;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletCxtAttrListener implements ServletContextListener,ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        String name=servletContextAttributeEvent.getName();
        System.out.println("属性名为:"+name);
        String val= String.format("属性值为%s", servletContextAttributeEvent.getValue());
        System.out.println("属性值为:"+val);
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {

    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        String valChange=String.format("%s属性值改为%s",servletContextAttributeEvent.getName(),servletContextAttributeEvent.getValue());
        System.out.println(valChange);
    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext对象已创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext对象已销毁");
    }
}
