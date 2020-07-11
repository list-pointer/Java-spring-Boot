<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="utf-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Test App</title>
</head>
<body>
<h1>Test Application Spring Boot MVC</h1>
<form action="addAlien" method="post">
    <label>Enter ID</label>
    <input type="text" name="id">
    <br><br>
    <label>Enter Name </label>
    <input type="text" name="uname">
    <br><br>
    <input type="submit">
    <br><br>
</form>
<hr>
<br><br>
<form action="getAlien" method="post">
    <label>Enter ID</label>
    <input type="text" name="id">
    <br><br>
    <input type="submit">
</form>
<hr>
<br><br>
<form action="getAlienByName" method="post">
    <label>Enter Name</label>
    <input type="text" name="uname">
    <br><br>
    <input type="submit">
</form>
</body>
</html>