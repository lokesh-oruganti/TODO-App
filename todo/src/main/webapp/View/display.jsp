<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TODO APP </title>
</head>
<body>
	<h2 align="center">WELCOME TO YOUR TODO , GET THINGS DONE HERE!</h2> <br>
	<div align="center">
	<hr>
	<h3> Add Your Tasks Here </h3>
	<form action="addTask" method="post" id="addTask">
		Enter id :<input type="text" name="tid"><br>
		<br>
		Enter Task Name :<input type="text" name="intro"><br>
		<br>
		Enter Task Description :<textarea name="description" form="addTask">Enter task description here...</textarea><br>
		<br>
		Enter Priority :<input type="text" name="priority"><br>
		<br>
		<input type="submit">
		
		<hr>
	</form>
	<h3>Find the Task info through details</h3>
	<br>
	 <form action="getTask">
		Enter Task ID : <input type="text" name="tid"><br>
		<br>
		<input type="submit">
	</form>
	<h6>OR</h6>
	<form action="getTaskByName">
		Enter Task Name : <input type="text" name="intro"><br>
		<br>
		<input type="submit">
	</form>
	<h6>OR</h6>
	<form action="getTaskByPriority">
		Enter Task Priority : <input type="text" name="priority"><br>
		<br>
		<input type="submit">
	</form>
	<hr>
	<h3>Delete And Mark Your Completed Tasks </h3>
	<form action="deleteTask">
		Enter Task ID to Complete : <input type="text" name="tid"><br>
		<br>
		<input type="submit">
	</form>

	<hr>
	<h3>Update Tasks  </h3>
	<form action="updateTask">
		Enter id :<input type="text" name="tid"><br>
		<br>
		Enter Task Name :<input type="text" name="intro"><br>
		<br>
		Enter Task Description :<input type="text" name="description">
		<br>
		<br>
		Enter Priority :<input type="text" name="priority"><br>
		<br>
		<input type="submit">
	</form>
	<hr>
	</div>
</body>
</html>