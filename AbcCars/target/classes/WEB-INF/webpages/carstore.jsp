<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC Cars</title>
</head>
<body>
	<sec:authorize access="hasRole('ADMIN')">
	<h2>Admin Panel</h2>
	</sec:authorize>
	
	<sec:authorize access="hasRole('USER')">
	<h2>User Dashboard</h2>
	</sec:authorize>
	
	<sec:authorize access="hasRole('ADMIN')">
	<a href="manageusers">Manage Users</a>
	</sec:authorize>
	
	<sec:authorize access="hasAnyRole('ADMIN','USER')">
	<a href="yourprofile">Your Profile</a>
	</sec:authorize>
	
	<sec:authorize access="hasAnyRole('ADMIN','USER')">
	<a href="search">Search for Cars</a>
	</sec:authorize>
	
	<form action="logout" method="post">
	       <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	        <input type="submit" name="Logout" value="Logout"></input>
	</form>
</body>
</html>