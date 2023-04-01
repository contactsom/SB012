<%@page import="com.simplilearn.beans.Customer" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert.jsp</title>
</head>
<body>

	<%
	
	
		Customer customer1 = new Customer();
		customer1.setCid(202);
		customer1.setCname("Ayaz Ahmed");
		customer1.setEmail("Ayaz.Ahmed@simplilearn.com");
		customer1.setPhone(9876143);
		session.setAttribute("ATR1", customer1);
		
		
		Customer customer2 = new Customer();
		customer2.setCid(203);
		customer2.setCname("Athar Zafar");
		customer2.setEmail("Athar.Zafar@simplilearn.com");
		customer2.setPhone(9176143);
		session.setAttribute("ATR2", customer2);
	
	
	%>

	<jsp:forward page="display.jsp"/>
	
	
</body>
</html>