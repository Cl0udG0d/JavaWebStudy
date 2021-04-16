package cn.servlet.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ServletIncluding")
public class ServletIncluding extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = request.getRequestDispatcher("/ServletIncluded?p1=abc");
		//源组件的响应内容
		out.println("before including" );
		out.println("</br>" );
		//请求包含
		rd.include(request, response);
		out.println("</br>" );
		out.println("after including" );
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
