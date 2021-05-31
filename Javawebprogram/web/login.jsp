<%-- 
    Document   : login.jsp
    Created on : May 31, 2021, 5:46:37 PM
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
        <form method="POST" action="HandleLoginServlet">// after Login just have an success masg from the HandleLoginServlet 
            Name：<input type="text" name="username" value="" /><br/>
            Password：<input type="password" name="userpass" value="" /><br/>
            <input type="submit" value="login" />
        </form>
    </body>
</html>


