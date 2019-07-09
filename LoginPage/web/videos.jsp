<%--
  Created by IntelliJ IDEA.
  User: patch-junint-7
  Date: 09-07-2019
  Time: 05:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
        response.setHeader("Pragma","no-cache");
        response.setHeader("Expires","0");
        String username = (String)session.getAttribute("username");
        if(username==null){
            response.sendRedirect("login.jsp");
        }
    %>
    <iframe width="420" height="315"
            src="https://www.youtube.com/embed/VOLKJJvfAbg">
    </iframe>
</body>
</html>
