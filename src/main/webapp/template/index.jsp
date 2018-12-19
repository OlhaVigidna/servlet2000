<%--
  Created by IntelliJ IDEA.
  User: Stark
  Date: 19.12.2018
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>${msg} ${sex}!</h2>

<form name="/" method="GET">
    <input type="text" name="sex">
    <input type="text" name="msg">

    <input type="submit">

</form>
</body>
</html>
