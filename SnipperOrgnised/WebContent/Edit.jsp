<%@page import="com.jbk.entity.BloodInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		ArrayList<BloodInfo> arrayList_user = (ArrayList<BloodInfo>) request.getAttribute("List");
	%>
	<div class="container">
		<center>
			<h3>Update Form...</h3>
		</center>
		<div class="row">
			<!-- 12  4 8 -->


			<%
				for (BloodInfo user : arrayList_user) {
			%>
			<div class="col-sm-8">
				<form id="reg-form" action="update" method="post">

					<div class="form-group">
						<lable class="form-label"> Username </lable>
						<input type="text" class="form-control"
							value="<%out.println(user.getUsername());%>" name="username"
							id="username " required> <input type="text"
							value="<%out.println(user.getId());%>" name="id">
					</div>

					<div class="form-group">
						<lable class="form-label"> Blood Group </lable>
						<input type="text" class="form-control"
							value="<%out.println(user.getBlood_Group());%>"
							name="blood_group" id="password" required>
					</div>

					<div class="form-group">
						<lable class="form-label"> Weight</lable>
						<input type="text" class="form-control"
							value="<%out.println(user.getWeight());%>" name="weight"
							id="city" required>
					</div>
					<div class="form-group">
						<lable class="form-label"> Contact Number</lable>
						<input type="text" class="form-control"
							value="<%out.println(user.getContact_Number());%>"
							name="contact_Number" id="city" required>
					</div>
					<div class="form-group">
						<lable class="form-label"> Location </lable>
						<input type="text" class="form-control"
							value="<%out.println(user.getLocation());%>" name="location"
							id="city" required>
					</div>
					<div class="form-group">
						<lable class="form-label"> Password</lable>
						<input type="password" class="form-control"
							value="<%out.println(user.getPassword());%>" name="password"
							id="city" required>
					</div>


					<%
						}
					%>

					<br>
					<div class="form-group">

						<input type="submit" id="submit-btn" value="Update" name="submit"
							class="btn btn-info"> <input type="reset" id="reset"
							value="Reset" name="reset" class="btn btn-warning">
					</div>


				</form>

			</div>
		</div>
	</div>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
</body>
</html>

<%
	if (request.getAttribute("FailMsgFromUpdateController") != null) {
		out.println(request.getAttribute("FailMsgFromUpdateController"));
	}
%>