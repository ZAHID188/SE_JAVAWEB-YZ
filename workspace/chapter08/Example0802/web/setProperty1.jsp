<%-- 
    Document   : setProperty1
    Created on : 2014-2-28, 13:38:07
    Author     : Administrator
--%>
<%@page import="cn.edu.djtu.Student" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="s" class="cn.edu.djtu.Student" scope="page"/>
        <jsp:setProperty name="s" property="sno" param="xuehao"/>
        <jsp:setProperty name="s" property="sname" param="xingming"/>
        <jsp:getProperty name="s" property="sno"/>
        <jsp:getProperty name="s" property="sname"/>
    </body>
</html>
