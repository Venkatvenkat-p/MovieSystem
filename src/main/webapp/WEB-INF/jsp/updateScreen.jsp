<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Update Screen</title>
</head>
<body>
    <h1>Update Screen</h1>
    
    <form:form action="/updateScreen/${ScreenRecord.screen_id}" method="post" modelAttribute="ScreenRecord">
        <input type="hidden" name="screen_id" value="${ScreenRecord.screen_id}" />

        <label for="screenName">Screen Name:</label>
        <form:input path="screenName" id="screenName" value="${ScreenRecord.screenName}" required="true" />
        
    
        
        <input type="submit" value="Update Screen" />
    </form:form>

    <a href="/theatre/reportScreen" class="back-link">Back to Screen Report</a>
</body>
</html>
