<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:green;">${msg}</h1>
<form action="login" method="post">
<table>
<tr>
<th>Email/Phone:</th>
<td><input type="text" name="email"></td>
</tr>
<tr>
<th>Password:</th>
<td><input type="password" name="pass"></td>
</tr>
<tr>
<td><button type="reset">Cancel</button></td>
<td><button>Login</button>
</table>
</form>
<br>
<a href="load">New? Click Here To Sign up..!</a>
</body>

</html>