<%--
    Document   : index
    Created on : 2014-5-22, 11:11:57
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
        <h1>欢迎你：${username}</h1>
        请选择您想做的操作:<hr/>
        1.添加好友<br/>
        <a href="addFriend.jsp">添加好友信息</a><hr/>
        2.查询好友<br/>
        <form action="FindFriendServlet" method="post" target= "_blank" >
            <input type="text" name="condition" value=""/>
            <select name="type">
                <option value="1">查询全部</option>
                <option value="2">按姓名查询</option>
                <option value="3">按姓氏查询</option>
            </select>
            <input type="submit" value="查询"/>
        </form><hr/>
    </body>
</html>
