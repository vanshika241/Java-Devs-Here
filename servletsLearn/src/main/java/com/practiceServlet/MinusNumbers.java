package com.practiceServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MinusNumbers extends HttpServlet {
	public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		int num = Integer.parseInt(req.getParameter("k"));
		PrintWriter out = res.getWriter();
		out.print("The sum is "+num);
		
	    }
}
