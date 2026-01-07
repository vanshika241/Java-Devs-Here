package com.practiceServlet;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/Message")

public class Message extends HttpServlet {
    public void service(HttpServletRequest req , HttpServletResponse res) throws IOException {
    	String brotherName = req.getParameter("bname");
    	HttpSession ses = req.getSession();
    	ses.setAttribute("nameBro", brotherName);
    	res.sendRedirect("HttpSessionLearn");
    }


}
