package com.company;
import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int a = Integer.parseInt(request.getParameter("num1"));
            int b = Integer.parseInt(request.getParameter("num2"));
            int sum = a + b;

            // Set the result attribute to be accessed in JSP
           
            request.setAttribute("result", sum);
            request.getRequestDispatcher("calculator.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            request.setAttribute("error", "Invalid input. Please enter valid numbers.");
            request.getRequestDispatcher("calculator.jsp").forward(request, response);
        }
    }
}
