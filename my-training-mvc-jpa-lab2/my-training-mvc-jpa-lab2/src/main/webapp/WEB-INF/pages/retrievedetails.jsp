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

<h1>Retrieve Operation</h1>
Trainee details
<table border="2">
<tr><th>TrainingId</th>
<th>TrainingName</th>
<th>TrainingDomain</th>
<th>TrainingLocation</th></tr>
<tr>
<th>Id:${trainee.traineeId }</th>
<th>Name:${trainee.traineeName }</th>
<th>Domain:${trainee.traineeDomain }</th>
<th>Location:${trainee.traineeLocation }</th>


</tr>
</table>
</body>
</html>