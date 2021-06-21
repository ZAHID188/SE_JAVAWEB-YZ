<%-- 
    Document   : EL6
    Created on : 2014-4-27, 21:02:43
    Author     : Administrator
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL6</title>
    </head>
    <body>
        <h1>使用“[ ]”操作符输出List类型对象的信息</h1>
        <%
            List fruitList = new ArrayList();
            fruitList.add("香蕉");
            fruitList.add("苹果");
            fruitList.add("哈密瓜");
            request.setAttribute("flist", fruitList);
        %>
        第1种水果：${requestScope.flist[0]}<hr/>
        第2种水果：${requestScope.flist[1]}<hr/>
        第3种水果：${requestScope.flist[2]}<hr/>
        全部的水果：${requestScope.flist}
    </body>
</html>
