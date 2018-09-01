<%--
  Created by IntelliJ IDEA.
  User: howard
  Date: 18/8/26
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
${requestScope.message}
<br>

<h3><spring:message code="welcome" arguments="${requestScope.user.username}" /></h3>

<b>User ID: [${requestScope.user.userid}] </b>

<h3><spring:message code="welcome" arguments="${sessionScope.user.username}" /> , 来自Session</h3>

</body>
</html>
