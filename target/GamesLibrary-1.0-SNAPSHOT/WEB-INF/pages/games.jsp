<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 09.07.2020
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Films</h2>
<table>
    <tr>
        <th>id</th>
        <th>title</th>
        <th>year</th>
        <th>genre</th>
        <th>played</th>
        <th>action</th>
    </tr>
    <c:forEach var="game" items="${gamesList}">
        <tr>
            <td>${game.id}</td>
            <td>${game.title}</td>
            <td>${game.year}</td>
            <td>${game.genre}</td>
            <td>${game.played}</td>
            <td>
                <a href="/edit/${game.id}">edit</a>
                <a href="/delete/${game.id}">delete</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
