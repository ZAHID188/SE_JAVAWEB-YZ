<%-- 
    Document   : forEach
    Created on : 2014-5-3, 13:56:29
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
        <h3>1使用forEach（begin、end、step）输出10个Hello！</h3>
        <c:forEach begin="1" end="10" step="1" >
            Hello！
        </c:forEach>
        <h3>2使用forEach（var、begin、end、step）输出1-10之间的整数</h3>
        <c:forEach var="output" begin="1" end="10" step="1" >
            ${output}
        </c:forEach>

        <h3>3使用forEach（var、begin、end、step）输出1-10之间的偶数</h3>
        <c:forEach var="output" begin="2" end="10" step="2">
            ${output}
        </c:forEach>
        <hr/>
        <%
            String[] fruits = {"香蕉", "苹果", "哈密瓜"};
            request.setAttribute("myfruits", fruits);
        %>
        <h3>4使用forEach（var、items）输出集合中的元素</h3>
        <c:forEach var="output" items="${myfruits}">
            ${output}
        </c:forEach>
        <h3>5使用forEach（var、items、varStatus）输出集合中的元素</h3>
        <c:forEach var="output" items="${myfruits}" varStatus="status">
            第${status.count}个元素 ${output} <br/>
        </c:forEach>
    </body>
</html>
