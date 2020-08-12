package bitJeju.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bitJeju.Studentmodel.StuDao;

@WebServlet("/signUp.jb")
public class signUpController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.getRequestDispatcher("signUp.jsp").forward(req, resp);
		
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String name=req.getParameter("name").trim();
		String id=req.getParameter("id").trim();
		String pw=req.getParameter("pw").trim();
		int phoneNumber= Integer.parseInt(req.getParameter("phoneNumber").trim());
		
		try {
			StuDao dao=new StuDao();
			dao.signUp(name, id, pw, phoneNumber);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		resp.sendRedirect("signUpFinish.jsp");
		
	}

}







