<%-- 
    Document   : EL7
    Created on : 2014-4-27, 22:53:12
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL7</title>
    </head>
    <body>
        <h1>EL如何在作用域中查找对象</h1>
        <%
            pageContext.setAttribute("myKey", "pageScopeValue");
            request.setAttribute("myKey", "requestScopeValue");
            session.setAttribute("myKey", "sessionScopeValue");
            application.setAttribute("myKey", "applicationScopeValue");
        %>
        输出pageScope中键值“myKey”对应的对象${pageScope.myKey}<hr/>
        输出requestScope中键值“myKey”对应的对象${requestScope.myKey}<hr/>
        输出sessionScope中键值“myKey”对应的对象${sessionScope.myKey}<hr/>
        输出application中键值“myKey”对应的对象${applicationScope.myKey}<hr/>
        \${myKey}输出的是这个：${myKey}<hr/>
    </body>
</html>
