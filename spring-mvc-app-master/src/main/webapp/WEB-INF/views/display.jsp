<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
<h1>List of all Employees : </h1>
<c:forEach items="${el}" var="e">
       <h3>${e}</h3>
</c:forEach>
</body>
</html>