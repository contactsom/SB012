<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display</title>
</head>
<body>

	<h1> Congratulation !!! You are registered in to Simplilearn Online Courses - Certification Courses</h1>
	
	FIRST NAME <%= request.getAttribute("FNAME") %>
	<br>
	LAST NAME <%= request.getAttribute("LNAME") %>
	<br>
	EMAIL <%= request.getAttribute("EMAIL") %>
	<br>
	PASSWORD <%= request.getAttribute("PASSWORD") %>
	<br>

</body>
</html>