package cn.servlet.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ServletRedirect")
public class ServletRedirect extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		
		// 用HttpServletRequest对象的getParameter()方法获取用户名和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		// 假设用户名和密码分别为：cqut和123
		if (("cqut").equals(username) &&("123").equals(password)) {
			// 如果用户名和密码正确，重定向到 welcome.html
            response.sendRedirect("/CourseEX09/welcome.html");
		} else {
			// 如果用户名和密码错误，重定向到fail.html
			response.sendRedirect("/CourseEX09/fail.html");
		}
		
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
