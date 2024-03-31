<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ page import="java.sql.Connection" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Add ToDo</title>
    <%@include file="Component/allCSSLink.jsp"%>
</head>
<body style="background-color: #f0f1f2;">
<%@include file="Component/navbar.jsp"%>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-body">
                    <h3 class="text-center text-success">Add TODO</h3>
                    <form action="/Todo-App/add_todo" method="post"> <!-- Updated action URL -->
                        <div class="form-group m-2">
                            <label for="exampleInputEmail1" class="form-label">Name</label>
                            <input type="text" class="form-control" id="exampleInputEmail1"
                                   aria-describedby="emailHelp" name="username">
                        </div>
                        <div class="form-group m-2">
                            <label for="exampleInputEmail1" class="form-label">TODO</label>
                            <input type="text" class="form-control" id="exampleInputEmail1"
                                   aria-describedby="emailHelp" name="todo">
                        </div>
                        <div class="form-group m-2">
                            <label for="inputState" class="form-label">STATUS</label>
                            <select id="inputState" class="form-control" name="status">
                                <option selected disabled>---select---</option>
                                <option value="Pending">Pending</option>
                                <option value="Complete">Complete</option> <!-- Corrected value -->
                            </select>
                        </div>
                        <div class="text-center">
                            <button type="submit" class="btn btn-primary">ADD</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
