
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add book</title>
</head>
<body>
<h3>Add book</h3>

<%--@elvariable id="book" type="java"--%>
<form:form method="post" modelAttribute="book">
    Title <form:input path="title"/>
    Description <form:input path="description"/>
    Rating <form:input path="rating" type="number"/>
    Publisher:<form:select path="publisher" items="${publishers}"/>
    <input type="submit" value="Add book">

</form:form>

</body>
</html>