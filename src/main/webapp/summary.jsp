<%--
  Created by IntelliJ IDEA.
  User: Ilya
  Date: 12.11.2022
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>All tasks</title>
</head>
<body>


<c:forEach var="task" items="${tasks}" varStatus="loopCounter">
    <p>
        <c:out value="Task ${loopCounter.count} : "/>
        <c:out value="${task.task} to de done at ${task.time}"/>
    </p>
</c:forEach>

<form id="back" action="/back-to-main" method="get">
    <input type="submit" value="Bak to main">
</form>

</body>
</html>
