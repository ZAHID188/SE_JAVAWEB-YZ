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
        <title>REG Page</title>
    </head>
    <body>
        <h2>Login Page Registration </h2>
    
        
        <hr/>
        
        <form action="RegServlet" method="POST">
	UserName：<input type="text" name="username" /><br/>
	UserPassword：<input type="password" name="userpwd"/><br/>
			<input type="submit" value="Submit" />
</form>

        <hr/>
       
        <hr/>
       
    </body>
</html>
