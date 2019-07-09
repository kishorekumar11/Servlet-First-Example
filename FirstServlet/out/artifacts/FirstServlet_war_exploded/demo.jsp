
<%--
  Created by IntelliJ IDEA.
  User: patch-junint-7
  Date: 09-07-2019
  Time: 02:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Scanner" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#deb887">
    <%
        //int s = 1/0;
    int num1 = Integer.parseInt(request.getParameter("num1"));
    int num2 = Integer.parseInt(request.getParameter("num2"));
    int sum = num1+num2;
    //request.getRequestDispatcher("index.jsp").forward(request,response);
    %>

    <%!
        public int square(int num){
            return num*num;
        }
    %>

    <h1><%=
        square(sum)
    %></h1>


</body>
</html>
