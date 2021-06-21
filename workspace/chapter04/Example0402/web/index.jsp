<%-- 
    Document   : index
    Created on : 2012-7-26, 16:42:00
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
        <form method="POST" action="ShowMsgServlet">
            您喜欢的手机品牌：
            <input type="checkbox" name="cellphone" value="nokia" />nokia
            <input type="checkbox" name="cellphone" value="htc" />htc
            <input type="checkbox" name="cellphone" value="apple" />apple
            <input type="submit" value="提交" />
        </form>
    </body>
</html>
