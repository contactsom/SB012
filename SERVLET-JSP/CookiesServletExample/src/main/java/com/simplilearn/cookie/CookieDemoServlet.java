package com.simplilearn.cookie;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CookieDemoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("START-************CookieDemoServlet************");

		String email = (String) request.getParameter("email");
		Cookie[] cookies = request.getCookies();

		System.out.println("Email : " + email);

		if (cookies != null) {

			if (cookies.length != 0) {

				for (Cookie cookie : cookies) {

					String cookiename = cookie.getName();

					System.out.println("Cookie Name : " + cookiename);

					if (cookiename.equalsIgnoreCase("JSESSIONID")) {
						System.out.println(" Then You are the OLD USER");
					} else {
						System.out.println(" Then You are the NEW USER");
					}

					String cookieValue = cookie.getValue();
					int cookieage = cookie.getMaxAge();
					String cookieDomain = cookie.getDomain();

					System.out.println(" COOKIE VALUE : " + cookieValue);
					System.out.println(" COOKIE AGE : " + cookieage);
					System.out.println(" COOKIE DOMAIN : " + cookieDomain);

				}

			} else {

				System.err.println("****Cookies Not Found ****");
			}
		} else {
			System.err.println("****Cookies Not Found ****");
		}
		
		
		Cookie c1 = new Cookie("EMAIL",email);
		response.addCookie(c1);
		
		Cookie c2 = new Cookie("PHONE","9876143");
		response.addCookie(c2);
		

		RequestDispatcher   rd = request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
		
		
		System.out.println("END-************CookieDemoServlet************");

	}
}
