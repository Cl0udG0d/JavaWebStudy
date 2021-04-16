package cn.servlet.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/output")
public class ServletRedirectout extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		//读取ServletRedirect01或ServletForward存放在请求范围内的消息属性
		//两次请求，不能共享同一个request
	    String message = (String)request.getAttribute("msg");
	    System.out.println("请求范围内的消息:"+message);
	    
	    //获取CheckServletOut请求参数
	    message = request.getParameter("msg");
	    System.out.println("请求参数中的消息:"+message);
	    
	    PrintWriter out = response.getWriter();
	   //目标组件中的输出
	    out.println("The output:"+message); 
	    out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
