<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Modify Operation</h1>
<form >
<table border="2">
<tr>
<td>Please enter trainee Id</td>
<td><input type="number" name="tid"></td>
<td><input type="submit" value="modify" ></td></tr>

<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr></table></form>
<form method="get" action="modifydone">
<table border="2">
<tr><td><h1>Trainee details</h1></td></tr>
 <tr><td>TrainingId</td><td><input type="number" name="tid" ></td></tr> 
 <tr><td>TrainingName</td><td><input type="text" name="tname"></td></tr> 
  <tr><td>TrainingDomain</td><td><input type="text" name="tdomain" ></td></tr> 
   <tr><td>TrainingLocation</td><td><input type="text" name="tlocation" ></td></tr>
   <tr><td><input type="submit" value="update"> 
</table>
</form>


</body>
</html>