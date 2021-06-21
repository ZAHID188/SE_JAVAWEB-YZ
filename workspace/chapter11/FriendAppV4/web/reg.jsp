<%--
    Document   : reg
    Created on : 2014-5-26, 11:04:54
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
        ${msg}
        <h1>新用户注册</h1>
        <form action="RegServlet" method="POST">
            用户名：<input type="text" name="username" value="" /><br/>
            密码：<input type="password" name="userpass" value="" /><br/>
            <input type="submit" value="注册" />
        </form>
    </body>
</html>
