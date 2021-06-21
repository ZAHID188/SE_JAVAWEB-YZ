<%-- 
    Document   : EL5
    Created on : 2014-4-27, 20:41:07
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL5</title>
    </head>
    <body>
        <h1>使用“[ ]”操作符输出数组类型对象的信息</h1>
        <%
            String[] fruits = {"香蕉","苹果","哈密瓜"};
            request.setAttribute("farray", fruits);
        %>
        第1种水果：${requestScope.farray[0]}<hr/>
        第2种水果：${requestScope.farray[1]}<hr/>
        第3种水果：${requestScope.farray["2"]}<hr/>
        全部的水果?：${requestScope.farray}
    </body>
</html>
