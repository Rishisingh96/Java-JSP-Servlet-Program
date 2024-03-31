<%@ page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notes</title>

 <%@include file="Component/allCSSLink.jsp"%>
</head>
<body>
    <div class = "container">
    <%@include file="Component/navbar.jsp"%>
	<div>

	<h1>This is Add Notes</h1>

<!--this is address form -->

     <form action ="SaveNoteServlet" method = "post">
       <div class="mb-3">
         <label for="noteTitle" class="form-label">Note Title</label>
         <input
         name = "title"
         type="text"
         class="form-control"
         id="noteTitle"
         aria-describedby="titleHelp"
         placeholder = "Enter here"
          required >

         <div id="titleHelp" class="form-text">Enter a title for your note.</div>
       </div>
       <div class="mb-3">
         <label for="noteContent" class="form-label">Note Content</label>
         <textarea
         name = "content"
         class="form-control"
         id="noteContent"
         rows="5"
         required></textarea>
       </div>
       <button type="submit" class="btn btn-primary">Save Note</button>
     </form>


</body>
</html>
</html>