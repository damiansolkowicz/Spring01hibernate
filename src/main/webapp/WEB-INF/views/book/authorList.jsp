<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>All books</title>
</head>
<body>

<table>
  <tr>
    <th>Lp.</th>
    <th>Title</th>
    <th>Rating</th>
    <th>Description</th>
    <th>Publisher</th>
    <th>Authors</th>
  </tr>
  <c:forEach items="${author}" var="author">
    <tr>
      <td>${author.firstName}</td>
      <td>${author.lastName}</td>
      <td>${author.peselNumber}</td>
      <td>${author.email}</td>

      <td><a href="edit?id=${book.id}">Edit</a></td>
      <td><a href="remove?id=${book.id}" onclick="return confirm('Are you sure?')">Remove</a></td>
    </tr>
  </c:forEach>
</table>

</body>
</html>