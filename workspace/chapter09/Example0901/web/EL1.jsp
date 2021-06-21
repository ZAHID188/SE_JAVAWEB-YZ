<%-- 
    Document   : EL1
    Created on : 2014-4-27, 20:14:30
    Author     : Administrator
--%>

<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL1</title>
    </head>
    <body>
        <h1>使用“.”操作符输出Map类型对象的信息</h1>
        <%
            HashMap fruitMap = new HashMap();
            fruitMap.put("f1", "香蕉");
            fruitMap.put("f2", "苹果");
            fruitMap.put("f3", "哈密瓜");
            request.setAttribute("fmap", fruitMap);
        %>
        第1种水果：${requestScope.fmap.f1}<hr/>
        第2种水果：${requestScope.fmap.f2}<hr/>
        第3种水果：${requestScope.fmap.f3}<hr/>
        全部的水果：${requestScope.fmap}
    </body>
</html>
