<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <jsp:include page="taglib.jsp" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<link rel="stylesheet" type="text/css" href="${baseURL}/css/style.css">
</head>
<body>

	<div id="content">
		<div class="header">
			<img src="${baseURL}/image/welcome.jpg">
		</div>
		<form action="${baseURL}/register.do">
			<div class="input-box">
				<span class="icon icon-user"></span> <input type="text" name="username"
					placeholder="Please enter your email/phone">
			</div>
			<div class="input-box">
				<span class="icon icon-password"></span> <input type="password" name="password"
					placeholder="Please enter your password">
			</div>
			<div class="button-box">
				<button type="submit">注册</button>
			</div>
		</form>

		<div class="box">
			<a href="${baseURL}/jsp/login.jsp">有账号，请登陆</a>
		</div>
		<div class="box">${msg}</div>
	</div>

</body>
</html>