<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="login" class="com.bit.dept.DeptDto" scope="session"></jsp:useBean>
<table width="1024" align="center">
      <tr>
         <td>
            <img alt="" src="../img/logo.png">
         	<p><jsp:getProperty property="name" name="login"/></p>
         </td>
      </tr>