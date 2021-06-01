<%-- 
    Document   : login1Comperison
    Created on : Jun 1, 2021, 7:59:58 PM
    Author     : zahid
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <h1>User Login</h1>
        <form method="POST" action="../HandleLoginServlet23">
            Username：<input type="text" name="username" value="" /><br/>
            password：<input type="password" name="userpass" value="" /><br/>
            <input type="submit" value="login" />
        </form>
    </body>
</html>
