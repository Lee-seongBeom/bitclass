package com.bit.step01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.xml.ws.RespectBinding;

public class Ex01 implements Servlet{

	ServletConfig config;
	
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		config=arg0;
		System.out.println("init,,"+this.hashCode());
	}
	
	
	@Override
	public void destroy() {
		
		System.out.println("destroy,,"+this.hashCode());
		
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("service~~"+this.hashCode());
		
		PrintWriter out=resp.getWriter();
		out.println("<h1>hello</h1>");
	}
	

	
	
	@Override
	public ServletConfig getServletConfig() {
		
		System.out.println("getServletConfig,,,");
		return this.config;
	}

	@Override
	public String getServletInfo() {
		
		System.out.println("Info...");
		return "이서블릿은 누가 언제만들었고,, 정보전달";
	}


}
