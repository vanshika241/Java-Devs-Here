package com.practiceServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/HttpSessionLearn")

public class HttpSessionLearn extends HttpServlet {
    public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
    	HttpSession ses = req.getSession();
    	String naam = (String) ses.getAttribute("nameBro");
    	PrintWriter out = res.getWriter();
    	out.print("Hello "+naam+ " Bhaiya");
    	
    }

}
