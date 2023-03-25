<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: damian
  Date: 25.03.2023
  Time: 12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>Nazwa Pola</th>
        <th>Nazwa Błędu</th>
    </tr>
    <c:forEach var="error" items="${Errors}">
        <tr>
            <td>${error.propertyPath}</td>
            <td>${error.message}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
