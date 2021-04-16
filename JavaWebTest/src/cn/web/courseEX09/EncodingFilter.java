package cn.web.courseEX09;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "EncodingFilter",urlPatterns = "/ServletCharacter",
            initParams = {@WebInitParam(name="encoding",value="UTF-8"),
                    @WebInitParam(name="textType",value = "text/html;charset=utf-8")
            })
public class EncodingFilter implements Filter {
    private FilterConfig fConfig=null;
    String encodeValue=null;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.fConfig=filterConfig;
        encodeValue = fConfig.getInitParameter("encoding");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        servletRequest.setCharacterEncoding("UTF-8");
//        servletResponse.setContentType("text/html; charset=GBK");
//        servletResponse.setContentType("text/html;charset=utf-8");
        PrintWriter out = servletResponse.getWriter();
        out.println("<br>init encode value is "+encodeValue);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
