<%--
  Created by IntelliJ IDEA.
  User: howard
  Date: 18/9/2
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
访问request作用范围域中的loginname对象， ${requestScope.loginname} <br>

访问request作用范围域中的password对象， ${requestScope.password}<br>

访问request作用范围域中的user对象， ${requestScope.user.username} <br>
</body>
</html>
