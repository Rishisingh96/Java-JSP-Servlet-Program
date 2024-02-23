package rs.web.Gym;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/RegisterForm")
public class RegistrationForm extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		// System.out.println("I am DoGet() Method");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h2>Welcome to Register Servlet</h2>");
		String name = request.getParameter("user_name");
		String age =  request.getParameter("user_age");
		String gender = request.getParameter("user_gender");
		String locality = request.getParameter("user_locality");
		String email = request.getParameter("user_email");
		String phone = request.getParameter("user_phoneN");

		
		String cond = request.getParameter("condition");
		//out.println(cond);
		if(cond != null) {
		if(cond.equals("checked")) {		
			out.println("<h2> Name : " + name+" </h2>");
			out.println("<h2> age: " +age+" </h2>");
			out.println("<h2> gender: " +gender+" </h2>");
			out.println("<h2> locality: " +locality+" </h2>");
			out.println("<h2> email : " +email +" </h2>");
			out.println("<h2> phone : " +phone +" </h2>");
			
			// We can user JDBC
			
		}
		
		else {
			out.println("<h2>You have not accepted</h2>");
		}
	}	
		else {
			out.println("<h2>You have not accepted terms and conditions</h2>");
		}
	}
}
