package session_Treaking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet1")
public class Servlet_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

       // Set response content type
       response.setContentType("text/html");

       // Get the PrintWriter object
       try( PrintWriter out = response.getWriter()){

           // Display the results in the browser
           out.println("<!DOCTYPE html>");
           out.println("<html>");
           out.println("<head>");
           out.println("<title>Servlet Servlet 2</title>");
           out.println("</head>");
           out.println("<body>");
          String name = request.getParameter("name");
          out.println("<h1>Hello , " + name + "welcome baack to my website.... </h1>");
          out.println("<h1>Thank you</h1>"); 
          out.println("</body></html>");
    	}
	}
}
