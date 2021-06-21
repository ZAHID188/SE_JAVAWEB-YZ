<%--
    Document   : user
    Created on : 2014-5-26, 21:52:49
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
        <jsp:useBean id="user" class="cn.edu.djtu.vo.User" scope="request"/>
        <jsp:setProperty name="user" property="*"/>
    </body>
</html>
