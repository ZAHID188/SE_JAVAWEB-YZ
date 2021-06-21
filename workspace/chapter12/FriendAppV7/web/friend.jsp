<%--
    Document   : friend
    Created on : 2014-5-27, 17:23:18
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
        <jsp:useBean id="friend" class="cn.edu.djtu.vo.Friend" scope="request"/>
        <jsp:setProperty name="friend" property="*"/>
    </body>
</html>
