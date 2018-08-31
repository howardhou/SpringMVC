<%--
  Created by IntelliJ IDEA.
  User: howard
  Date: 18/8/26
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  test  : ${requestScope.username}
  <br>

  <h2>数据绑定测试</h2>
  <a href="/pathVariableTest/23">测试 @PathVariable 参数</a> <br><br>
  <a href="/requestHeaderTest">测试 @RequestHeader 参数</a> <br><br>
  <a href="/cookieValueTest">测试 @CookieValue 参数</a> <br><br>

  $END$
  </body>
</html>
