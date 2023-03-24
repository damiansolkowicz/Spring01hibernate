<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" modelAttribute="student">
    Imię:<form:input path="firstName" /><br>
    Nazwisko:<form:input path="lastName" /><br>
    Płeć: <form:radiobuttons items="${genders}" path="gender" /><br>
    Kraj:<form:select path="country" items="${countries}" /><br>
    Notatki:<form:textarea path="notes" /><br>
    Lista mailingowa:<form:checkbox path="mailingList"/><br>
    Umiejętności:<form:select path="programmingSkills" items="${programmingSkills}" multiple="true"/><br>
    Hobby: <form:checkboxes items="${hobbies}" path="hobbies" /><br>
    <input type="submit" value="Zapisz">
</form:form>
</body>
</html>