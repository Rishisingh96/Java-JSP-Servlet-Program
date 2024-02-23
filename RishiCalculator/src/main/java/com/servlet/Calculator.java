package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // Get parameters from the form
        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String operation = request.getParameter("operation");

        // Perform calculation based on the selected operation
        double result = 0;
        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    response.sendRedirect("error.html");
                    return;
                }
                break;
        }

        // Set response content type
        response.setContentType("text/html");

        // Get the PrintWriter object
        PrintWriter out = response.getWriter();

        // Display the results in the browser
        out.println("<html><body>");
        out.println("<h2>Calculator Result</h2>");
        out.println("<p>Number 1: " + num1 + "</p>");
        out.println("<p>Number 2: " + num2 + "</p>");
        out.println("<p>Operation: " + operation + "</p>");
        out.println("<p>Result: " + result + "</p>");
        out.println("</body></html>");
    }

}
