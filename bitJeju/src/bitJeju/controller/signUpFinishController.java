package bitJeju.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.MidiDevice.Info;

import bitJeju.Studentmodel.StuDao;
import bitJeju.Studentmodel.StuDto;

@WebServlet("/signUpFinish.jb")
public class signUpFinishController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.getRequestDispatcher("signUpFinish.jsp").forward(req, resp);
	};

	/*
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
		int hakbun=Integer.parseInt(req.getParameter("hakbun").trim());
		String name=req.getParameter("name").trim();
		String id=req.getParameter("id").trim();
		String pw=req.getParameter("pw").trim();
		int phoneNumber=Integer.parseInt(req.getParameter("phoneNumber").trim());
		System.out.println("post");
		
		try {
			System.out.println("finishpost : "+hakbun);
			StuDao dao=new StuDao();
			ArrayList<StuDto> bean= dao.signUpFinish(hakbun);
			System.out.println("beantostring: "+bean.toString());
			req.setAttribute("bean", bean);
			req.getRequestDispatcher("signUpFinish.jsp").forward(req, resp);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}*/
	
}











