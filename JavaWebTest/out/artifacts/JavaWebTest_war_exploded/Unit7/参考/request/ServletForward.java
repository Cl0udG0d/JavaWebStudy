package cn.servlet.request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Forward")
public class ServletForward extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		//读取用户名
	    String username = request.getParameter("username");
	    String message = null;
	    if(username == null){
	      message = "Please input your name";
	    }else{
	      message = "Hello,"+username;
	    }
	    
	    //在request对象中添加msg属性
	    request.setAttribute("msg", message);
	    
	 
	    //把请求转发给ServletOutput 
	    //通过ServletContext对象获取RequestDispatcher
	    ServletContext context = this.getServletContext();
	    RequestDispatcher dispatcher = context.getRequestDispatcher("/output?msg="+message);  //ok
	    //RequestDispatcher dispatcher = context.getRequestDispatcher("output"); //wrong
	    //RequestDispatcher dispatcher = request.getRequestDispatcher("output"); //ok
	 
	    PrintWriter out = response.getWriter();
	    //源组件中的输出
	    out.println("Output from CheckServlet before forwarding request."); 
	    
	    //out.close(); //如果此处关闭输出流，会如何？
	    dispatcher.forward(request, response);
	   //源组件中的输出
	    out.println("Output from CheckServlet after forwarding request."); 
	    System.out.println("是否执行？");
	    
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
