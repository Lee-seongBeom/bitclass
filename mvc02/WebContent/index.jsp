<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/frame.css">
<style type="text/css">
	
</style>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("<img/>").attr("src","img/img02.jpg").insertAfter('#content>img')
		.after($("<img/>").attr("src","img/img03.jpg"));
	});
</script>

</head>
<body>
	<div>
		<div id="header">
			<h1>비트센터</h1>
		</div>
		<div id="menu">
			<ul>
				<li><a href="index.bit">Home</a></li>
				<li><a href="list.bit">E M P</a></li>
				<li><a href="#">DEPT</a></li>
				<li><a href="login.bit">Login</a></li>
			</ul>
		</div>
		<div id="content">
			<img alt="" src="img/img01.jpg">
		</div>
		<div id="footer">
			<address>비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)<br/></address>
						Copyright &copy 비트캠프 All rights reserved.
			
		</div>
	</div>
</body>
</html>










