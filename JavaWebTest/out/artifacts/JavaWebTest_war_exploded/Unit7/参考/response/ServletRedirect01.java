package cn.servlet.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ServletRedirect01")
public class ServletRedirect01 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

	    //地址栏输入Servlet地址和？参数，读取用户名
	    String username = request.getParameter("username");
	    String message = null;
	    if(username == null){
	      message="Please input your name";
	    }else{
	      message="Hello,"+username;
	    }

	    //在request对象中添加msg属性
	    //四大域对象
	    request.setAttribute("msg", message);
	    out.println("Output from CheckServlet01 before redirecting."); 
	   
	    //重定向到ServletRedirectOut
	    response.sendRedirect("/CourseEX09/output?msg="+message); 
	    //response.sendRedirect("/output?msg="+message"); 
	   //response.sendRedirect("http://localhost:8080/CourseEx/output?msg="+message); 

	    out.println("Output from CheckServlet01 after redirecting."); 
	    //重定向以后的代码会被继续执行
	    System.out.println("after Redirect output");
	  	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
