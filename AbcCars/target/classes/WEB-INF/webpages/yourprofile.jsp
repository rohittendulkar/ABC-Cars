<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC Cars || ${profile.name}'s Profile</title>
</head>
<body>
<h2> ${profile.name}'s Profile </h2>
<table border="5" cellpadding="20">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>User Name</th>
            <sec:authorize access="hasRole('USER')">
            <th>Actions</th>
            </sec:authorize>
        </tr>
        <tr>
            <td>${profile.name}</td>
            <td>${profile.email}</td>
            <td>${profile.userName}</td>
            <sec:authorize access="hasRole('USER')">
            <td>
                <a href="editprofile">Update</a>
                &nbsp;&nbsp;&nbsp;
            </td>
            </sec:authorize>
        </tr>
	</table>
<sec:authorize access="hasRole('USER')">
<h3>Post Your Car <a href="postcar">Here</a></h3>
</sec:authorize>
</body>
</html>