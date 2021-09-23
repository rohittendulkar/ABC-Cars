<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car List</title>
</head>
<body>
<h2>Manage Posted Cars</h2>
<table border="5" cellpadding="20">
        <tr>
            <th>Car Manufacterer</th>
            <th>Model</th>
            <th>Year</th>
            <th>Description</th>
            <th>Seller</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${list}" var="carlist">
        <tr>
            <td>${carlist.carmanufac}</td>
            <td>${carlist.carmodel}</td>
            <td>${carlist.caryear}</td>
            <td>${carlist.description}</td>
            <td>${carlist.seller}</td>
            <td><a href="deletecar?id=${carlist.id}">Delete</a></td>
        </tr>
        </c:forEach>
	</table>
</body>
</html>