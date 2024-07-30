<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <h1>Simple Calculator</h1>
    <form action="Calculator" method="post">
        <input type="number" name="num1" required placeholder="Number 1" />
        <input type="number" name="num2" required placeholder="Number 2" />
        <input type="submit" value="Add" />
    </form>

    <c:if test="${not empty result}">
        <h2>Result: ${result}</h2>
    </c:if>

    <c:if test="${not empty error}">
        <h2 style="color: red;">Error: ${error}</h2>
    </c:if>
</body>
</html>
