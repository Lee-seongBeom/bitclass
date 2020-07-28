<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test1</h1>
	<%request.setAttribute("msg", "abcd"); %>
	<jsp:forward page="test2.jsp"></jsp:forward>
	<p>test2의 내용</p>
</body>
</html>