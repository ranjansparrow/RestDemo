<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script type = "text/javascript" src = "resources/user.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add user</title>
</head>
<body>
	<form method = "POST" id="adduser" action = "#">
		<span>Name</span> <input type = "text" id = "name"/>
		<span> Salary</span> <input type = "text" id = "salary" />
		<a onClick ="iamhere()"   id ="addclickbtn"> Send Me</a>
	</form>
</body>
</html>