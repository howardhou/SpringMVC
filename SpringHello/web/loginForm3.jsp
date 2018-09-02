<%--
  Created by IntelliJ IDEA.
  User: howard
  Date: 18/9/2
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%--用户可以选择切换的语言环境--%>
<a href="/user2/loginForm2?request_locale=zh_CN">中文</a> | <a href="/user2/loginForm2?request_locale=en_US">English</a>
<br>
<h3><spring:message code="title" /> </h3>
<br>
<form action="login" method="post">
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
