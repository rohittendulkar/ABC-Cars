<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Results</title>
</head>
<body>
<h2>Search Results</h2>
<table border="5" cellpadding="20">
        <tr>
            <th>Car Manufacterer</th>
            <th>Model</th>
            <th>Year</th>
            <th>Description</th>
            <th>Seller</th>
        </tr>
        <c:forEach items="${searchresult}" var="car">
        <tr>
            <td>${car.carmanufac}</td>
            <td>${car.carmodel}</td>
            <td>${car.caryear}</td>
            <td>${car.description}</td>
            <td>${car.seller}</td>
        </tr>
        </c:forEach>
	</table>
</body>
</html>