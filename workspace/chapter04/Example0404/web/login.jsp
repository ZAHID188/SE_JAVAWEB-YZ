<%-- 
    Document   : login
    Created on : 2012-10-14, 18:35:18
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
        <h1>用户登录</h1>
        <form method="POST" action="HandleLoginServlet">
            用户名：<input type="text" name="username" value="" /><br/>
            密码：<input type="password" name="userpass" value="" /><br/>
            <input type="submit" value="登录" />
        </form>
    </body>
</html>
