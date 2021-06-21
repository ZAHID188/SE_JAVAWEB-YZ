<%--
    Document   : updateFriend
    Created on : 2014-5-27, 22:10:45
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
        <h1>更新朋友信息!</h1>
        <form action="UpdateFriendServlet" method="POST">
            <input type="hidden" name="fid" value="${friend.fid}" />
            姓名：<input type="text" name="fname" value="${friend.fname}" /><br/>
            性别：
            <input type="radio" name="fgender" value="男" ${friend.fgender=="男"?"checked":""}/>男
            <input type="radio" name="fgender" value="女" ${friend.fgender=="女"?"checked":""}/>女<br/>
            电话：<input type="text" name="ftelephone" value="${friend.ftelephone}" /><br/>
            手机：<input type="text" name="fcellphone" value="${friend.fcellphone}" /><br/>
            备注：<input type="text" name="fremark" value="${friend.fremark}" /><br/>
            <input type="hidden" name="username" value="${username}" /><br/>
            <input type="submit" value="更新" /><br/>
        </form>
    </body>
</html>
