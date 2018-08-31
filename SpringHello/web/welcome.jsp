<%--
  Created by IntelliJ IDEA.
  User: howard
  Date: 18/8/26
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome</title>
</head>
<body>
${requestScope.message}
<br>

<h3>欢迎 [${requestScope.user.username}] 登录</h3>

<b>User ID: [${requestScope.user.userid}] </b>

<h3>欢迎 [${sessionScope.user.username}] 登录, 来自Session</h3>

</body>
</html>
