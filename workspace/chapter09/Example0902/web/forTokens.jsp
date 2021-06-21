<%-- 
    Document   : forTokens
    Created on : 2014-5-3, 13:56:46
    Author     : Administrator
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>1无意义的分隔（items、delims）</h3>
        <c:forTokens items="吃饭,睡觉,打豆豆" delims=",">
            Hello!
        </c:forTokens>        
        <h3>2输出分隔后元素（items、delims、var）</h3>        
        <c:forTokens items="吃饭,睡觉,打豆豆" delims="," var="s">
            ${s}
        </c:forTokens>        
        <h3>3输出分隔后元素中的某些元素<br/>（items、delims、var、begin、end、step）</h3>
        <c:forTokens items="吃饭,睡觉,打豆豆" delims="," var="s" begin="1" end="2" step="1">
            ${s}
        </c:forTokens>
    </body>
</html>
