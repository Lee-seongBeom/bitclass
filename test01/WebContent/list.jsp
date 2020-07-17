<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<img alt="" src="img/logo.png" align="left">
	<center>
	<table border="1" width="100%" bgcolor="gray">
		<tr>
			<td bgcolor="#cccccc"></td>
			<td width = "200" bgcolor="#cccccc" align="center"><a href="/test01/index.jsp">Home</a></td>
			<td width = "200" bgcolor="#cccccc" align="center"><a href="/test01/list.jsp">List</a></td>
			<td bgcolor="#cccccc"></td>
		</tr>
		
		<tr>
			<td bgcolor="white" colspan="4">
			<center>
			<table  border="1" width="50%">
				<tr>
					<td colspan="3" bgcolor="lightgray">
					<h1>게시판</h1>
					</td>
				</tr>
				
				<tr>
					<td align="center" bgcolor="lightgray">번호</td>
					<td align="center" bgcolor="lightgray">이름</td>
					<td align="center" bgcolor="lightgray" colspan="2">월급</td>
				</tr>
				<%
					String sql="select num,name,sal from ex01";					
					String driver="oracle.jdbc.driver.OracleDriver";
					String url="jdbc:oracle:thin:@localhost:1521:xe";
					String user="scott";
					String password="tiger";
					
					Class.forName(driver);
					Connection conn=null;
					Statement stmt=null;
					ResultSet rs=null;
					try{
						conn= DriverManager.getConnection(url,user,password);
						stmt=conn.createStatement();
						rs=stmt.executeQuery(sql);
						
						while(rs.next()){
							
					
				%>
				<tr>
					<td ><%=rs.getObject("num")%></td>
					<td><%=rs.getObject("name")%></td>
					<td><%=rs.getObject("sal")%></td>
				</tr>
				<%
						}
					}finally{
						if(rs!=null)rs.close();
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					}
				%>
			</table>
			</center>		
			</td>
		</tr>
		
		
	<%@ include file="/template/footer.jspf" %>
		
</body>
</html>