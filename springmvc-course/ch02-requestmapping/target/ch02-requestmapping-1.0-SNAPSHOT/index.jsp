<%--
  Created by IntelliJ IDEA.
  User: Kansx
  Date: 2020/9/30
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>提交参数给Controller</p>

    <form action="receiveproperty.do" method="post">
        姓名:<input type="text" name="name"><br/>
        年龄:<input type="text" name="age"><br/>
        <input type="submit" value="提交参数">

    </form>
</body>
</html>
