<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" %>
<%@ page import="java.util.Date,java.util.Scanner" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">구구단 출력</h1>
<%=new Date() %>
<table width="80%" align="center" border="1">
	<tr >
		<%
		for(int i=2;i<10;i++){
			out.print("<td align=center>");
			out.print(i+"단");
			out.print("</td>");
		}
		%>
	</tr>
	
	<%
	for(int i=1;i<10;i++){
		out.print("<tr align=center>");
		for(int j=2;j<10;j++){
			out.print("<td>");
			out.print(j+"x"+i+" = "+j*i);
			out.print("</td>");
		}
		out.print("</tr>");
	}
	%>
	

</body>
</html>
















