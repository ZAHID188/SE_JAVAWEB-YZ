<%-- 
    Document   : index
    Created on : 2012-11-3, 15:56:51
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Check person table </h1>
        <a href="ShowAllPersonServlet">Show all</a>
        <hr/>
        <h2>Register</h2>
        <form method="POST" action="InsertHandleServlet">
            ID:<input type="text" name="id" value="" /><br/>
            NAME:<input type="text" name="name" value="" /><br/>
            PWD:<input type="password" name="pwd" value="" /><br/>
            GENDER:<input type="radio" name="gender" value="Male" checked/>Male
            <input type="radio" name="gender" value="Female" />Female<br/>
            <input type="submit" value="Submit" />
        </form>
        <hr/>
        Input The Id  and Update:
        <form method="POST" action="UpdateHandleServlet">
            ID:<input type="text" name="id" value="" />
            <input type="submit" value="Submit" />
        </form>
        <hr/>
         Input The Id  and Delete:
        <form method="POST" action="DeleteHandleServlet">
            ID:<input type="text" name="id" value="" />
            <input type="submit" value="Delete" />
        </form>
    </body>
</html>
