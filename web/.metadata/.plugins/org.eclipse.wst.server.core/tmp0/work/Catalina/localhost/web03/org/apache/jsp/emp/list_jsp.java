/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.104
 * Generated at: 2020-07-01 07:46:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.emp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- \r\n");
      out.write("\t<h1 align=center>사원관리 프로그램</h1>\r\n");
      out.write("\t -->\r\n");
      out.write("\t<table width=\"100%\" border=\"1\" align=\"center\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"6\"><img src=\"../img/logo.png\"></td>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<td bgcolor=\"lightgray\"></td>\r\n");
      out.write("\t\t\t<td align=\"center\" bgcolor=\"lightgray\" width=\"120\"><a href=\"../index.jsp\">[HOME]</a></td>\r\n");
      out.write("\t\t\t<td align=\"center\" bgcolor=\"lightgray\" width=\"120\"><a href=\"../dept/list.jsp\">[DEPT]</a></td>\r\n");
      out.write("\t\t\t<td align=\"center\" bgcolor=\"lightgray\" width=\"120\"><a href=\"list.jsp\">[E M P]</a></td>\r\n");
      out.write("\t\t\t<td align=\"center\" bgcolor=\"lightgray\" width=\"120\"><a href=\"../login/login.jsp\">[LOGIN]</a></td>\r\n");
      out.write("\t\t\t<td bgcolor=\"lightgray\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"6\" >\r\n");
      out.write("\t\t\t<!-- content start -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<center>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<h1>EMP LIST PAGE</h1>\r\n");
      out.write("\t\t\t<table border=\"1\" width=\"800\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th width=\"50\" bgcolor=\"#aaaaaa\">empno</th>\r\n");
      out.write("\t\t\t\t\t<th bgcolor=\"#aaaaaa\">ename</th>\r\n");
      out.write("\t\t\t\t\t<th bgcolor=\"#aaaaaa\">dname</th>\r\n");
      out.write("\t\t\t\t\t<th bgcolor=\"#aaaaaa\">loc</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t");

			
			String sql="select empno,ename,dname,loc from emp inner join dept using (deptno)";
			String driver="oracle.jdbc.driver.OracleDriver";
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="tiger";
			
			Connection conn=null;
			Statement stmt =null;
			ResultSet rs= null;
			try{
				Class.forName(driver);
				conn= DriverManager.getConnection(url,user,password);
				stmt=conn.createStatement();
				rs= stmt.executeQuery(sql);
				
				int cnt=0;
				while(rs.next()){
					String bg="";
					if(cnt++%2==0){
						bg="bgcolor=\"#cccccc\"";
						}
			
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td ");
      out.print(bg );
      out.write("><a href=\"detail.jsp?empno=");
      out.print(rs.getInt(1) );
      out.write('"');
      out.write('>');
      out.print(rs.getInt(1) );
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t<td ");
      out.print(bg );
      out.write('>');
      out.print(rs.getString(2) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td ");
      out.print(bg );
      out.write('>');
      out.print(rs.getString(3) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td ");
      out.print(bg );
      out.write('>');
      out.print(rs.getString(4) );
      out.write("</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				}
			}finally{
					if(rs!=null)rs.close();
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
			}
			
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<a href=\"add.jsp\">[입 력]</a>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</center>\r\n");
      out.write("\t\t\t<!-- content end -->\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\" colspan=\"6\" bgcolor=\"lightgray\">비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)｜ 사업자등록번호 : 214-85-24928<br>\r\n");
      out.write("(주)비트컴퓨터 서초본원 대표이사 : 조현정 / 문의 : 02-3486-9600 / 팩스 : 02-6007-1245<br>\r\n");
      out.write("통신판매업 신고번호 : 제 서초-00098호 / 개인정보보호관리책임자 : 최종진<br>\r\n");
      out.write("Copyright (c) 비트캠프 All rights reserved.</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
