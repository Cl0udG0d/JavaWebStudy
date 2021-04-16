package cn.web.courseEX09_2;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Pattern;

@WebFilter(filterName = "ipfilter")
public class ipFilter implements Filter {

    String[] BlackListPattern={"127.0.0.1"};

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String addr = servletRequest.getRemoteAddr();
        HttpServletResponse httpServletResponse=(HttpServletResponse)servletResponse;
        System.out.println(addr);
        if(checkAddrAllow(addr)){
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            httpServletResponse.sendRedirect("/notAllow.jsp");
        }
    }

    @Override
    public void destroy() {

    }

    public boolean checkAddrAllow(String addr){
        for(String tempPattern:BlackListPattern){
//            Pattern p = Pattern.compile(tempPattern);
            if(Pattern.matches(tempPattern, addr)){
                return false;
            }
        }
        return true;
    }
}
