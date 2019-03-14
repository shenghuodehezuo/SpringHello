<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String name=request.getParameter("usn");
String psw=request.getParameter("psw");
System.out.print(name);
System.out.print(psw);
if(name!=null && psw!=null){
	session.setAttribute("userid", name);
	//response.setHeader("refresh", "1;URL=welcome.jsp");
	response.sendRedirect("welcome.jsp");
	
}
%>