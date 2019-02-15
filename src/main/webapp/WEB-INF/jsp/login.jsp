<%--
  Created by IntelliJ IDEA.
  User: greed
  Date: 2019/2/15
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/commodity/login" method="post">
    <input type="text" id="username" name="username" placeholder="请输入用户名">
    <input type="password" id="password" name="password" placeholder="请输入密码">
    <p>${error}</p>
    <input type="submit" value="登录">
</form>
</body>
</html>
