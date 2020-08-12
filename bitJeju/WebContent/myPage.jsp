<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>마이페이지</title>
<%@ include file="template/head.jspf" %>
<script type="text/javascript">
	
	$(document).ready(function(){
		
		$('#box>table>tbody tr th a').eq(0).mouseover(function(){
			$(this).css({'background-color':'gray','color':'white'});
		});
		$('#box>table>tbody tr th a').eq(0).mouseleave(function(){
			$(this).css({'background-color':'white','color':'black'});
		});
		
		
		$('#box>table>tbody tr th a').eq(1).mouseover(function(){
			$(this).css({'background-color':'gray','color':'white'});
		});
		$('#box>table>tbody tr th a').eq(1).mouseleave(function(){
			$(this).css({'background-color':'white','color':'black'});
		});
		
		
		$('#box>table>tbody tr th a').eq(2).mouseover(function(){
			$(this).css({'background-color':'gray','color':'white'});
		});
		$('#box>table>tbody tr th a').eq(2).mouseleave(function(){
			$(this).css({'background-color':'white','color':'black'});
		});
		
		
		$('#box>table>tbody tr th a').eq(3).mouseover(function(){
			$(this).css({'background-color':'gray','color':'white'});
		});
		$('#box>table>tbody tr th a').eq(3).mouseleave(function(){
			$(this).css({'background-color':'white','color':'black'});
		});
		
	});

</script>
<style type="text/css">
	
	h1{
		margin-top: 100px;
		margin-left: 50px;
	}
	
	h1+div{
		width: 220px;
		height: 300px;
		/* background-color: lightgray; */
		float: left;
	}
	
	#box{
		float: left;
	}
	#box>table{
		background-color:white;
	
		position:fixed;
		margin-top:96px;	
		left: 50px;
		border: 5px groove gray;
	}
	
	#box>table>tbody tr{
		
	}
	
	#box>table>tbody tr th{
		line-height:40px;
	}
	#box>table>tbody tr th a{
		color:black;
		text-decoration: none;	
	
	}
	
</style>
</head>
<body>
	<%@ include file="template/header.jspf" %>
	
	<h1>마이페이지</h1>
	<div>
	</div>
	<div id="box">
		<table>
			<tr>
				<th><a href="#">성적 확인</a></th>
			</tr>
			
			<tr>
				<th><a href="#">출결 확인</a></th>
			</tr>
			
			<tr>
				<th><a href="#">회원정보 수정</a></th>
			</tr>
			
			<tr>
				<th><a href="#">수강 신청 현황</a></th>
			</tr>
		
		</table>
	
	</div>
	<div id="content">
		<!-- content start -->
		<img src="./img/img01.jpg"/><br/>
		<img src="./img/img01.jpg"/><br/>
		<img src="./img/img01.jpg"/><br/>
		<img src="./img/img01.jpg"/><br/>
		
		<!-- content end -->
	</div>
	
	<%@include file="template/footer.jspf" %>

</body>
</html>