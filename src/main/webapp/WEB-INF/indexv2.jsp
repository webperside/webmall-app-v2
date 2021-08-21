<%@ page import="com.webperside.webmallappv2.entity.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: hamid
  Date: 8/20/21
  Time: 8:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<%
    List<User> users =(List<User>) request.getAttribute("users");
    for(User user : users){

%>
<p><%=user.getUsername()%></p>
<%
    }

%>
</body>
</html>
