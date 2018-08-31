<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>$Title$</title>

    <script type="text/javascript" src="statics/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="statics/json2.js"></script>

    <script type="text/javascript">

        $(document).ready(function(){
            testRequestBody();

            testResponseBody();
        });

        function testRequestBody() {

            var a = JSON.stringify({id:1,name:"Spring MVC 实战"});

            $.ajax({url:"/json/testRequestBody2",
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

        function testResponseBody() {
            $.post("/json/testResponseBody", null, function (data) {
                $.each(data, function () {
                    var tr = $("<tr align='center' />");
                    $("<td />").html(this.id).appendTo(tr);
                    $("<td />").html(this.name).appendTo(tr);
                    $("<td />").html(this.author).appendTo(tr);
                    $("#booktable").append(tr);
                });
            }, "json");
        }
    </script>
<body>

<h2>测试接收JSON格式的数据</h2>
编号：<span id="id" ></span> <br>
书名：<span id="name"></span> <br>
作者：<span id="author"></span><br>

<br>
<h2>测试返回JSON格式的数据</h2>
<table id="booktable" border="1" style="border-collapse: collapse">
    <tr align="center">
        <th>编号</th>
        <th>书名</th>
        <th>作者</th>
    </tr>
</table>
</body>
</html>
