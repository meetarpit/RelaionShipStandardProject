<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<c:url value="/save" var="action"></c:url>
<form:form action="${action}" method="post" modelAttribute="emp">
<table>
<tr>
<td>Email:</td>
<td><form:input path="email" type="text"/></td>
</tr>
<tr>
<td>Password:</td>
<td><form:input path="password" type="password"/></td>
</tr>
<tr>
<td>Gender:</td>
<td>
<form:radiobutton path="gender" value="M" label="male"/>
<form:radiobutton path="gender" value="F" label="female"/>
</td>
</tr>
<tr>
<td>Phone:</td>
<td><form:input path="phone" type="number"/></td>
</tr>
<tr>
<td>Address:</td>
<td><form:input type="text" path="address"/></td>
</tr>
<c:forEach items="${countryList}" var="c">
<tr>
<td>Department:</td>
<td>
<form:select path = "department.depId">
<c:forEach items="${c.value}" var="d">
   <form:option value="${d.depId}">${d.name}</form:option>
  </c:forEach>
</form:select>
</td>
</tr></c:forEach>
<tr>
<td><button>submit</button></td>
</tr>
</table>
</form:form>

<form:form action="saveDep" method="post" modelAttribute="dep">
<table>
<tr>
<td>Department:</td>
<td><form:input type="text" path="name"/></td>
</tr>
<tr>
<td><button>Add</button></td>
</tr>
</table>
</form:form>
</body>
</html>
