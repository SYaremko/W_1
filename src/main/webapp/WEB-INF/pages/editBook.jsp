<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Solomiya
  Date: 03.10.2017
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sf:form  modelAttribute="editBook" method="POST" >
    <span>Name</span>
    <sf:input type="text" path="name" placeholder="name"/>
    <span>Author</span>
    <sf:input type="text" path="author" placeholder="author"/>
    <input type="submit" name="submit" value="Update">
</sf:form>
</body>
</html>
