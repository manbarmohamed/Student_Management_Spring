<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 08/05/2024
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>HTML Forms</h2>

<form action="<c:url value='/add'/>" method="post">
    <label for="fname">First name:</label><br>
    <input type="text" id="fname" name="firstName"><br>
    <label for="lname">Last name:</label><br>
    <input type="text" id="lname" name="lastName"><br><br>

    <label for="email">Email:</label><br>
    <input type="text" id="email" name="email"><br><br>
    <label for="st">Status:</label><br>
    <input type="text" id="st" name="status"><br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
