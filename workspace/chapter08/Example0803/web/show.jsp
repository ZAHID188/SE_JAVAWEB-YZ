<%-- 
    Document   : show
    Created on : 2014-4-28, 11:32:59
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
        <jsp:useBean id="p"  class="cn.edu.djtu.vo.Person" scope="request"/>
        ID:<jsp:getProperty name="p" property="id"/><hr/>
        NAME:<jsp:getProperty name="p" property="name"/><hr/>
        PWD:<jsp:getProperty name="p" property="pwd"/><hr/>
        GENDER:<jsp:getProperty name="p" property="gender"/>
    </body>
</html>
