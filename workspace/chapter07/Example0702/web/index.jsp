<%-- 
    Document   : index
    Created on : 2013-10-25, 11:28:14
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>声明标记、脚本标记、表达式标记的使用</title>
    </head>
    <body>
        <%!
            private String name;
            public void setName(String name) {
                this.name = name;
            }
        %>
        <%
            if (this.name == null || "".equals(this.name)) {
                this.setName("tom");
            }
        %>
        <%=name%>
    </body>
</html>
