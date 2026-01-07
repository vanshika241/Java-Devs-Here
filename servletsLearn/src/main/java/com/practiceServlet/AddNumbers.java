package com.practiceServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddNumbers extends HttpServlet {
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
 	   PrintWriter out = res.getWriter();
 	   int ans = (int)req.getAttribute("key");
 	   out.print("The sum of two numbers is "+ans);
    }
}
