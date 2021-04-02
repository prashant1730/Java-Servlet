Welcome to List Of Blood Donor Page........!!
<br>
<br>
<br>


<%@page import="com.jbk.entity.BloodInfo"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<%
		ArrayList<BloodInfo> arrayList_user = (ArrayList<BloodInfo>) request.getAttribute("ListOfBloodDonar");
	%>
	<div class="container">

		<h4>Blood Donor List</h4>
		<div class="col-sm-8">
			<table class="table table-bordered">
				<tr>
					<th>Id</th>
					<th>Username</th>
					<th>Blood Group</th>
					<th>Weight</th>
					<th>Contact Number</th>
					<th>Location</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>

				<c:forEach var="user" items="${ListOfBloodDonar}">
					<tr>
						<td><c:out value="${user.id}" /></td>
						<td><c:out value="${user.username}" /></td>
						<td><c:out value="${user.blood_Group}" /></td>
						<td><c:out value="${user.weight}" /></td>
						<td><c:out value="${user.contact_Number}" /></td>
						<td><c:out value="${user.location}" /></td>
						<td><a href="edit?id=<c:out value='${user.id}' />"
							class="btn btn-info">Edit</a></td>
						<td><a href="delete?id=<c:out value='${user.id}' />"
							class="btn btn-warning">Delete</a></td>
					</tr>
				</c:forEach>
			</table>

			<br> <br>
			<form action="lo">

				<input type="submit" value="LOGOUT">

			</form>
		</div>

	</div>


</body>
</html>