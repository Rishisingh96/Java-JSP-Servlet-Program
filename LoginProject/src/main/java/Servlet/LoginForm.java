package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;

@WebServlet("/login")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

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
				jakarta.servlet.RequestDispatcher rd;
				if (flag) {
					out.print("<h2 style='color: green;'>Login Successfully</h2>");
					rd = request.getRequestDispatcher("Home.html");
					rd.forward(request, response);
					// response.sendRedirect("Signup.html");
				} else {
					response.setContentType("text/html");
					rd = request.getRequestDispatcher("index.html");
					out.print("<h2 style='color: red;'>Invalid email or password</h2>");
					rd.forward(request, response);
					rd.include(request, response);

//	                   request.getRequestDispatcher()
					// response.sendRedirect("index.html");
				}

			} catch (SQLException e) {
				e.printStackTrace();
				out.println("Error: " + e.getMessage());
				request.getRequestDispatcher("index.html").forward(request, response);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			out.println("Error: MySQL JDBC Driver not found.");
		}
	}
}

/*
 * mysql> select * from student; +-----------------+----------+ | email |
 * password | +-----------------+----------+ | mohit@gmail.com | mohit123 | |
 * Rishi@gmail.com | Rishi123 | | rohan@gmail.com | rohan123 | | shyam@gmail.com
 * | shyam | +-----------------+----------+ 4 rows in set (0.00 sec)
 */