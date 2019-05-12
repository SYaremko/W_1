<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Solomiya
  Date: 03.10.2017
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/add" method="post">
   Name <input type="text" name="name" placeholder="name">
   Author <input type="text" name="author" placeholder="author">
    <input type="submit" name="submit" value="Create">



    <table style="width: auto; height: auto; border: 1px solid olivedrab; margin-top: 20px; position: absolute;">
        <tr>
            <th>Name</th>
            <th>Author</th>
            <th>Delete</th>
            <th>Edit</th>
            <th>Choose</th>
        </tr>

        <c:forEach items="${showBook}" var="book">
            <tr>

                <td><span style="color: darkgreen">Book name:</span> ${book.name}</td>
                <td><span style="color: darkblue">Book author:</span>${book.author}</td>

                <td><a href="/deleteBook-${book.id}">Delete</a> </td>
                <td><a href="/editBook-${book.id}">Edit</a> </td>
                <td><a href="/addTobasket-${book.id}">Add</a> </td>
            </tr> </c:forEach>

    </table>
    <table style="width: auto; height: auto;float: left; margin-left: 550px; border: 1px solid olivedrab; position: absolute; margin-top: 20px">
       <caption>Basket</caption>
        <tr>
<td> </td>
            <th>Name</th>
            <th>Author</th>
        </tr>

        <c:forEach items="${baskets}" var="basket">
            <tr >
                <td><span style="color: red"> You add book:</span></td>
                <td> ${basket.book.name}</td>
                <td>${basket.book.author}</td>
            </tr> </c:forEach>

    </table>

</body>
</html>
