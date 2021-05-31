<%-- 
    Document   : login
    Created on : May 31, 2021, 6:10:31 PM
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
        <form method="POST" action="../HandleLoginServlet1">// this one brings new page indx.asp instead of index
            Username：<input type="text" name="username" value="" /><br/>
            password：<input type="password" name="userpass" value="" /><br/>
            <input type="submit" value="login" />
        </form>
    </body>
</html>


