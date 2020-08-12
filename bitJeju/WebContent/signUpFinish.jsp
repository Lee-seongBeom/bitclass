<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="refresh" content="2; url=http://192.168.0.188:8080/bitJeju/login.jb">
<title>비트캠프 제주점 회원가입</title>
<%@ include file="../template/head.jspf" %>
<%@ include file="../template/header.jspf" %>

<script type="text/javascript">
	
	
	$(document).ready(function(){
		
	});

</script>
<style type="text/css">
	h1,h2{
		margin-top:5%;
		text-align: center;
	}
	
	#content{
		text-align:center;
		margin-top: 50px;
	}

	#content input{
		width:150px;
	}
</style>
</head>
<body>
		
	<h1>회원가입이 완료되었습니다!</h1>
	
	<div id="content">
		<!-- content start -->
		<form action="<%=root%>/index.jsp">
		
			<button type="submit">메인 화면으로</button>
			
		</form>
		
		<!-- content end -->
	</div>

<%@ include file="/template/footer.jspf" %>
</body>
</html>