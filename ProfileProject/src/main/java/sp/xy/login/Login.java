package sp.xy.login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		PrintWriter out  = res.getWriter();
		
		if(myemail.equals("rishi@gmail.com") && mypass.equals("Rishi@123"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, res);
		}
		else
		{
			
			res.setContentType("text/html");
			 out.print("<h3 style = 'color:red'> Email id and password did'nt matched</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			//rd.forward(req, res);
			rd.include(req, res);
		}
	}		
}
