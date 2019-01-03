<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Admin.jsp</h1>
	<sf:form action="${pageContext.request.contextPath}/admin/save" method="post" commandName="admin">
		<table>
			<tr>
				<td>Nombre</td>
				<td><sf:input path="nombre" type="text"/></td>
				
			</tr>
			<tr>
				<td>Cargo:</td>
				<td><sf:input path="cargo" type="text"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Registrar"></td>
			</tr>
		
		</table>
		
	</sf:form>
	<c:out value="${resultado}"></c:out>
</body>
</html>