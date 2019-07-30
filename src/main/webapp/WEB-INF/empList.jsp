<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>Email</th>
<th>Password</th>
<th>Gender</th>
<th>Address</th>
<th>Phone</th>
<th colspan='2'>Edit</th>
</tr>
<c:forEach items="${emp}" var="emp">
<tr>
<td>${emp.email}</td>
<td>${emp.password}</td>
<td>${emp.gender}</td>
<td>${emp.address}</td>
<td>${emp.phone}</td>
<td><a href="<c:url value="/edit/${emp.id}"/>">Edit</a></td>
<td><a href="<c:url value="/delete/${emp.id}"/>">Delete</a></td>
</tr>
</c:forEach>
</table>
<a href="<c:url value='/'/>">Create</a>
</body>
</html>