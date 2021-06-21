<%-- 
    Document   : choose
    Created on : 2014-5-3, 13:57:08
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
        <%
            request.setAttribute("score", 45);
        %>
        <c:choose >
            <c:when test="${score>=90}">优</c:when>
            <c:when test="${score>=80}">良</c:when>
            <c:when test="${score>=70}">中</c:when>
            <c:when test="${score>=60}">及格</c:when>
            <c:otherwise>不及格</c:otherwise>
        </c:choose>
    </body>
</html>
