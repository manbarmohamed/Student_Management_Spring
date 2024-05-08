<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>

<h2>HTML Table</h2>

<table>
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>Status</th>
        <th>Action</th>
    </tr>

    <c:forEach items="${shows}" var="std">
        <tr>
            <td>${std.id_Student}</td>
            <td>${std.first_name}</td>
            <td>${std.last_name}</td>
            <td>${std.email}</td>
            <td>${std.status}</td>
            <td>
                <a href="add">add</a>

                <a href="delete/${std.id_Student}">delete</a>
                <a href="edit?id=${std.id_Student}">edite</a>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
