<%-- 
    Document   : codeinfo
    Created on : 2013-11-6, 8:49:21
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
        提交到querybycode的表单
    <form action="querybycode.jsp" method="POST">
        discount_code:<input type="text" name="code" value="" />
                        <input type="submit" value="提交" />
    </form>
    </body>
</html>
