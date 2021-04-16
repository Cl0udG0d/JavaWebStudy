package cn.servlet.request;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ServletReqInfo")
public class ServletReqInfo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
        // 获取请求行的相关信息
		out.println("getMethod : " + request.getMethod() + "<br>");
		out.println("getRequestURI : " + request.getRequestURI() + "<br>");
		out.println("getQueryString : " + request.getQueryString() + "<br>");
		out.println("getProtocol : " + request.getProtocol() + "<br>");
		out.println("getContextPath : " + request.getContextPath() + "<br>");
		out.println("getPathInfo : " + request.getPathInfo() + "<br>");
		out.println("getPathTranslated : " + request.getPathTranslated()+ "<br>");
		out.println("getServletPath : " + request.getServletPath() + "<br>");
		
		// 获取请求头的相关信息
		Enumeration headerNames = request.getHeaderNames();// 获取请求消息中所有头字段
        // 使用循环遍历所有请求头，并通过getHeader()方法获取一个指定名称的头字段
		while (headerNames.hasMoreElements()) { 
			String headerName = (String) headerNames.nextElement();
			out.print(headerName + " : " + request.getHeader(headerName)+ "<br>");
		}
		
		// 获取请求体的相关信息
		InputStream in = request.getInputStream();// 获取输入流对象
		byte[] buffer = new byte[1024]; // 定义1024个字节的数组
		StringBuilder sb = new StringBuilder(); // 创建StringBuilder对象
		int len;
		// 循环读取数组中的数据
		while ((len = in.read(buffer)) != -1) {
			sb.append(new String(buffer, 0, len));
		}
		System.out.println(sb);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
