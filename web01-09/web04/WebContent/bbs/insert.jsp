<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<title>Insert title here</title>
</head>
<body>
	<%
	// Server -> server.xml 설정 
	// 또는
	// 
	// 만일 method 가 post방식일 경우 파라미터 받기전에 엔코딩을 해야 한글 안깨짐.
		
		request.setCharacterEncoding("EUC-KR");
		String sub=request.getParameter("sub");
		String id=request.getParameter("id");
		String cntnt=request.getParameter("cntnt");
		
		if(sub.isEmpty()){
			sub="제목없음";
		}
		
		sub=sub.replace("<", "&lt;");
		sub=sub.replace(">", "&gt;");
		sub=sub.replace("--", "­­");
		sub=sub.replace("'", "＇");
//		sub=sub.replace(" ", "&nbsp;");
		//보안을 위해 replace 함
		


		String sql="insert into bbs01 (num,sub,id,nalja,cntnt,ref,no,lev) values (bbs01_seq.nextval,'"+sub+"','"+id+"',sysdate,'"+cntnt;
		sql+="',bbs01_seq.currval,0,0)";
		System.out.println(sql);
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		Class.forName(driver);
		
		Connection conn=null;
		Statement stmt=null;
		
		try{
			conn=DriverManager.getConnection(url,user,password);
			stmt=conn.createStatement();
			stmt.executeUpdate(sql);
			
	%>
	
	<%
		}finally{
			if(stmt!=null)stmt.close();
			if(conn!=null)conn.close();
		}
		
		response.sendRedirect("list.jsp");
	
	%>
	
	
</body>
</html>















