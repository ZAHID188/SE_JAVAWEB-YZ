<%--
    Document   : login
    Created on : 2014-5-22, 11:13:04
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
        <h1>用户登录</h1>
        <form action="LoginServlet" method="POST">
            用户名：<input type="text" name="username" value="" /><br/>
            密码：<input type="password" name="userpass" value="" /><br/>
            <input type="submit" value="登录" />
        </form>
        <hr/>
        <a href="reg.jsp">新用户注册</a>
    </body>
</html>
