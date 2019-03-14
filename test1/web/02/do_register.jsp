<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String username=request.getParameter("userName");
String skills="";
String[] skillarr=  request.getParameterValues("skills");
 if(skills !=null && skillarr.length>0){
	 for(String skill:skillarr)
	 skills=skills+skill+"&nbsp;";
	 
 }
request.setAttribute("userName1", username);
request.setAttribute("skills1", skills);
//response.sendRedirect("welcome.jsp");
%>
<jsp:forward page="welcome.jsp"></jsp:forward> 
