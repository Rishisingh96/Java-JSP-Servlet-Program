package session_Treaking;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 // Set response content type
	       response.setContentType("text/html");

	       // Get the PrintWriter object
	       try( PrintWriter out = response.getWriter()){

	    	   // Display the results in the browser
	           out.println("<!DOCTYPE html>");
	           out.println("<html>");
	           out.println("<head>");
	           out.println("<title>Servlet Servlet</title>");
	           out.println("</head>");
	           out.println("<body>");
	          String name = request.getParameter("name");
	          out.println("<h1>Hello , " + name + "welcome to my website.... </h1>");
	          out.println("<h1><a href= 'servlet2'>Go to servlet 2</a></h1>"); 
	          out.println("</body>");
	          out.println("</html>");
	    	}
	}

}
