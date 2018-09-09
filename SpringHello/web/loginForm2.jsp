<%--
  Created by IntelliJ IDEA.
  User: howard
  Date: 18/9/2
  Time: 01:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h3><spring:message code="title" /> </h3>
<br>
<form action="/user2/login" method="post">
    <table>
        <tr>
            <td><spring:message code="loginname" /> </td>
            <td><input type="text" id="loginname" name="loginname"></td>
        </tr>
        <tr>
            <td><spring:message code="password" /> </td>
            <td><input type="text" id="password" name="password"></td>
        </tr>
        <tr>
            <td><input id="submit" type="submit" value="<spring:message code="submit" />"></td>
        </tr>
    </table>
</form>
</body>
</html>
