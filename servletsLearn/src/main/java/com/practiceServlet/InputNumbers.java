package com.practiceServlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InputNumbers extends HttpServlet {

	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException {
	    String n1 = req.getParameter("number1");
	    String n2 = req.getParameter("number2");

	    if (n1 == null || n1.isEmpty() || n2 == null || n2.isEmpty()) {
	        res.getWriter().print("Please enter both numbers");
	        return;
	    }

	    int num1 = Integer.parseInt(n1);
	    int num2 = Integer.parseInt(n2);

 	  
	    //RequestDispatcher method 
// 	  int sum = num1 + num2;
// 	  req.setAttribute("key", sum);
// 	  RequestDispatcher rd = req.getRequestDispatcher("AddNumbers");
 	  //rd.forward(req, res);
 	  //rd.include(req, res);
	    
	    //Redirect method 
	    int sub = num1-num2;
	    res.sendRedirect("MinusNumbers?k="+sub);
    }
}
