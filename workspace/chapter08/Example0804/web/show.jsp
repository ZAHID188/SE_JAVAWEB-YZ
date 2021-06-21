<%-- 
    Document   : show
    Created on : 2014-4-28, 11:41:01
    Author     : Administrator
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="cn.edu.djtu.vo.Person"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1" align="center">
            <tr>
                <th>学号</th>
                <th>姓名</th>
                <th>密码</th>
                <th>性别</th>
            </tr>

            <%
                List<Person> list = (ArrayList<Person>) request.getAttribute("plist");
                for (Person p : list) {
            %>
            <tr>
                <td><%=p.getId()%></td>
                <td><%=p.getName()%></td>
                <td><%=p.getPwd()%></td>
                <td><%=p.getGender()%></td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
