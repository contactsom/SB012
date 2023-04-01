<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h1> Congratulation !!! We found you in Simplilearn </h1>
	
	FIRST NAME <%= request.getAttribute("FIRST_NAME") %>
	<br>
	LAST NAME <%= request.getAttribute("LAST_NAME") %>
	<br>
	EMAIL <%= request.getAttribute("EMAIL") %>
	<br>
	PASSWORD <%= request.getAttribute("PASSWORD") %>
	<br>
	
</body>
</html>