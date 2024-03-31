<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Todo List</title>
</head>
<body>
    <h1>Todo List</h1>
    <form action="TodoServlet" method="get">
        <input type="hidden" name="action" value="add">
        <input type="text" name="todoItem" placeholder="Enter todo item">
        <button type="submit">Add</button>
    </form>
    <ul>
        <c:forEach items="${todoList}" var="todoItem" varStatus="loop">
            <li>${todoItem}</li>
            <form action="TodoServlet" method="get">
                <input type="hidden" name="action" value="delete">
                <input type="hidden" name="index" value="${loop.index}">
                <button type="submit">Delete</button>
            </form>
        </c:forEach>
    </ul>
</body>
</html>
