<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
<style>

body{

background: url("../image/bankground.jpg");
}

 #content{
    background-color: rgba(255, 255, 255, 0.95);
    width: 420px;
    height: 300px;
    border: 1px solid #000000;
    border-radius: 6px;
    padding: 10px;
    margin-top: 15%;
    margin-left: auto;
    margin-right: auto;
    display: block;
}
.login-header{
    width: 100%;
    height: 48px;
    margin-bottom: 20px;
    border-bottom: 1px solid #dcdcdc;
}

.login-header img{
    width: 120px;
    margin-left: auto;
    margin-right: auto;
    display: block;
}


.login-input-box{
    margin-top: 12px;
    width: 100%;
    margin-left: auto;
    margin-right: auto;
    display: inline-block;
}

.login-input-box input{
    width: 340px;
    height: 32px;
    margin-left: 18px;
    border: 1px solid #dcdcdc;
    border-radius: 4px;
    padding-left: 42px;
}

.login-input-box input:hover{
    border: 1px solid #ff7d0a;
}

.login-input-box input:after{
    border: 1px solid #ff7d0a;
}

 

icon-user{
	background-image:url("../image/user.png")
     
}

icon-password{
    background-image: url("../image/password.jpg");
}

.remember-box{
    width: auto;
    height: auto;
    margin-left: 18px;
    margin-top: 12px;
    font-size: 12px;
    color: #6a6765;
}

.login-button-box{
    margin-top: 12px;
    width: 100%;
    margin-left: auto;
    margin-right: auto;
    display: inline-block;
}

.login-button-box button{
    background-color: #ff7d0a;
    color: #ffffff;
    font-size: 16px;
    width: 386px;
    height: 40px;
    margin-left: 18px;
    border: 1px solid #ff7d0a;
    border-radius: 4px;
}

.login-button-box button:hover{
    background-color: #ee7204;
}

.login-button-box button:active{
    background-color: #ee7204;
}

.logon-box{
    margin-top: 20px;
    text-align: center;
}

.logon-box a{
    margin: 30px;
    color: #4a4744;
    font-size: 13px;
    text-decoration: none;
}

.logon-box a:hover{
    color: #ff7d0a;
}

.logon-box a:active{
    color: #ee7204;
}
</style>
</head>
<body>
<div id="content">
	 <div class="login-header">
        <img  src="../image/welcome.jpg" >
    </div>
     <form>
        <div class="login-input-box">
            <span class="icon-user"></span>
            <input type="text" placeholder="Please enter your email/phone">
        </div>
        <div class="login-input-box">
            <span class=" icon-password"></span>
            <input type="password" placeholder="Please enter your password">
        </div>
    </form>
    <div class="remember-box">
        <label>
            <input type="checkbox">&nbsp;Remember Me
        </label>
    </div>
    <div class="login-button-box">
        <button>Login</button>
    </div>
    <div class="logon-box">
        <a href="">Forgot?</a>
        <a href="">Register</a>
    </div>
    
    
    
    
    
    
     </div>
</body>
</html>