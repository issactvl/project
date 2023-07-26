<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="Style.css">
</head>
<body class=b1>
<fieldset class="field">
<form action="AdminDelete">
<input type ="text" placeholder="Admin Name" name="name"><br><br>
<input type="password" placeholder="Admin Password" name="pass"><br><br>
<input type ="Submit" value ="Delete Account"><br><br>
New to here?<a href="AdminRegister.jsp">Click here to Register</a><br><br>
Already An User ? <a href="AdminLogin.jsp">Click here to Login</a><br><br>
Forgot Password?<a href="AdminForgot.jsp">Click here to change your password</a><br><br>
</form>
</fieldset>
</body>
</html>