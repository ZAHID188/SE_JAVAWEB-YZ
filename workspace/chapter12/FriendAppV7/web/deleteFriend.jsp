<%--
    Document   : deleteFriend
    Created on : 2014-5-27, 22:39:32
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
        <h1>确定删除该条信息？</h1>
        <form action="DeleteFriendServlet" method="POST">
            <input type="hidden" name="fid" value="${friend.fid}" />
            姓名：${friend.fname}<br/>
            性别：${friend.fgender}<br/>
            电话：${friend.ftelephone}<br/>
            手机：${friend.fcellphone}<br/>
            备注：${friend.fremark}<br/><br/>
            <input type="submit" value="删除" /><br/>
        </form>
    </body>
</html>
