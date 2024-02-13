<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FinalProj</title>
</head>
<body>

CreateAccount
<br><br>
<font color="red" size = 30px>
<%
if(request.getAttribute("msg")!=null){
	
out.print(request.getAttribute("msg"));
}
%>
</font>
<form action="createaccount" method="post">
username:<input type="text" name="username" placeholder="Username">
password:<input type="password" name="password" placeholder="Password">
<input type="submit" value="createaccount">
<input type="reset" value="Reset">
</form>

<a href="/">BackToLogin</a> 
<!-- here the api that we see on url is returned -->


</body>
</html>