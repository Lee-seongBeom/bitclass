<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>request 내장객체</h1>
	<%
	//System.out.println(request);
	out.println(request.getRequestURL());
	out.println("<br>");
	
	out.print(request.getServerName());
	out.println("<br>");
	
	out.print("serverPort: "+request.getServerPort());
	out.println("<br>");
	
	out.print(request.getProtocol());
	out.println("<br>");
	
	out.print(request.getRemotePort());// 요청하고있는 remote 의 포트
	out.println("<br>");
	
	out.println(request.getRemoteAddr());//IP
	out.println("<br>");
	
	out.println(request.getRequestURI());
	out.println("<br>");
	
	out.print(request.getContextPath());
	out.println("<br>");
	out.print(request.getMethod());	
	%>
	
</body>
</html>










