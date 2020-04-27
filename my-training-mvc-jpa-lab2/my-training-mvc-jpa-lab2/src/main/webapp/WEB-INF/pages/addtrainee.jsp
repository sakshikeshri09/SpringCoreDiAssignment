<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter Trainee Details</h1>
<form method="get" action="processadd">
<table border="2">

<tr>
<td>TraineeId</td>
<td><input type="number" name="tid"></td></tr>
<tr>

<td>TraineeName</td>
<td><input type="text" name="tname"></td>
</tr>

<tr> 
<td>TraineeLocation</td>
<td><input type="checkbox"  name="asSelected" value="Chennai">
   Chennai
  <input type="checkbox"  name="asSelected" value="Banglore">
  Banglore
  <input type="checkbox" name="asSelected" value="Pune">
  Pune
   <input type="checkbox" name="asSelected" value="Mumbai">
 Mumbai
  
</tr>
 
 <tr>
 <td>TraineeDomain</td>
 <td><select name="optionvalue" >
  <option  value="JEE">JEE</option>
  <option value=".NET">.NET</option>
  <option value="MAINFRAMES">MAINFRAMES</option> 
</select></td>
</tr>
 
 <tr>
 <td>
 <input type="submit" value="Add Trainee"></td></tr>
</table>


</form>

</body>
</html>