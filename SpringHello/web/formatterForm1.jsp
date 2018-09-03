<%--
  Created by IntelliJ IDEA.
  User: dongdong
  Date: 2018/9/3
  Time: 下午6:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>测试表单数据格式化</h3>
<form action="/formatter" method="post">
<table>
    <tr>
        <td>日期类型：</td>
        <td><input name="birthday" id="birthday" type="text"/></td>
    </tr>
    <tr>
        <td>整数类型：</td>
        <td><input name="total" id="total" type="text"/></td>
    </tr>
    <tr>
        <td>百分比类型：</td>
        <td><input name="discount" id="discount" type="text"/></td>
    </tr>
    <tr>
        <td>货币类型：</td>
        <td><input name="money" id="money" type="text"/></td>
    </tr>
    <tr><td><input type="submit" dir="submit" value="提交"/></td></tr>
</table>
</form>
</body>
</html>
