<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form action="/books">
    <input type="text" name="name" />
    <input type="submit" value="Add">
</form>
<c:forEach items="${books}" var="book">
    <span>${book.name}</span><br>
</c:forEach>