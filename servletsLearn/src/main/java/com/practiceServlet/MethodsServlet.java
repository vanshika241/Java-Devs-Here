package com.practiceServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MethodsServlet extends HttpServlet {
       public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
    	  String num1 = req.getParameter("number");
          if (num1 == null || num1.trim().isEmpty()) {
              res.getWriter().print("Please enter a number");
              return;
          }

    	  int num = Integer.parseInt(num1);
    	  
    	  
    	  PrintWriter out = res.getWriter();
    	  out.print("Your lucky number is "+num);
    	  
    	  
       }
}
