<%@page import="com.bit.emp.Emp02Insert"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="1024" align="center">
		<tr>
			<td>
				<img src="img/logo.png">
			</td>
		</tr>
		<tr>
			<td bgcolor="gray" align="center">
				<a href="./">[Home]</a>
				<a href="/web06/list.jsp">[E M P]</a>
				<a href="#">[DEPT]</a>
				<a href="#">[Login]</a>
			</td>
		</tr>
		<tr>
			<td>
			<!--content start  -->
			<%
				if("POST".equals(request.getMethod())){
					request.setCharacterEncoding("euc-kr");
					int sabun=Integer.parseInt(request.getParameter("sabun"));
					String name=request.getParameter("name");
					int pay=Integer.parseInt(request.getParameter("pay"));
					
					Emp02Insert emp=new Emp02Insert();
					emp.insert(sabun, name, pay);
					response.sendRedirect("list.jsp");
					return;
				}
			%>
			
				<h1 align="center">�Է�������</h1>
				<form method="post">
					<table border="0" width="800" align="center">
						<tr>
							<td width="400">���</td>
							<td><input type="text" name="sabun"></td>
						</tr>
						<tr>
							<td>�̸�</td>
							<td><input type="text" name="name"></td>
						</tr>
						<tr>
							<td>�ݾ�</td>
							<td><input type="text" name="pay"></td>
						</tr>
						<tr>
							<td colspan="2">
								<input type="submit" value="�� ��">
								<input type="submit" value="�� ��">
							</td>
						</tr>
						<tr>
							<td></td>
							<td></td>
						</tr>
					</table>
				</form>
			<!--content end -->
			</td>
		</tr>
		<tr>
			<td>��Ʈķ�� ����� ���ʱ� ������� 459 (���ʵ�, ��Ϻ���)<br>
				Copyright (c) ��Ʈķ�� All rights reserved.
			</td>
		</tr>
	</table>
</body>
</html>