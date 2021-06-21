<%--
    Document   : addFriend
    Created on : 2014-5-27, 17:20:30
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
        　　　　　<form action="AddFriendServlet" method="POST">
　　　　　　　姓名：<input type="text" name="fname" value="" /><br/>
　　　　　　　性别：<input type="radio" name="fgender" value="男" checked/>男
                     <input type="radio" name="fgender" value="女" />女<br/>
　　　　　　　电话：<input type="text" name="ftelephone" value="" /><br/>
　　　　　　　手机：<input type="text" name="fcellphone" value="" /><br/>
　　　　　　　备注：<input type="text" name="fremark" value="" /><br/>
　　　　　　　<input type="hidden" name="username" value="${username}" /><br/>
　　　　　　　<input type="submit" value="添加" /><br/>
　　　　　</form>
    </body>
</html>
