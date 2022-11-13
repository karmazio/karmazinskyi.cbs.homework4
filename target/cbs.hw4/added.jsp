
<%--
  Created by IntelliJ IDEA.
  User: Ilya
  Date: 12.11.2022
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Task added</title>
</head>
<body>
<h2>What to do : ${task.task}</h2>
<h2>When to do: ${task.time}</h2>
</body>
</html>
