<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ABC Cars || Login</title>
</head>
<body>
<h2>Login</h2>
<c:if test="${error_string != null}">
        <p>
            <span> ${error_string} </span>
        </p>
    </c:if>
    
<c:url var="postlogin" value="/login"/>
    <form action="${postlogin}" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <p>
      <label for="username">User:</label>
      <input type="text" name="username" value=""></input>
    </p>
    <p>
      <label for="password">Password:</label>
      <input type="text" name="password" value=""></input>
    </p>
      <input type="submit" name="Login" value="Login"></input>
    </form>
</body>
</html>