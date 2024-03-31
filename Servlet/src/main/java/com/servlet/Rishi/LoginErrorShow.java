package com.servlet.Rishi;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class LoginErrorShow extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
				String myemail = request.getParameter("email1");
				String mypass = request.getParameter("pass1");
				
				PrintWriter out = response.getWriter();
				
				if(myemail.equals("rishi@gmail.com") && mypass.equals("Rishi@123"))
				{
					request.setAttribute("name_key", "Rishi singh");
					RequestDispatcher rd = request.getRequestDispatcher("/profile.jsp");
					rd.forward(request, response);
				}
				else
				{
					response.setContentType("text/html");
					out.print("<h3 style = 'color:red'> Email id and password did'nt matched </h3>");
					RequestDispatcher rd = request.getRequestDispatcher("/NewFile1.html");
					rd.include(request, response);
				}
			}
		}






