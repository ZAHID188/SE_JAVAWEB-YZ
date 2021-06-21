<%-- 
    Document   : if
    Created on : 2014-5-3, 13:56:57
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
        <h3>1最简单的条件判断及输出（test）</h3>
        <c:if test="${1<2}">
            条件为真
        </c:if>
        <h3>2将判断结果赋值给变量并将该变量存储在默认作用域（test、var）</h3>
        <c:if test="${1<2}" var="output"/>
        ${pageScope.output}
        <h3>3将判断结果赋值给变量并将该变量存储在特定作用域（test、var、scope）</h3>
        <c:if test="${2<2}" var="output" scope="request"/>
        ${requestScope.output}
    </body>
</html>
