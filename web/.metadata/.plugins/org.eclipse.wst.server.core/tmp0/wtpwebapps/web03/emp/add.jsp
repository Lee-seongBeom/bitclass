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
		<td align="center" bgcolor="lightgray" width="120"><a
			href="../index.jsp">[HOME]</a></td>
		<td align="center" bgcolor="lightgray" width="120"><a
			href="../dept/list.jsp">[DEPT]</a></td>
		<td align="center" bgcolor="lightgray" width="120"><a
			href="list.jsp">[E M P]</a></td>
		<td align="center" bgcolor="lightgray" width="120"><a
			href="../login/login.jsp">[LOGIN]</a></td>
		<td bgcolor="lightgray"></td>
		</tr>

		<tr>
			<td colspan="6">
				<!-- content start -->
				<h1>EMP Add Page</h1>
				<form action="insert.jsp">
					<table>
						<tr>
							<td>EMPNO</td>
							<td><input type="text" name="empno"></td>
						</tr>

						<tr>
							<td>ENAME</td>`
							<td><input type="text" name="ename"></td>
						</tr>

						<tr>
							<td>JOB</td>
							<td><input type="text" name="job"></td>
						</tr>

						<tr>
							<td>DNAME</td>
							<td><select name="deptno">
									<%
										String sql = "select deptno,dname from dept order by deptno";
										String driver = "oracle.jdbc.driver.OracleDriver";
										String url = "jdbc:oracle:thin:@localhost:1521:xe";
										String user = "scott";
										String password = "tiger";

										Connection conn = null;
										Statement stmt = null;
										ResultSet rs = null;

										Class.forName(driver);
										try {
											conn = DriverManager.getConnection(url, user, password);
											stmt = conn.createStatement();
											rs = stmt.executeQuery(sql);
											while (rs.next()) {
									%>
									<option value="<%=rs.getInt(1)%>"><%=rs.getString(2)%></option>
									<%
										}
										} finally {
											if (rs != null)
												rs.close();
											if (stmt != null)
												stmt.close();
											if (conn != null)
												conn.close();
										}
									%>
							</select> </td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit"></td>
						</tr>

					</table>

				</form> <!-- content end -->
			</td>
		</tr>




		<tr>
			<td align="center" colspan="6" bgcolor="lightgray">��Ʈķ�� ����� ���ʱ�
				������� 459 (���ʵ�, ��Ϻ���)�� ����ڵ�Ϲ�ȣ : 214-85-24928<br> (��)��Ʈ��ǻ�� ���ʺ���
				��ǥ�̻� : ������ / ���� : 02-3486-9600 / �ѽ� : 02-6007-1245<br> ����Ǹž�
				�Ű��ȣ : �� ����-00098ȣ / ����������ȣ����å���� : ������<br> Copyright (c) ��Ʈķ��
				All rights reserved.
			</td>

		</tr>




	</table>
</body>
</html>