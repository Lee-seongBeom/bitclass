<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>비트캠프 제주점 로그인</title>
<%@ include file="../template/head.jspf" %>
<%@ include file="../template/header.jspf" %>

<script type="text/javascript">
	
	function idIn(){	// id input focusin
		$('#id').focusin(function(){
			if($(this).val()=='아이디를 입력하세요'){
				$(this).val('');
			}
		});
	}
	
	function idOut(){	// id input focusout
		$('#id').focusout(function(){
			if($(this).val()==''){
				$(this).val('아이디를 입력하세요');
				
			}
		});
	}
	
	function pwIn(){	// pw input focusin
		$('#pw').focusin(function(){
			if($(this).val()=='비밀번호를 입력하세요'){
				$(this).val('');
			}
		});
	}
	
	function pwOut(){	// pw input focusout
		$('#pw').focusout(function(){
			if($(this).val()==''){
				$(this).val('비밀번호를 입력하세요');
				
			}
		});
	}
	
	
	
	function historyBack(){
		$('#content').find(':button').onclick(function(){
			window.history.back();
		})
	}
	
	$(document).ready(function(){
		
		idIn();
		idOut();
		pwIn();
		pwOut();
		
		/* 4자이상 8자이하로 입력해주세요 */
		/* $('#id').after('<span>영문으로만 6자이상 12자이하로 입력해주세요</span>'); */
	});

</script>
<style type="text/css">
	h1{
		margin-top:5%;
		text-align: center;
	}
	
	#content{
		text-align: left;
		margin-left: 45%;
		margin-top: 50px;
	}
	
	#content div{
		text-align: left;
	}

	#content input{
		width:150px;
	}
</style>
</head>
<body>
		
	<h1>로그인</h1>
	<div id="content">
		<!-- content start -->
		<form action="login.jb" method="post">
			
			<div>
				<label for="id">아이디 :</label>
				<input type="text" name="id" id="id" value="아이디를 입력하세요"/>
			</div>
			
			<div>
				<label for="pw">패스워드 :</label>
				<input type="password" name="pw" id="pw" value="비밀번호를 입력하세요"/>
			</div>
			
			<div>
				<button type="submit">로그인</button>
				<button type="reset">취소</button>
				<button type="button" >뒤로가기</button>
			</div>
			
		</form>
		<!-- content end -->
	</div>

<%@ include file="/template/footer.jspf" %>
</body>
</html>