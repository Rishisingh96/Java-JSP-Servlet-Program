/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.servlet;

/**
 *
 * @author Rishi singh
 */

import java.io.IOException;
import javax.servlet.*;

public class First_Servlet  implements Servlet {
    // Life Cycle
    ServletConfig conf;
    
    /**
     *
     * @param conf
     */
    public void init(ServletConfig conf)     {        // throws ServletException {
        
        this.conf = conf;
        System.out.println("creating object:........");
//throw new UnsupportedOperationException("creating object:........"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }        //For intili

    /**
     *
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return this.conf;
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        //throw new UnsupportedOperationException("Servicing.............."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Servicing............");
    }

    @Override
    public String getServletInfo() {
        //throw new UnsupportedOperationException("this serlet is created by Rishi singh"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return "this servlet is created by Rishi singh";
    }

    @Override
    public void destroy() {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       System.out.println("going to destroy servlet object");
    }
    }

