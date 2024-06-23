<%-- 
    Document   : login
    Created on : 23-Jun-2024, 14:51:48
    Author     : icbt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="index.jsp" method="post">
          <label for="fname">Username:</label><br>
          <input type="text" id="username" name="username"><br>
          <label for="lname">Password</label><br>
          <input type="password" id="password" name="password">
          <input type="submit" text = "login">
        </form>
    </body>
</html>
