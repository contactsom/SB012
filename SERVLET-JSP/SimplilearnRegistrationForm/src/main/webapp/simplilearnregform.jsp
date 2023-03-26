<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simplilearn Registration Form</title>
</head>
<body>

		<h1>Best Talent. Zero Cost. Easy Hiring</h1>
		<h2>Why Hire from SimpliRecruit?</h2>
		<h3>SimpliRecruit is the one stop platform to hire job ready, industry trained talent for your organization. </h3>
		<h3>Hire the best candidates for Digital Marketing, Data Science, Full Stack Java Developer & more with one click & at zero cost. </h3>
		
		<form action="<%= request.getContextPath()%>/simplirecruit" method = "post">
		
			First Name : <input type="text" name="firstname" required="required"/>
			<br><br>
			
			Last Name : <input type="text" name="lastname" required="required"/>
			<br><br>
			
			Email ID : <input type="email" name="emailid" required="required"/>
			<br><br>
		
			Password : <input type="password" name="password" required="required"/>
			<br><br>
			
			Gender : 
				<input type="radio" name="gender" value="Male" required="required"/> Male
				<input type="radio" name="gender" value="Female" required="required"/> Female
			<br><br>
			
			<tr>
				<td>
					<td> Timing : </td>
					<br>
					<td> 
					
					<select name="timing">
					
						<option value="01:00AM-02:00AM"> 01:00 AM - 02:00 AM</option>
						<option value="02:00AM-03:00AM"> 02:00 AM - 03:00 AM</option>
						<option value="03:00AM-04:00AM"> 03:00 AM - 04:00 AM</option>
						<option value="04:00AM-05:00AM"> 04:00 AM - 05:00 AM</option>
						<option value="05:00AM-06:00AM"> 05:00 AM - 06:00 AM</option>
					
					</select>
					
					</td>
				
				</td>
			</tr>
			<br><br>
			
			<tr>
				<td> Course </td>
				<br>
				<td>
					<input type="checkbox" name="course" value="JAVA"> JAVA <br>
					<input type="checkbox" name="course" value="JDBC"> JDBC <br>
					<input type="checkbox" name="course" value="SERVLET"> SERVLET <br>
					<input type="checkbox" name="course" value="JSP"> JSP <br>
					<input type="checkbox" name="course" value="HIBERNATE"> HIBERNATE <br>
				</td>
			</tr>
			<br><br>
			
			
			
			<tr>
				<td>
					<td> Remarks </td>
				
				</td>
				
				<td>
					<textarea rows="6" cols="20" name="remarks"></textarea>
				
				</td>
			</tr>
			
			<br><br>
			
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="Register"/>
				
				</td>
			</tr>
			
		</form>
</body>
</html>