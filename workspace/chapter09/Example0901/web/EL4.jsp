<%-- 
    Document   : EL4
    Created on : 2014-4-27, 20:15:34
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL4</title>
    </head>
    <body>
        <h1>使用“[ ]”操作符输出JavaBean类型对象的信息</h1>
        <jsp:useBean id="p" class="cn.edu.djtu.vo.Person" scope="request"/>
        <jsp:setProperty name="p" property="id" value="001"/>
        <jsp:setProperty name="p" property="name" value="张三"/>
        <jsp:setProperty name="p" property="pwd" value="111111"/>
        <jsp:setProperty name="p" property="gender" value="男"/>
        id：${requestScope.p["id"]}<hr/>
        name：${requestScope.p["name"]}<hr/>
        pwd：${requestScope.p["pwd"]}<hr/>
        gender：${requestScope.p["gender"]}        
    </body>
</html>
