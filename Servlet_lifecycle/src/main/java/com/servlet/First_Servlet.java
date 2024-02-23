package com.servlet;

import javax.servlet.*;
import java.io.IOException;


public class First_Servlet {
	 ServletConfig conf;
	 public void init(ServletConfig conf)     {        // throws ServletException {
	        
	        this.conf = conf;
	        System.out.println("creating object:........");
	//throw new UnsupportedOperationException("creating object:........"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	    }        //For intili

	    /**
	     *
	     * @return
	     */
	    public ServletConfig getServletConfig() {
	       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	    return this.conf;
	    }

	    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
	        //throw new UnsupportedOperationException("Servicing.............."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	        System.out.println("Servicing............");
	    }

	    public String getServletInfo() {
	        //throw new UnsupportedOperationException("this serlet is created by Rishi singh"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	    return "this servlet is created by Rishi singh";
	    }

	    public void destroy() {
	       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	       System.out.println("going to destroy servlet object");
	    }

}
