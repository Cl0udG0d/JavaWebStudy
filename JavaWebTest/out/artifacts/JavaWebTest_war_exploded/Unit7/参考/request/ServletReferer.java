package cn.servlet.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ServletReferer")
public class ServletReferer extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		// 获取referer头的值
		// 通过referer知道跳转的来源，通过超级链接的形式跳转后获取<a> 
        String referer = request.getHeader("referer");
        System.out.println(referer);
        
        
        // 获取访问地址
		String sitePart = "http://" + request.getServerName();
		System.out.println(sitePart);
		
		
        // 判断referer头是否为空，这个头的首地址是否以sitePart开始的
		if (referer != null && referer.startsWith(sitePart)) {
			// 处理正在下载的请求
			out.println("dealing download ...");
		} else {
			// 非法下载请求跳转到download.html页面
			RequestDispatcher rd = request.getRequestDispatcher("/download.html");
			rd.forward(request, response);
		}
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
