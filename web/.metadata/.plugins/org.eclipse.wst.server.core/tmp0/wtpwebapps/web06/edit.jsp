<%@page import="com.bit.emp.Emp02Update"%>
<%@page import="com.bit.emp.dto.Emp02Bean"%>
<%@page import="com.bit.emp.Emp02Detail"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
   <table border="1" width ="1024" align="center">
      <tr>
         <td>
            <img alt="" src="/web06/img/logo.png">
         </td>
      </tr>
      <tr>
         <td bgcolor="gray" align="center">
            <a href="./">[HOME]</a>
            <a href="./list.jsp">[E M P]</a>
            <a href="#">[DEPT]</a>
            <a href="#">[LOGIN]</a>
         </td>
      </tr>
      <tr>
         <td>
            <!-- content start -->
         <%
            request.setCharacterEncoding("euc-kr");
            String method = request.getMethod();
            if(method.equals("POST")){
               String param1 = request.getParameter("sabun");
               String param2 = request.getParameter("name");
               String param3 = request.getParameter("pay");
               try {
                  int sabun = Integer.parseInt(param1.trim()); // 공백 입력 대비
                  String name = param2.trim();
                  int pay = Integer.parseInt(param3.trim());
                  Emp02Update emp = new Emp02Update();
                  int result = emp.update(sabun, name, pay);
                  if(result>0) {
                     response.sendRedirect("detail.jsp?idx="+sabun);
                  } else {
                     response.sendRedirect("edit.jsp?idx="+sabun);
                  }
               } catch(NumberFormatException e) {
                  response.sendRedirect("edit.jsp?idx="+param1);
               }
               return; // 더 이상 진행 안되게
            }
//             if(method.equals("GET")){
               String param = request.getParameter("idx");
               int sabun=Integer.parseInt(param);
               Emp02Detail emp = new Emp02Detail();
               Emp02Bean bean = emp.detail(sabun);
         %>
            <h1>수정페이지</h1>
            <form method = "post">
            <table width="800" align="center" border="1" cellspacing="0">
               <tr>
                  <td>사번</td>
                  <td><input type="text" name="sabun" value="<%=bean.getSabun() %>" readonly="readonly"></td>
               </tr>
               <tr>
                  <td>이름</td>
                  <td><input type="text" name="name" value="<%=bean.getName() %>"></td>
               </tr>
               <tr>
                  <td>날짜</td>
                  <td><%=bean.getNalja() %></td>
               </tr>
               <tr>
                  <td>금액</td>
                  <td><input type="text" name="pay" value="<%=bean.getPay() %>"></td>
               </tr>
               <tr>
                  <td colspan="2" align="center">
                     <input type="submit" value="수정">
                     <input type="reset" value="취 소">
                  </td>
               </tr>
            </table>
            </form>
            <!-- content end -->
         </td>
      </tr>
      <tr>
         <td bgcolor="gray" align="center">
         비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)<br>
         (주)비트컴퓨터 서초본원 대표이사 : 조현정<br>
         Copyright (c) 비트캠프 All rights reserved.<br>
         </td>
      </tr>
   </table>
</body>
</html>