<%-- 
    Document   : querybycode
    Created on : 2013-11-6, 8:49:34
    Author     : Administrator
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("utf-8");
            String code = request.getParameter("code");
            Connection conn = null;
            PreparedStatement prst = null;
            ResultSet rs = null;
            String url = "jdbc:derby://localhost:1527/sample";
            String driver = "org.apache.derby.jdbc.ClientDriver";
            String user = "app";
            String password = "app";
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            String sql = "select customer_id , name from customer where discount_code=?";
            prst = conn.prepareStatement(sql);
            prst.setString(1, code);
            rs = prst.executeQuery();
        %>        
        <table border="1">
            <%
                while (rs.next()) {
            %>
            <tr>
                <td><%=rs.getInt("customer_id")%></td>
                <td><%=rs.getString("name")%></td>
            </tr>
            <%
                }
            rs.close();
            prst.close();
            conn.close();
            %>
        </table>
    </body>
</html>
