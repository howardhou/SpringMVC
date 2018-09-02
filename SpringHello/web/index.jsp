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


  <h2>测试@ModelAttibute 的不同用法</h2>
  <a href="/registerForm1">测试 @ModelAttribute(value="")注释返回具体类的方法</a> <br><br>
  <a href="/registerForm2">测试 @ModelAttribute 注释void返回值的方法</a> <br><br>
  <a href="/registerForm3">测试 @ModelAttribute 注释返回具体类的方法</a> <br><br>
  <a href="/registerForm4">测试 @ModelAttribute 和 @RequestMapping 同时注释一个方法</a> <br><br>
  <a href="/registerForm5">测试 @ModelAttribute 注释一个方法的参数</a> <br><br>

  </body>
</html>
