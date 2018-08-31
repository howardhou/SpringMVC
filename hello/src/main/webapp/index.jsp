<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>$Title$</title>

    <script type="text/javascript" src="statics/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="statics/json2.js"></script>

    <script type="text/javascript">

        $(document).ready(function(){
            testRequestBody();
        });

        function testRequestBody() {

            var a = JSON.stringify({id:1,name:"Spring MVC 实战"});

            $.ajax({url:"/json/testRequestBody",
                dataType: "json",
                type: "POST",
                contentType:"application/json",
                data: JSON.stringify({id:1,name:"Spring MVC .."}),
                async: true,
                succuss: function (result) {
                    console.log(result);
                    $("#id").html(result.id);
                    $("#name").html(result.name);
                    $("#author").html(result.author);
                },
                error: function(e){
                    alert("数据发送失败")
                },
                complete: function(result){
                    console.log(result);
                    // 关闭loading
                }
            });
        }

    </script>
<body>
<h2>Hello World!</h2>
<h2>测试接收JSON格式的数据</h2>
编号：<span id="id" ></span> <br>
书名：<span id="name"></span> <br>
作者：<span id="author"></span><br>
</body>
</html>
