<%@page import="com.bit.emp.Emp02Delete"%>
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
			<!--POST -->
			<%
				if("POST".equals(request.getMethod())){
					int sabun = Integer.parseInt(request.getParameter("sabun"));
					Emp02Delete emp = new Emp02Delete();
					emp.delete(sabun);
					response.sendRedirect("list.jsp");
					return;
				}
			%>
			<!--GET  -->
			<table align="center" width="400">
				<tr>
					<td align="center"><%=request.getParameter("idx")%>�� ���� ���� �Ͻðڽ��ϴ�?</td>
				</tr>
				<tr>
					<td align="center">
						<form method="post">
							<input type="hidden" name="sabun" value="<%=request.getParameter("idx")%>">
							<input type="submit" value="�� ��">
						</form>
					</td>
				</tr>
			</table>
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