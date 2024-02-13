<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FinalProj</title>
</head>
<body>

Contact Page

<a href="homepage">Home</a>
<a href="aboutpage">About</a>
<a href="servicespage">Services</a>
<a href="contactpage">Contact</a>
<a href="logout">Logout</a>

<form action="contact" method="post">

Name:<input type="text" value="name">
Address:<input type="text" value="address">
Email:<input type="text" value="email">
Mobile:<input type="text" value="mobile">

<input type="submit" value="Submit">
<input type="reset" value="Reset">
</form>

</body>
</html>