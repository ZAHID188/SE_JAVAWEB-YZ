<%-- 
    Document   : index
    Created on : 2012-7-26, 15:34:31
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
        <a href="ShowMsgServlet1?name=tom">通过超级链接提交的参数，参数名为name，值为tom</a>
        <form action="ShowMsgServlet2" method="POST">
            想说的话：<input type="text" name="msg" value="" />
            <input type="submit" value="提交" />
        </form>
    </body>
</html>
