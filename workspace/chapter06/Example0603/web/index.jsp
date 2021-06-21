<%-- 
    Document   : index
    Created on : 2012-11-3, 15:56:51
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
        <h1>对数据库进行写操作的练习</h1>
        <a href="ShowAllPersonServlet">查看数据库中现有数据</a>
        <hr/>
        在PERSON表中添加一条记录，请输入该person的全部信息
        <form method="POST" action="InsertHandleServlet">
            ID:<input type="text" name="id" value="" /><br/>
            NAME:<input type="text" name="name" value="" /><br/>
            PWD:<input type="password" name="pwd" value="" /><br/>
            GENDER:<input type="radio" name="gender" value="男" checked/>男
            <input type="radio" name="gender" value="女" />女<br/>
            <input type="submit" value="插入记录" />
        </form>
        <hr/>
        在PERSON表中修改一条记录，请输入该person的ID
        <form method="POST" action="UpdateHandleServlet">
            ID:<input type="text" name="id" value="" />
            <input type="submit" value="更新记录" />
        </form>
        <hr/>
        在PERSON表中删除一条记录，请输入该person的ID
        <form method="POST" action="DeleteHandleServlet">
            ID:<input type="text" name="id" value="" />
            <input type="submit" value="删除记录" />
        </form>
    </body>
</html>
