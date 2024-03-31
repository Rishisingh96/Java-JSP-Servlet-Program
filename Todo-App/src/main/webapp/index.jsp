
<%@page import="com.DB.DBConnect"%>
<%@ page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index</title>
<%@include file="Component/allCSSLink.jsp"%>

</head>
<body>

	 <% Connection conn = DBConnect.getConn();
	out.print(conn);
	%> 
	<%@include file="Component/navbar.jsp"%>
	<h1 class="text-center text-success">Rishi singh ToDo APP</h1>

	<div class="container">
		<table class="table table-striped" border="1px">
			 <thead class="bg-success text-white">
				<tr class="bg-success text-white">
					<th scope="col">ID</th>
					<th scope="col">Nq</th>
					<th scope="col">Todo</th>
					<th scope="col">Status</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td>Python Course</td>
					<td><span class="badge bg-success">Pending</span></td>
					<td><a href="#" class="btn btn-sm btn-success">Edit</a> <a
						href="#" class="btn btn-sm btn-danger">Delete</a></td>
				</tr>

			</tbody>
		</table>
	</div>

	<%-- <%@include file="Component/footer.jsp" %>  --%>

</body>
</html>