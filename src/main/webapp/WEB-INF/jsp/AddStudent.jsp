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
    <title>Add Student</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <style>
        <%@include file="/css/add.css"%>

    </style>
</head>
<body>
<nav>
    <div class="menu">
        <div class="logo">
            <a href="#">Managae</a>
        </div>
        <ul>
            <li><a href="/">Home</a></li>
            <li><a href="show">List Student</a></li>
            <li><a href="add">Add</a></li>
            <li><a href="#">Feedback</a></li>
        </ul>
    </div>
</nav>

<div class="container" >
    <form action="<c:url value='/add'/>" method="post">
        <div class="row">
            <h4>Add New Student</h4>
            <div class="input-group input-group-icon">
                <input type="text" placeholder="First Name" name="firstName"/>
            </div>
            <div class="input-group input-group-icon">
                <input type="text" placeholder="Last Name" name="lastName"/>
            </div>
            <div class="input-group input-group-icon">
                <input type="email" placeholder="Email" name="email"/>
            </div>
            <div class="input-group input-group-icon">
                <input type="text" placeholder="Status" name="status"/>
            </div>
            <button type="submit">Add</button>
        </div>
    </form>
</div>

</body>
</html>
