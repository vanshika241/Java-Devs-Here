package com.practiceServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LearnCookie extends HttpServlet {
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		String name = req.getParameter("movie");
		PrintWriter out = res.getWriter();
		
		//Here server send cookie to my brwoser 
//		Cookie cookies = new Cookie("key" , "123");
//		res.addCookie(cookies);
		
		//Now i check and get Response that if exist print output and else create cookie 
		boolean isVisit = false;
		Cookie[] cookies = req.getCookies();
		if(cookies != null) {
			for(int i=0;i<cookies.length;i++) {
				Cookie c = cookies[i];
				String cookieName = c.getName();
				String value = c.getValue();
				if(cookieName.equals("key") && value.equals("123")) {
					out.print("User exist");
					out.print("Welcome back " +name);
					isVisit = true;
					break;
				}
				
			}
		}
		if(isVisit == false) {
			Cookie cookie = new Cookie("ck" , "987");
			res.addCookie(cookie);
			out.print("New user");
			out.print("Welcome "+name);
		}
		
 	 }
}
