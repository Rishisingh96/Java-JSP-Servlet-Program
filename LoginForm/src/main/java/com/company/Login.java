package com.company;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/login1")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        String url = "jdbc:mysql://localhost:3306/loginform";
        String user = "root";
        String password = "Rishi@9838";
        
        String inputEmail = request.getParameter("email");
        String inputPassword = request.getParameter("password");
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load the driver
            try (Connection conn = DriverManager.getConnection(url, user, password);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM student")) {

                boolean flag = false;
                
                // Check each row in the result set
                while (rs.next()) {
                    String dbEmail = rs.getString("email");
                    String dbPassword = rs.getString("password");
                    
                    if (dbEmail.equals(inputEmail) && dbPassword.equals(inputPassword)) {
                        flag = true;
                        break;
                    }
                }

                if (flag) {
                    request.setAttribute("message", "<h2 style='color: green;'>Login Successfully</h2>");
                } else {
                    request.setAttribute("message", "<h2 style='color: red;'>Invalid email or password</h2>");
                }

                request.getRequestDispatcher("login.jsp").forward(request, response);
                
            } catch (SQLException e) {
                e.printStackTrace();
                request.setAttribute("message", "Error: " + e.getMessage());
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            request.setAttribute("message", "Error: MySQL JDBC Driver not found.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
