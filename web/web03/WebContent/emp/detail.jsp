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
			
			<h1>EMP Detail PAGE</h1>
			<table border="1" width="800"  cellspacing="1">
			<%
			
			String empno= request.getParameter("empno");
			String sql="select empno,ename,job,mgr,hiredate,sal,comm,";
			sql+="(select dname from dept where dept.deptno=emp.deptno) from emp where empno="+empno;
			
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
				
				if(rs.next()){
			%>
			<tr>
				<td bgcolor="#aaaaaa" align="center"><font color="white">empno</td>
				<td><%=rs.getInt(1) %></td>
			</tr>
			
			<tr>
				<td bgcolor="#aaaaaa" align="center">ename</td>
				<td><%=rs.getString(2) %></td>
			</tr>
			
			<tr>
				<td bgcolor="#aaaaaa" align="center">job</td>
				<td><%=rs.getString(3)%></td>
			</tr>
			
			<tr>
				<td bgcolor="#aaaaaa" align="center">mgr</td>
				<td><%=rs.getInt(4) %></td>
			</tr>
			
			<tr>
				<td bgcolor="#aaaaaa" align="center">hiredate</td>
				<td><%=rs.getDate(5) %></td>
			</tr>
			
			<tr>
				<td bgcolor="#aaaaaa" align="center">sal</td>
				<td><%=rs.getInt(6) %></td>
			</tr>
			
			<tr>
				<td bgcolor="#aaaaaa" align="center">comm</td>
				<td><%=rs.getInt(7) %></td>
			</tr>
			
			<tr>
				<td bgcolor="#aaaaaa" align="center">dname</td>
				<td><%=rs.getString(8) %></td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
				<a href="edit.jsp?empno=<%=rs.getInt(1)%>">[�� ��]</a>
				<a href="delele.jsp?empno=<%=rs.getInt(1)%>">[�� ��]</a>
				</td>
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