<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Main Page</title>
</head>
<body>
<form id="add-task-form" action="/add-task" method="post" modelAttribute="${task}">
    <p>What to do : <input type="text" name="task"></p>
    <p>When to do : <input type="text" name="time"></p>
    <input type="submit" value="Add">
</form>

<p>Number of tasks : ${size}</p>


<form id="get-all" action="/view-all" method="get">
    <input type="submit" value="View all">
</form>


</body>
</html>