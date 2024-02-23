package com.rishi;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class S1
 */
@WebServlet("/ss1")
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // Get parameters from the form
        int number1 = Integer.parseInt(request.getParameter("number1"));
        int number2 = Integer.parseInt(request.getParameter("number2"));

        // Calculate sum and product
        int sum = number1 + number2;
        int product = number1 * number2;

        // Set response content type
        response.setContentType("text/html");

        // Get the PrintWriter object
        PrintWriter out = response.getWriter();

        // Display the results in the browser
        out.println("<html><body>");
        out.println("<h2>Math Operations Result</h2>");
        out.println("<p>Number 1: " + number1 + "</p>");
        out.println("<p>Number 2: " + number2 + "</p>");
        out.println("<p>Sum: " + sum + "</p>");
        out.println("<p>Product: " + product + "</p>");
        out.println("</body></html>");
	}

}
