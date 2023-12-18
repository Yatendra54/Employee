<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action="save" method="post">
<label>Employee id:</label>
<input type= "text" name= "Id">
<br>
<label>Employee name:</label>
<input type= "text" name= "Name">
<br>
<label>Employee Age:</label>
<input type= "text" name= "Age">
<br>
<br>
<label>Employee Salary:</label>
<input type= "text" name= "Salary">
<br>
<input type="submit" value="submit">


</form>

<br><br><br>
<form action="read">
<input type="submit" value="fetch">
</form>

<br><br><br>
<form action="update" method="post">
<label>Employee Id:</label>
<input type= "text" name= "Id">
<br>
<label>Employee Salary:</label>
<input type= "text" name= "Salary">
<br>
<input type="submit" value="update">
</form>

<br><br><br>
<form action="delete" method="post">
<label>Employee Id:</label>
<input type= "text" name= "Id">
<br>
<input type="submit" value="delete">
</form>
</body>
</html>