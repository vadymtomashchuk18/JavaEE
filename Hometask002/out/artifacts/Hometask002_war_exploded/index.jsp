<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: Вадим
  Date: 31.01.2017
  Time: 21:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
Date d = new Date();
SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
System.out.println(format1.format(d));
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Real Date/Time</title>
  </head>
  <body>
    <h1><c:out value="Current data/time:"></c:out>
    <%=format1.format(d)%></h1>
  </body>
</html>
