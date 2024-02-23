package com.servlet.Rishi;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")
public class sendRedirect extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String mysearch = request.getParameter("search1");
//		response.sendRedirect("https:/www.google.com");
		response.sendRedirect("https://technologystudioin.wordpress.com");
	}
}
	
