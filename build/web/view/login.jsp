<%-- 
    Document   : login
    Created on : Nov 13, 2024, 8:53:53 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="T1" method="post">
            Username: <input type="text" name = "username" required> <br>
            Password: <input type="password" name = "password" required><br>
            <input type="submit"  value = "Login">     
        </form>
    </body>
</html>
