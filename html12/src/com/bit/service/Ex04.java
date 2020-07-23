package com.bit.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex04 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String id=req.getParameter("id");
		
		System.out.println(id);
		req.setCharacterEncoding("utf-8"); // 필수
		resp.setContentType("application/xml;charset=utf-8"); // 필수
		resp.setCharacterEncoding("utf-8");//윗줄에서 해줬기때문에 굳이 하지 않아도 됨,하면 best
		PrintWriter out=resp.getWriter();
		
		out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		out.println("<students>");
		for(int i=0;i<5;i++){
			out.println("<student>");
			out.println("<num>"+(i+1)+"</num>");
			out.println("<name>user"+(i+1)+"</name>");
			out.println("<kor>"+(100-(i+1)*10)+"</kor>");
			out.println("<eng>"+(100-(i+1)*11)+"</eng>");
			out.println("<math>"+(100-(i+1)*12)+"</math>");
			out.println("</student>");
		}
		out.println("</students>");
		out.close();
	}

}














