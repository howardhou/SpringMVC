<%--
  Created by IntelliJ IDEA.
  User: dongdong
  Date: 2018/9/3
  Time: 下午6:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>测试表单数据格式化</h3>
<form:form action="test" method="post" commandName="formatter">
    <table>
        <tr>
            <td>日期类型：</td>
            <td><form:input path="birthday"/></td>
        </tr>
        <tr>
            <td>整数类型：</td>
            <td><form:input path="total"/></td>
        </tr>
        <tr>
            <td>百分比类型：</td>
            <td><form:input path="discount"/></td>
        </tr>
        <tr>
            <td>货币类型：</td>
            <td><form:input path="money" /></td>
        </tr>
    </table>
</form:form>
</body>
</html>
