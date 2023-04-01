<%@page import="com.simplilearn.beans.Customer" %>
<html>
<head>
<meta charset="UTF-8">
<title>Display.jsp</title>
</head>
<body>

	<h1> Data coming from insert.jsp</h1>
	<h1> Visible on display.jsp</h1>
	
	<%
	
		Object obj = session.getAttribute("ATR1");
		Customer customer= null;
	
			if(obj!=null){
				
				customer = (Customer) obj;
			}
			
		Object obj2 = session.getAttribute("ATR2");
		Customer customer2= null;
		
			if(obj2!=null){
					
				customer2 = (Customer) obj2;
			}
	%>
	
	<h2> CID   :  <%= customer.getCid() %> </h2>
	<h2> NAME  :  <%= customer.getCname() %> </h2>
	<h2> EMAIL :  <%= customer.getEmail() %> </h2>
	<h2> PHONE :  <%= customer.getPhone() %> </h2>
	
	<h3> ----------------------------------- </h3>
	
	<h2> CID   :  <%= customer2.getCid() %> </h2>
	<h2> NAME  :  <%= customer2.getCname() %> </h2>
	<h2> EMAIL :  <%= customer2.getEmail() %> </h2>
	<h2> PHONE :  <%= customer2.getPhone() %> </h2>
	
	
	
	
	
	
</body>
</html>