<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		if (session.getAttribute("userid")!=null) {
	%>
	wellcome:<%=session.getAttribute("userid")%>
	<a href="logout.jsp">注销</a>
	<br>
	<%
		} else {
	%>
	登录先
	<a href="login.jsp">登录</a>
	<%
		}
	%>
	<%
		if (session.isNew()) {
	%>新客户！
	<%
		} else {
	%>
	老客户！
	<%
		}
	%>

</body>
</html>