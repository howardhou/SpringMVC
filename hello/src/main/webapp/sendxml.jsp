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
            sendxml();

        });
        
        function sendxml() {
            var xmlData = "<?xml version=\"1.0\" encoding=\"utf-8\"?><user> <userid>1</userid>  <loginname>howard</loginname><password>123</password><username>dongdong</username> </user>";

            $.ajax("/user/sendxml", {
                type:"POST",
                contentType:"application/xml",
                data:xmlData,
                async:true
            });
        }
    </script>

</head>
<body>

</body>
</html>
