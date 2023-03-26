<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>
		<h1>World’s #1 Online Boot Camp. Partnering with world's leading universities and companies</h1>
		<h2>Get Certified, Get Ahead with Our Programs</h2>
		<h3>Share your contact details I will get in touch with You </h3>
		
		<form action="<%= request.getContextPath()%>/corporate-training" method = "get">
			First Name : <input type="text" name="firstname"/>
			<br><br>
			
			Last Name : <input type="text" name="lastname"/>
			<br><br>
			
			Email ID : <input type="email" name="emailid"/>
			<br><br>
		
			Password : <input type="password" name="password"/>
			<br><br>
			
			<tr>
				<td>
					<input type="submit" value="Become our Student"/>
				
				</td>
			</tr>
			
		</form>
		
</body>
</html>