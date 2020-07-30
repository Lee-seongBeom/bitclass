<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL 제어문</h1>
	<h2>조건문</h2>
	
	<c:set value="2" var="su"></c:set>
	
	<c:if test="${su gt 0}">
		<p>양수입니다</p>
	</c:if>
	<c:if test="${su eq 0}">
		<p>0입니다</p>
	</c:if>
	<c:if test="${su lt 0}">
		<p>음수입니다</p>
	</c:if>
	
	<c:choose>
		<c:when test="${su==1}">su=1</c:when>
		<c:when test="${su<0}">su=-xxxx</c:when>
		<c:when test="${su==0 }">su=0</c:when>
		<c:otherwise>몰라</c:otherwise>
	</c:choose>
	<h2>반복문</h2>
	<!--  -->
	<c:forEach begin="1" end="10" var="su" varStatus="status" step="3">
		<p>${status.last}  출력${su} ${status.first}</p>
	</c:forEach>
	
</body>
</html>













