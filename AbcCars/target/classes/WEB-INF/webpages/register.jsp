<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC Cars || Register</title>
</head>
<body>
<h2> Register with ABC Cars. </h2>
<form:form modelAttribute="user" action="save" method="POST">
<form:input type="text" placeholder="Enter Your Name" path="name"></form:input><br>
<form:input type="text" placeholder="Enter Email" path="email"></form:input><br>
<form:input type="text" placeholder="Enter Username" path="userName"></form:input><br>
<form:input type="password" placeholder="Enter Password" path="password"></form:input>
<br>
<br>
<input type="submit" value="submit"/>
</form:form>
</body>
</html>