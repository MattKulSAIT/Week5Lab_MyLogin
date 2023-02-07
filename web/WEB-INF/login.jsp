<%-- 
    Document   : login
    Created on : 6-Feb-2023, 5:38:33 PM
    Author     : mdkul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LogIn</title>
    </head>
    <body>
        <h1>Login</h1>
        <br>
        <form method="post">
            Username: <input type="text" name="username"><br>
            Password: <input type="text" name="password"><br>
            <input type="submit" value="Log in"><br>
            ${message}
        </form>
    </body>
</html>
