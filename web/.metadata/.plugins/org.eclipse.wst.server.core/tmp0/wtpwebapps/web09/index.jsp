<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table width="1024" align="center">
		<tr>
			<td><img src="img/logo.png"></td>
		</tr>
		<tr>
			<td align="center" bgcolor="#cccccc">
				<a href="?title=main">[Home]</a>
				<a href="?title=intro">[Intro]</a>
				<a href="?title=emp/list">[E M P]</a>
				<a href="">[Login]</a>
			</td>
		</tr>
		<tr align="center" bgcolor="#cccccc">
		<%
		String title=request.getParameter("title");
		if(title==null){
			title="main";
		}
		title+=".jsp";
		%>
			<td>
				<jsp:include page="<%=title%>"></jsp:include>
			</td>
		</tr>
		<tr align="center" bgcolor="#cccccc">
			<td>��Ʈķ�� ����� ���ʱ� ������� 459 (���ʵ�, ��Ϻ���)<br>
				Copyright (c) ��Ʈķ�� All rights reserved.
			</td>
		</tr>
	
	</table>
</body>	
</html>