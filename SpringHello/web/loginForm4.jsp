<%--
  Created by IntelliJ IDEA.
  User: dongdong
  Date: 2018/8/29
  Time: 下午4:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>登录页面</h3>
<br>
<form:form commandName="user" action="/user5/login" method="post">
    <table>
        <tr>
            <td><label>登录名：</label></td>
            <td><form:input path="loginname" /></td>
            <td><form:errors path="loginname" cssStyle="color:red"></form:errors></td>
        </tr>
        <tr>
            <td><label>密码：</label></td>
            <td><form:input path="password"/></td>
            <td><form:errors path="password" cssStyle="color:red"></form:errors></td>
        </tr>
        <tr>
            <td><input id="submit" type="submit" value="登录"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
