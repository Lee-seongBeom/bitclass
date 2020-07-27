package com.bit.step03;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.jws.soap.InitParam;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




//@WebServlet("/ex11","/ex11.bit");

//@WebServlet(value={"/ex11","/ex11.bit"})

//@WebServlet(urlPatterns={"/ex11","/ex11.bit"})

@WebServlet(value={"/ex11","/ex11.bit"},initParams={
		@WebInitParam(name="msg",value="abcd"),
		@WebInitParam(name="msg2",value="abcd2"),
		@WebInitParam(name="msg3",value="abcd3")
		})

public class Ex11 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Enumeration<String> enu=getInitParameterNames();
		PrintWriter out=resp.getWriter();
		out.println("<h1>anotation mapping</h1>");
		
		while(enu.hasMoreElements()){
			String value= getInitParameter(enu.nextElement());
			out.println(value);
		}
	}
}


