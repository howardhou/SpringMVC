<%--
  Created by IntelliJ IDEA.
  User: howard
  Date: 18/9/1
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script type="text/javascript" src="statics/jquery-3.3.1.min.js"></script>

    <script type="text/javascript">
        $(document).ready(function(){

            readxml();
        });

        function readxml() {
            $.ajax("/user/readxml",{
                // 预期服务器返回的数据类型，如： xml, json, text等
                //dataType:"text",
                dataType:"xml",
                // dataType:"json",
                type:"POST",
                async:true,
                // 发送信息至服务器时，内容编码类型，
                contentType:"application/json",
                accept:"application/json",
                success:function (xml) {
                    console.log(xml);
                },
                error:function (e) {
                    alert("数据接收失败");
                }
            });
        }
    </script>
</head>
<body>

</body>
</html>
