<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Main Page</title>
</head>
<body>
<h3>Add your tasks</h3>

<hr>

<form id="add-task-form" action="/add-task" method="post" modelAttribute="${addTask}">
    <p>What to do : <input type="text" name="task"></p>
    <p>When to do : <input type="text" name="time"></p>
    <input type="submit" value="Add">
</form>

<p>${size}</p>


<form id="get-all" action="/view-all" method="get">
    <input type="submit" value="View all">
</form>

<hr>

<form id="randomUUID" action="/uuid" method="get">
    <input type="submit" value="Get random uuid">
</form>

<form id="d4" action="/rollD4" method="get">
    <input type="submit" value="Roll D4">
</form>

<form id="d6" action="/rollD6" method="get">
    <input type="submit" value="Roll D6">
</form>

<form id="d8" action="/rollD8" method="get">
    <input type="submit" value="Roll D8">
</form>

<form id="d10" action="/rollD10" method="get">
    <input type="submit" value="Roll D10">
</form>

<form id="d12" action="/rollD12" method="get">
    <input type="submit" value="Roll D12">
</form>

<form id="d20" action="/rollD20" method="get">
    <input type="submit" value="Roll D20">
</form>


</body>
</html>