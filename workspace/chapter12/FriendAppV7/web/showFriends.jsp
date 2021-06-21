<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:choose >
            <c:when test="${empty flist}">
                没有满足条件的数据！
            </c:when>
            <c:otherwise>
                <table border="1" align="center">
                    <tr>
                        <th>序号</th>
                        <th>姓名</th>
                        <th>性别</th>
                        <th>电话</th>
                        <th>手机</th>
                        <th>备注</th>
                        <th>编辑</th>
                    </tr>
                    <c:forEach var="friend" items="${flist}" varStatus="s">
                        <tr>
                            <td>${s.count}</td>
                            <td>${friend.fname}</td>
                            <td>${friend.fgender}</td>
                            <td>${friend.ftelephone}</td>
                            <td>${friend.fcellphone}</td>
                            <td>${friend.fremark}</td>
                            <td>
                                <a href="FriendDetailServlet?fid=${friend.fid}&opcode=u">修改信息</a>
                                <a href="FriendDetailServlet?fid=${friend.fid}&opcode=d">删除信息</a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </c:otherwise>
        </c:choose>
    </body>
</html>
