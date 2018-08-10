<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/8/3
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/static/js/jquery.js" type="text/javascript"></script>
</head>
<body>
${list}
<input type="button" id="testbut" value="ceshi" onclick="testmethod()" style="width: 60px;height: 20px"/>
<input type="button" id="testbut" value="ceshi1" onclick="testmethod1()" style="width: 60px;height: 20px"/>
<script>
    function testmethod() {
        $.ajax({
            url:'/testajax.htm',
            type:"post",
            data:JSON.stringify({
                data1:[1,2,3],data2:[4,5,6]
            }),
            contentType:"application/json;charset=UTF-8",
            dateType:"json",
            success:function (data) {
                alert("请求成功");
            }
        })
    }
    function testmethod1() {
        $.ajax({
            url:'/testajax1.htm',
            type:"post",
            data:{
                data1:[1,2,3],data2:[4,5,6]
            },
            traditional:true,
            contentType:"application/json;charset=UTF-8",
            dateType:"json",
            success:function (data) {
                alert("请求成功");
            }
        })
    }
</script>
</body>
</html>
