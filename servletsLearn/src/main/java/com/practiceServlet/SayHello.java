package com.practiceServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SayHello extends HttpServlet {
       public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
    	   String name = req.getParameter("username");
    	   PrintWriter out = res.getWriter();
    	   out.print("Hello to "+name);
       }
}
