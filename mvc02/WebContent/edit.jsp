<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/frame.css">
<style type="text/css">
	#content>form{
		width: 500px;
		margin:50px auto;
	}
	#content>form>div:last-child>button{
		display:inline-block;
		width:75px;
		height: 30px;
		background-image:linear-gradient(darkgray,gray,darkgray);
		border-radius:25px; 
		margin: 0px auto 25px auto;
		text-decoration: none;
		text-align: center;
		line-height: 30px;
		color:white;
	}
	
</style>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$('table~a').last().click(function(){
			history.back();
			return false;
		});
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
		<jsp:useBean id="dto" class="com.bit.model.Emp03Dto" scope="request"></jsp:useBean>
			<h2>수정</h2>
			<form method="post">
				<div>
					<lable for="sabun">사번</lable>
					<input type="text" name="sabun" id="sabun" value="<%=dto.getSabun() %>" readonly="readonly">
				</div>
				<div>
					<lable for="name">이름</lable>
					<input type="text" name="name" id="name" value="<%=dto.getName()%>">
				</div>
				<div>
					<lable for="sub">제목</lable>
					<input type="text" name="sub" id="sub" value="<%=dto.getSub()%>">
				</div>
				<div>
					<lable for="pay">금액</lable>
					<input type="text" name="pay" id="pay" value=""<%=dto.getPay()%>>
				</div>
				<div>
				<button type="submit">수정</button>
				<button type="reset">취소</button>
				<button type="button">뒤로</button>
			</div>
			</form>
			
		</div>
		<div id="footer">
			<address>비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)<br/></address>
						Copyright &copy 비트캠프 All rights reserved.
			
		</div>
	</div>
</body>
</html>










