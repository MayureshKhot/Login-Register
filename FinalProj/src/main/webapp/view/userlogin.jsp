<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>FinalProj</title>
    <style>
        body {
            background-color: #f7f7f7;
            font-family: 'Comic Sans MS', cursive, sans-serif;
        }

        form {
            max-width: 300px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            box-sizing: border-box;
            border: 2px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"],
        input[type="reset"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 15px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover,
        input[type="reset"]:hover {
            background-color: #45a049;
        }

        a {
            text-decoration: none;
            color: #ff5733; /* Fun orange color */
        }

        a:hover {
            text-decoration: underline;
        }

        font {
            color: #ff0000; /* Red font color for the message */
            font-size: 24px;
        }
    </style>
</head>
<body>

UserLogin <br><br>
<font>
    <%
        if(request.getAttribute("msg")!=null){
            out.print(request.getAttribute("msg"));
        }
    %>
</font>
<form action="userlogin" method="post">
    username:<input type="text" name="username" placeholder="Username">
    password:<input type="password" name="password" placeholder="Password">
    <input type="submit" value="Login">
    <input type="reset" value="Reset">
</form>
<br>
<br>

<a href="createaccountpage">CreateAccount</a>

</body>
</html>
