<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	<h1 align=center>������� ���α׷�</h1>
	 -->
	<table width="100%" border="1" align="center">
		<tr>
			<td colspan="6"><img src="../img/logo.png"></td>
		
		</tr>
		
			<td bgcolor="lightgray"></td>
			<td align="center" bgcolor="lightgray" width="120"><a href="../index.jsp">[HOME]</a></td>
			<td align="center" bgcolor="lightgray" width="120"><a href="../dept/list.jsp">[DEPT]</a></td>
			<td align="center" bgcolor="lightgray" width="120"><a href="list.jsp">[E M P]</a></td>
			<td align="center" bgcolor="lightgray" width="120"><a href="../login/login.jsp">[LOGIN]</a></td>
			<td bgcolor="lightgray"></td>
		</tr>
			
		<tr>
			<td colspan="6" >
			<!-- content start -->
			
			<center>
			
			<h1>EMP LIST PAGE</h1>
			<table border="1" width="800" cellspacing="0">
				<tr>
					<th width="50" bgcolor="#aaaaaa">empno</th>
					<th bgcolor="#aaaaaa">ename</th>
					<th bgcolor="#aaaaaa">dname</th>
					<th bgcolor="#aaaaaa">loc</th>
				</tr>
			<%
			
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
			%>
			<tr>
				<td <%=bg %>><a href="detail.jsp?empno=<%=rs.getInt(1) %>"><%=rs.getInt(1) %></a></td>
				<td <%=bg %>><%=rs.getString(2) %></td>
				<td <%=bg %>><%=rs.getString(3) %></td>
				<td <%=bg %>><%=rs.getString(4) %></td>
			
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
			<a href="add.jsp">[�� ��]</a>
			
			</center>
			<!-- content end -->
			</td>
		</tr>
			
		
		
		
		<tr>
			<td align="center" colspan="6" bgcolor="lightgray">��Ʈķ�� ����� ���ʱ� ������� 459 (���ʵ�, ��Ϻ���)�� ����ڵ�Ϲ�ȣ : 214-85-24928<br>
(��)��Ʈ��ǻ�� ���ʺ��� ��ǥ�̻� : ������ / ���� : 02-3486-9600 / �ѽ� : 02-6007-1245<br>
����Ǹž� �Ű��ȣ : �� ����-00098ȣ / ����������ȣ����å���� : ������<br>
Copyright (c) ��Ʈķ�� All rights reserved.</td>
			
		</tr>
		
		
		
		
	</table>
</body>
</html>