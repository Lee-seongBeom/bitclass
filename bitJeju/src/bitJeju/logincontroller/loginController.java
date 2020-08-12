package bitJeju.logincontroller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bitJeju.Studentmodel.StuDao;
import bitJeju.Studentmodel.StuDto;

@WebServlet("/login.jb")
public class loginController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
//		hakbun,id,name,phoneNumber,lev
		String id=req.getParameter("id").trim();
		String pw=req.getParameter("pw").trim();
		System.out.println(id);
			try {
				StuDao dao;
				dao = new StuDao();
				if(id.equals("admin")){
					HttpSession session=req.getSession();
					session.setAttribute("level", 10);
					StuDto bean=dao.login(id, pw);
					session.setAttribute("bean",bean);
					req.setAttribute("bean", bean);
					req.getRequestDispatcher("loginResult.jsp").forward(req, resp);
					
				}else{
					HttpSession session=req.getSession();
					session.setAttribute("level", 1);
					StuDto bean=dao.login(id, pw);
					session.setAttribute("bean",bean);
					req.setAttribute("bean", bean);
					req.getRequestDispatcher("loginResult.jsp").forward(req, resp);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}
}





