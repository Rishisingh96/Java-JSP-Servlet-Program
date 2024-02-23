package com.rishi;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class S2
 */
@WebServlet("s2")
public class S2 extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset = UTF-8");		
		response.getWriter().append("Served at: ").append(request.getContextPath());

		
		int nn1 = Integer.parseInt(request.getParameter("n1"));
		int nn2 = Integer.parseInt(request.getParameter("n2"));
		
		int p = nn1 * nn2;
		
		// get attribute from request object.........
	
		try(PrintWriter out = response.getWriter()){
			
			int sum = (int ) request.getAttribute("sum");
			out.println("<h1>");
			out.println("sum is = " + sum);
			out.println("Product is = " +p);
			out.println("</h1>");
			out.println("</body>");
			out.println("</html>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
