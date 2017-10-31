<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
</head>
<body>
	<form action="../login" method="post">
		名称<input type="text" name="merName"><br>
		密码<input type="text" name="passWord"><br>
		<input type="submit" value="登陆"/><br>
		<a href="register.jsp">注册</a> 
	</form>
</body>
</html>