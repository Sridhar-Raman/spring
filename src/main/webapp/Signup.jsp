<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="x" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<x:form action="signup" modelAttribute="emp">
Name:<x:input path="name"/>
Email:<x:input path="email"/>
Mobile:<x:input path="mobile"/>
Password:<x:input path="password"/>
<x:button>Submit</x:button>
<x:button>Reset</x:button>
</x:form>
</body>
</html>