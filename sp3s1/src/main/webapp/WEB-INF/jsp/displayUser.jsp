<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User Info</title>
</head>
<body>
	<h1>User ID: ${id}</h1>
	<br>
	<h2>Current Username: ${username}</h2>
	<h2>Current Password: ${password}</h2>
	<br>
	<form id = "idEdit" action = "idEdit" method = "post">
		<input type = "hidden" name = "id" value = "${id}">
		<label>Username:</label>
		<input type = "text" name = "username" value = "${username}">
		<br>
		<label>Password:</label>
		<input type = "text" name = "password" value = "${password}">
		<br>
		<button type="submit">Commit Changes</button>
	</form>

</body>
</html>