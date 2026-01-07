package com.practiceJSP;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/WithoutJSP")
public class WithoutJSP extends HttpServlet{
   public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
	   String name = req.getParameter("name");
	   PrintWriter out = res.getWriter();
	   out.println("<html><body bgcolor = 'blue'>");
	   out.print("Hello "+name);
	   out.println("</body></html>");
	   
   }
}