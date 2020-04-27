<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Trainee Details</h1>
<table border="2">

<tr><th>TrainingId</th>
<th>TrainingName</th>
<th>TrainingDomain</th>
<th>TrainingLocation</th></tr>
<c:forEach items="${traineelist}" var="trainee">
<tr>
<th>${trainee.traineeId }</th>
<th>${trainee.traineeName }</th>
<th>${trainee.traineeDomain }</th>
<th>${trainee.traineeLocation }</th>
</tr></c:forEach></table>

</body>
</html>