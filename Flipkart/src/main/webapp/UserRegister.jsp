<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="Style.css">
</head>
<body>
<fieldset class="field">
<form action="UserRegister">
Enter your Name : <input type ="text" name="name"><br><br>
Enter your Password : <input type ="password" name="pass"><br><br>
<input type ="Submit" value ="User Register"><br><br>
Already An User ? <a href="UserLogin.jsp">Click here to Login</a><br><br>
Forgot Password?<a href="UserForgot.jsp">Click here to change your password</a><br><br>
Delete Account?<a href="UserDelete.jsp">Deactivate my Account</a>
</form>
</fieldset>
</body>
</html>