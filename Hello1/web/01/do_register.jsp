<%@page import="com.coffee.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--使用jsp标签操作bean --%>
<jsp:useBean id="userid" scope="page" class="com.coffee.UserBean"/>
<jsp:setProperty property="*" name="userid"/>
---------------------------------------------------------------------------------<br>
<jsp:getProperty property="usn" name="userid"/>
<jsp:getProperty property="psw" name="userid"/><br>
-----------------------------------------------------<br>
<%
  String usn=request.getParameter("usn");
String psw=request.getParameter("psw");
out.print(usn+psw);
%><br>
---------------------------------------------------<br>
<%
//直接使用bean处理数据
   UserBean user=new UserBean();
user.setUsn(usn+"iuiu");
user.setPsw(psw+"444");

out.print(user.toString());
%>
</body>
</html>