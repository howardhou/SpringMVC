<%--
  Created by IntelliJ IDEA.
  User: howard
  Date: 18/9/2
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>注册页面</h3>
<br>
<form action="/user4/register" method="post">
    <table>
        <tr>
            <td><label>登录名：</label></td>
            <td><input type="text" id="loginname" name="loginname"></td>
        </tr>
        <tr>
            <td><label>生日：</label></td>
            <td><input type="text" id="birthday" name="birthday"></td>
        </tr>
        <tr>
            <td><input id="submit" type="submit" value="注册"></td>
        </tr>
    </table>
</form>
</body>
</html>
