<%-- 
    Document   : index
    Created on : May 24, 2021, 6:23:40 PM
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
        <h1>Hello World!</h1>
        
        <a href="FirstServlet">open FirstServlet</a>
        <br>
        
        
        <a href="oneservlet?name=tom" >The parameter submitted through the hyperlink,
            the parameter name is name , the value is tom.</a>
        
        <form action="twoservlet" method="POST">
            What I want to say is:<input type="text" name="msg" value="">
            <input type="submit" value="submit">
        
        </form>
    </body>
</html>
