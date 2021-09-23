<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC Cars ADMIN || Manage Users</title>
</head>
<body>
<h2>Manage Users</h2>
<table border="5" cellpadding="20">
        <tr>
            <th>Name</th>
            <th>Username</th>
            <th>Email</th>
            <th>Actions</th>
        </tr>
        <c:forEach items="${userlist}" var="list">
        <tr>
            <td>${list.name}</td>
            <td>${list.userName}</td>
            <td>${list.email}</td>
            <td><a href="delete?id=${list.id}">Delete</a></td>
        </tr>
        </c:forEach>
	</table>
	<h2>Manage Posted Cars <a href="listcars">Here</a></h2>
</body>
</html>