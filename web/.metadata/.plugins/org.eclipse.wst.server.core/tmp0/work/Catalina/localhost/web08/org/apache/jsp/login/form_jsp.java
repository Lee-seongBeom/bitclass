/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.104
 * Generated at: 2020-07-07 08:41:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bit.dept.DeptDto;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/login/../template/footer.jspf", Long.valueOf(1594099858725L));
    _jspx_dependants.put("/login/../template/header.jspf", Long.valueOf(1594110655784L));
    _jspx_dependants.put("/login/../template/menu.jspf", Long.valueOf(1594111260007L));
  }

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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		String path="../";
	
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write('\r');
      out.write('\n');
      com.bit.dept.DeptDto login = null;
      synchronized (session) {
        login = (com.bit.dept.DeptDto) _jspx_page_context.getAttribute("login", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (login == null){
          login = new com.bit.dept.DeptDto();
          _jspx_page_context.setAttribute("login", login, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table width=\"1024\" align=\"center\">\r\n");
      out.write("      <tr>\r\n");
      out.write("         <td>\r\n");
      out.write("            <img alt=\"\" src=\"");
      out.print(path );
      out.write("img/logo.png\">\r\n");
      out.write("            <p>");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((com.bit.dept.DeptDto)_jspx_page_context.findAttribute("login")).getName())));
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("         </td>\r\n");
      out.write("      </tr>");
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <tr>\r\n");
      out.write("         <td align=\"center\" bgcolor=\"#cccccc\">\r\n");
      out.write("            <a href=\"");
      out.print(path );
      out.write("index.jsp\">[HOME]</a>\r\n");
      out.write("            <a href=\"");
      out.print(path );
      out.write("emp/list.jsp\">[E M P]</a>\r\n");
      out.write("            <a href=\"");
      out.print(path );
      out.write("dept/list.jsp\">[DEPT]</a>\r\n");
      out.write("            ");

            DeptDto login2=(DeptDto)session.getAttribute("login");
            if(login2.isResult()){
            
            
      out.write("\r\n");
      out.write("            <a href=\"");
      out.print(path );
      out.write("login/form.jsp\">[LOGOUT]</a>\r\n");
      out.write("            ");

            }else{
            
            
      out.write("\r\n");
      out.write("            <a href=\"");
      out.print(path );
      out.write("login/form.jsp\">[LOGIN]</a>\r\n");
      out.write("            ");

            }
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("         </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("         <td>\r\n");
      out.write("            <!-- content start -->");
      out.write("\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<h1>로그인 페이지</h1>\r\n");
      out.write("\t\t<form action=\"result.jsp\">\r\n");
      out.write("\t\t\t<table width=\"500\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"200\" bgcolor=\"#cccccc\" align=\"center\">id</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"id\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"200\" bgcolor=\"#cccccc\" align=\"center\">pw</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" name=\"pw\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"200\" bgcolor=\"#cccccc\" align=\"center\" colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"로그인\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"reset\" value=\"취 소\">\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</center>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("   <!-- content end -->\r\n");
      out.write("         </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("         <td align=\"center\" bgcolor=\"#cccccc\">\r\n");
      out.write("            비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)<br>\r\n");
      out.write("            (주)비트컴퓨터 서초본원 대표이사 : 조현정<br>\r\n");
      out.write("            Copyright (c) 비트캠프 All rights reserved.<br>\r\n");
      out.write("         </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("   </table>");
      out.write("\r\n");
      out.write("\t\r\n");
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
