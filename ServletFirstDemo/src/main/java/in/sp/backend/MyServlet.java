package in.sp.backend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class MyServlet extends HttpServlet{
	@Override
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// backend code
		System.out.println("I am in doGet() method");
	}
}
