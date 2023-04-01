<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> This is First Jakarta Server Pages Example </h1>
	<h1> Formally also known as JavaServer Pages </h1>
	
	<h1> ----- The JSP declaration tag is used to declare fields and methods. -----  </h1>
	<%!
		int a = 10;
		int b = 20;
		String course="Jakarta Server Pages (JSP)";
		
		public int getSum(){
			return a+b;
		}
	
		public String getCourse(){
			return course;
		}
	%>
	
	<h2> ----- JSP Calling JAVA Code Using Scritplet JSP TAG -----  </h2>
	
	<%
		out.print("<html>");
		out.print("<body>");
	
		out.print("<p>Value of a from declaration tag   ::"+ a+ "</p>");
		out.print("<p>Value of b from declaration tag   ::"+ b+ "</p>");
		out.print("<p>Sum of value a and b is   ::"+ getSum() + "</p>");
		out.print("<p>We are learning    ::"+ getCourse() + "</p>");
		
		out.print("</body>");
		out.print("</html>");
	
	%>
	
	<h2> ----- JSP Calling JAVA Code Using JSP Expression TAG -----  </h2>
	
	Value of a from declaration tag   :: <%=a %>
	<br>
	Value of b from declaration tag   :: <%=b %>
	<br>
	Sum of value a and b is   :: <%=getSum() %>
	<br>
	We are learning    :: <%=getCourse() %>
	
	
	
	
</body>
</html>