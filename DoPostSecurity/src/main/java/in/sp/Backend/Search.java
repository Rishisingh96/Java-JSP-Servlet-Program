package in.sp.Backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitForm")
public class Search extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	String mysearch = req.getParameter("search1");
		//resp.sendRedirect("http://www.google.com");
	resp.sendRedirect("https://www.google.com/search?q="+mysearch);
	}
}
