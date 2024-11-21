<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jdbc servlet</title>
</head>
<body>
<form action="send" method="post">
<label>Name</label><br>
<input type="text" name="name" id="name"><br>
<br>
<label>Email</label><br>
<input type="email" name="email" id="mail"><br>
<br>
<label>Phone Number</label><br>
<input type="number" name="contactNumber" id="phone"><br>
<br>
<label>Address</label><br>
<input type="text" name="address" id="address"><br>
<br>
<input type="submit" value="submit">
</form>
</body>
</html>