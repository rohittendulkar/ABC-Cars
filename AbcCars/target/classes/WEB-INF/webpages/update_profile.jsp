<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC Cars || Update Profile Form</title>
</head>
<body>
<h2>Update Your Profile</h2>
<form:form modelAttribute="user" action="userupdate" method="POST">
<form:input type="hidden" path="id"></form:input><br>
<form:input type="hidden" placeholder="Enter Username" path="userName"></form:input><br><br>
Name: <form:input type="text" placeholder="Enter Your Name" path="name"></form:input><br><br>
Email: <form:input type="text" placeholder="Enter Email" path="email"></form:input><br>
<form:input type="hidden" path="password"></form:input><br>
<br>
<br>
<input type="submit" value="submit"/>
</form:form>
</body>
</html>