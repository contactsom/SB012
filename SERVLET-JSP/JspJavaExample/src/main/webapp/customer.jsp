<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer</title>
</head>
<body>
<h1> Example to set/get the value form JAVA in to JSP </h1>

	<jsp:useBean id="cust" class="com.simplilearn.beans.Customer">
		<jsp:setProperty name="cust" property="cid" value="1001" />
		<jsp:setProperty name="cust" property="cname" value="Attish Gawali" />
		<jsp:setProperty name="cust" property="email" value="attish.gawali@simplilearn.com" />
		<jsp:setProperty name="cust" property="phone" value="987614" />
	</jsp:useBean>
	
	<h1> Get the value form JAVA in to JSP </h1>
	<h2> CID    : <jsp:getProperty name="cust" property="cid"/> </h2>
	<h2> NAME   : <jsp:getProperty name="cust" property="cname"/> </h2>
	<h2> EMAIL  : <jsp:getProperty name="cust" property="email"/> </h2>
	<h2> PHONE  : <jsp:getProperty name="cust" property="phone"/> </h2>
	
	
	<h1> Get the value form JAVA in to JSP Using JSP EL Expression </h1>
	<h2> CID    : ${cust.cid} </h2>
	<h2> NAME   : ${cust.cname} </h2>
	<h2> EMAIL  : ${cust.email} </h2>
	<h2> PHONE  : ${cust.phone} </h2>
	
		
	
</body>
</html>