<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="do_register.jsp" method="post">
username:<input type="text" name="userName"><br>
特长:<input type="checkbox" name="skills" value="java" >java&nbsp;
<input type="checkbox"name="skills" value="python" >python&nbsp;
<input type="checkbox"name="skills" value="ruby" >ruby&nbsp;
<input type="checkbox"name="skills" value="golang" >golang&nbsp;
<input type="checkbox"name="skills" value="clojure" >clojure&nbsp;<br>
<input type="submit" value="提交"><input type="reset" value="撤销">
</form>
</body>
</html>