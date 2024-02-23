package com.servlet.Rishi;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mylogin")
public class Login_8 extends HttpServlet{
// DoPostSecuity
	@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
			String myemail = (String) request.getParameter("name1");
			String mypass = (String) request.getParameter("pass1");
			
			if(myemail.equals("rishi@gmail.com") && mypass.equals("Rishi@123"))
			{
				System.out.println("success");
			}
			else
			{
				System.out.println("failed");
			}

		}
	}



