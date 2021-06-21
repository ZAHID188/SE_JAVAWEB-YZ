<%-- 
    Document   : chooseAndForEach
    Created on : 2014-5-3, 13:57:21
    Author     : Administrator
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>1判断并输出数组中的元素</h3>
        <%
            String[] fruits = {"香蕉", "苹果", "哈密瓜"};
            request.setAttribute("myfruits", fruits);
        %>
        <c:choose >
            <c:when test="${empty myfruits}">
                没有满足条件的数据！
            </c:when>
            <c:otherwise>
                <c:forEach var="fa" items="${myfruits}">
                    ${fa}
                </c:forEach>
            </c:otherwise>
        </c:choose>
        <h3>2判断并输出List中的元素</h3>
        <%
            List fruitList = new ArrayList();
            fruitList.add("芒果");
            fruitList.add("草莓");
            fruitList.add("水蜜桃");
            request.setAttribute("flist", fruitList);
        %>
        <c:choose >
            <c:when test="${empty flist}">
                没有满足条件的数据！
            </c:when>
            <c:otherwise>
                <c:forEach var="fb" items="${flist}">
                    ${fb}
                </c:forEach>
            </c:otherwise>
        </c:choose>
    </body>
</html>
