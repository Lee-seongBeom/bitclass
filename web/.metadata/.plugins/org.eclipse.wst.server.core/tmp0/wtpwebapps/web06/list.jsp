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
				<img alt="" src="img/logo.png">
			</td>
		</tr>
		<tr>
			<td bgcolor="gray" align="center">
				<a href="./index.jsp">[Home]</a>
				<a href="./list.jsp">[E M P]</a>
				<a href="#">[DEPT]</a>
				<a href="#">[Login]</a>
			</td>
		</tr>
		<tr>
			<td>
			<!--content start  -->
			<h1 align="center">���</h1>
			<table border="1" align="center">
				<tr>
					<th>���</th>
					<th>�̸�</th>
					<th>��¥</th>
					<th>�ݾ�</th>
				</tr>
				<%
				com.bit.emp.Emp02list emp= new com.bit.emp.Emp02list();
				java.util.ArrayList<com.bit.emp.dto.Emp02Bean> list = emp.list();
				for(int i=0;i<list.size();i++){
					com.bit.emp.dto.Emp02Bean bean=list.get(i);
				%>
				<tr>
					<td><a href="detail.jsp?idx=<%=bean.getSabun()%>"><%=bean.getSabun() %></a></td>
					<td><%=bean.getName() %></td>
					<td><%=bean.getNalja() %></td>
					<td><%=bean.getPay() %></td>
				</tr>
				<% 
				}
				%>
			</table>
			<a href="add.jsp">[�� ��]</a>
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