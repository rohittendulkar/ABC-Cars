<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC Cars || Post Car</title>
</head>
<body>
<h2>Post Your Car</h2>
<form:form modelAttribute="car" action="savecar" method="POST">
<form:input type="text" placeholder="Car Manufacturer" path="carmanufac"></form:input><br>
<form:input type="text" placeholder="Car Model" path="carmodel"></form:input><br>
<form:input type="text" placeholder="Year" path="caryear"></form:input><br>
<form:input type="text" placeholder="Car Description" path="description"></form:input>
<br>
<br>
<input type="submit" value="submit"/>
</form:form>
</body>
</html>