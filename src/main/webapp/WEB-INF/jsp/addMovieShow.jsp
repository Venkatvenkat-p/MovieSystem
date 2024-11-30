<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Movie Show</title>
</head>
<body>
    <h1>Add Movie Show</h1>
    
    <form action="${pageContext.request.contextPath}/theatre/addMovieShow/${screenId}" method="post">
        <label for="movieShowId">Movie Show ID:</label>
        <input type="text" name="id" value="${MovieShow.id}" readonly /><br/>
        
        <label for="movieName">Movie Name:</label>
        <input type="text" name="movieName" /><br/>
        
        <label for="showTime">Show Time:</label>
        <input type="text" name="showTime" /><br/>
        
        <input type="submit" value="Add Movie Show"/>
    </form>
    
    <a href="${pageContext.request.contextPath}/theatre/showMovieShows/${screenId}">Back to Movie Shows List</a>
</body>
</html>