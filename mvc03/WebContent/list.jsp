<%@page import="com.bit.dept.model.Dept04Dto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList,com.bit.dept.model.Dept04Dto"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="template/head.jspf" %>
<style type="text/css">
	#content{}
	#content>h2{
		text-align: center;
	}
	#content>table{
		width:500px;
		margin:10px auto;
	}
	#content>table, table tr>th,table tr>td{
		border-collapse: collapse;
		border:1px solid gray;
	}
</style>
</head>
<body>
<%@ include file="template/header.jspf" %>
<%@ include file="template/menu.jspf" %>
	<h2>Dept List Page</h2>
	<table>
		<tr>
			<th>deptno</th>
			<th>dname</th>
			<th>loc</th>
		</tr>
		<% 
			java.util.ArrayList<Dept04Dto> list=(java.util.ArrayList<Dept04Dto>)request.getAttribute("list");
			for(Dept04Dto bean:list){
				
		
		%>
		
		<tr>
			<th><%=bean.getDeptno() %></th>
			<th><%=bean.getDname() %></th>
			<th><%=bean.getLoc() %></th>
		</tr>
		<%
			}
		%>
	</table>
<%@ include file="template/footer.jspf" %>
</body>
</html>