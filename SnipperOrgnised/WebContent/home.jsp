Welcome to home page......
<%@page import="java.util.ArrayList"%>
<br>
<br>
<%
	if (request.getAttribute("data") != null) {
		ArrayList<String> al = (ArrayList<String>) request.getAttribute("data");
		for (String firstName : al) {
			out.println(firstName);
		}
	}
%>
<br>
<br>

<form action="logout">

	<input type="submit" value="Logout" name="Lout">

</form>
<br>

<form action="showlist">

	<input type="submit" value="Show List">

</form>


<br>

<%
	if (request.getAttribute("elsemsg") != null) {

		out.println(request.getAttribute("elsemsg"));

	}
%>

<br>

<%
	if (request.getAttribute("Done") != null) {

		out.println(request.getAttribute("Done"));

	}
%>

<br>

<%
	if (request.getAttribute("sorryfromDeleteController") != null) {

		out.println(request.getAttribute("sorryfromDeleteController"));

	}
%>

