<%-- 
    Document   : useJavaBeanTag
    Created on : 2014-2-28, 10:24:10
    Author     : Administrator
--%>
<%@page import="cn.edu.djtu.Student" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--实例化一个学生对象-->
        <%
            //Student s = new Student();
        %>
        <jsp:useBean id="s" class="cn.edu.djtu.Student" scope="page"/>
        <!--初始化该学生对象-->
        <%
            //s.setSno("007");
            //s.setSname("詹姆斯邦德");
        %>
        <jsp:setProperty name="s" property="sno" value="007"/>
        <jsp:setProperty name="s" property="sname" value="詹姆斯邦德"/>
        <!--输出该学生对象的信息-->
        <%=s.getSno()%>
        <%=s.getSname()%>
    </body>
</html>
