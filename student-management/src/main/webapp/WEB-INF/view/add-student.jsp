<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>Add Student</h3>
		<!-- Create a spring form where user can enter student data -->

		<form:form action="save-student" modelAttribute="student" method="GET">
			<p>
				<label>Name: </label>
				<form:input path="name" />
			</p>

			<p>
				<label>Mobile: </label>
				<form:input path="mobile" />
			</p>

			<p>
				<label>Country: </label>
				<form:input path="country" />
			</p>

			<input type="submit" value="Submit">
		</form:form>
	</div>
</body>
</html>