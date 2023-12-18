<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="save" method="post"> 
<label>enter id</label>
<input type="text" name= "id">
<br>
<label>enter name</label>
<input type="text" name= "name">
<br>
<input type="submit" value= "register">
</form>

<br><br> <br><br>

<form action="update" method="post"> 
<label>enter id</label>
<input type="text" name= "id">
<br>
<label>enter name</label>
<input type="text" name= "name">
<br>
<input type="submit" value= "update">
</form>
<br><br> <br><br>
<form action="delete" method="post"> 
<label>enter id</label>
<input type="text" name= "id">
<br>
<input type="submit" value= "delete">
</form>
<br><br> <br><br>

<form action="read" method="get">
<input type="submit" value= "fetch">
</form>
</body>
</html>