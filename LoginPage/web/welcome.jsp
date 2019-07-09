<%--
  Created by IntelliJ IDEA.
  User: patch-junint-7
  Date: 09-07-2019
  Time: 05:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome Page</title>
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
    Welcome ${username}
    <a href="videos.jsp">Click here to go to videos</a><br/><br/>
    <form action="logout">
        <input type="submit" value="Logout"/>
    </form>


</body>
</html>
