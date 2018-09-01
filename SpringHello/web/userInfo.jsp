<%--
  Created by IntelliJ IDEA.
  User: howard
  Date: 18/9/2
  Time: 00:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>修改用户信息页面</h3>
<br>
<p> Spring MVC form 标签默认绑定的 Model 是 command, 如果不想用默认的command， 可以使用 form 标签下的 commandName 属性修改将要使用的 Model
</p>
<form:form commandName="user" action="update" method="post">
    <table>
        <tr>
            <td><label>姓名：</label></td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td><label>性别：</label></td>
            <td><form:input  path="sex"/></td>
        </tr>
        <tr>
            <td><label>年龄：</label></td>
            <td><form:input  path="age"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
