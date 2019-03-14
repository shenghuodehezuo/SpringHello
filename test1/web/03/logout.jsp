<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
session.invalidate();
//session.removeAttribute("userid");
//response.setHeader("refresh", "2;URL=welcome.jsp");
response.sendRedirect("welcome.jsp");
%>
