<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Student .jsp</title>
</head>
<body>

<h1> ------------------- INSERT FORM -------------------</h1>

	<form action="<%= request.getContextPath()%>/insert" method="post">
		First Name : <input type="text" name="firstname">
		<br><br>
		Last Name : <input type="text" name="lastname">
		<br><br>
		Email ID  : <input type="email" name="emailid">
		<br><br>
		Password  : <input type="password" name="password">
		<br><br>
		
		<tr>
			<td>
				<input type="submit" value="Register">
			</td>
		</tr>
	</form>
	
	<h1> ------------------- SEARCH FORM -------------------</h1>
	<form action="<%= request.getContextPath()%>/search" method="post">
		
		Search Student by Email ID  : <input type="email" name="emailid">
		
		
		<tr>
			<td>
				<input type="submit" value="Search">
			</td>
		</tr>
	</form>
	
	<h1> ------------------- UPDATE FORM -------------------</h1>
	<form action="<%= request.getContextPath()%>/update" method="post">
		
		UPDATE the student password by Email ID  : <input type="email" name="emailid">
		<br><br>
		New Password  : <input type="password" name="password">
		
		<tr>
			<td>
				<input type="submit" value="Update">
			</td>
		</tr>
	</form>
	
	<h1> ------------------- DELETE FORM -------------------</h1>
	<form action="<%= request.getContextPath()%>/delete" method="post">
		
		Delete the Student by Email ID  : <input type="email" name="emailid">
		
		
		<tr>
			<td>
				<input type="submit" value="Delete">
			</td>
		</tr>
	</form>
	
	<h1> ------------------- END OF THE FORM -------------------</h1>
	
</body>
</html>