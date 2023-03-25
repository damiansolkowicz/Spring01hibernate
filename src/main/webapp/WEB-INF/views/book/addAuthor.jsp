
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Author</title>
</head>
<body>

<h3>Add book</h3>

<form:form method="post" modelAttribute="author">

    First Name: <form:input path="firstName"/></br>
    Last Name: <form:input path="lastName"/></br>
    PESEL <form:input path="peselNumber"/></br>
    Email <form:input path="email"/></br>
    <form:errors path="*" /></br>

    <input type="submit" value="Add author">
</form:form>

</body>
</html>