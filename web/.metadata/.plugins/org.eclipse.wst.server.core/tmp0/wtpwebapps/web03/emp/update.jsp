<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*"%>
    
    <%
		//empno=7499&ename=ALLEN&job=SALESMAN&mgr=7698&sal=1600&comm=300
		String empno=request.getParameter("empno");
		String ename=request.getParameter("ename");
		String job=request.getParameter("job");
		String mgr=request.getParameter("mgr");
		String sal=request.getParameter("sal");
		String comm=request.getParameter("comm");
		
		
		
		String sql="update emp set ename='"+ename+"',job='"+job+"',mgr='"+mgr;
		sql+="',sal="+sal+",comm="+comm+" where empno="+empno;
		System.out.println(sql);
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		Class.forName(driver);
		Connection conn=null;
		Statement stmt=null;

		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} finally {
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		}
	%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta http-equiv="refresh" content="1; url=detail.jsp?empno=<%=empno%>">
<title>Insert title here</title>
</head>
<body>
	<h1>수정 완료</h1>

</body>
</html>




















