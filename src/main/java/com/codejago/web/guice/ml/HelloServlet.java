package com.codejago.web.guice.ml;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import com.google.inject.Singleton;

/**
 * Old school servlet
 */
//@WebServlet
@Singleton
public class HelloServlet extends HttpServlet
{
  	@Override
 	public void doGet( HttpServletRequest req, HttpServletResponse resp) 
     throws ServletException, java.io.IOException
   {
       resp.setHeader( "Content-Type", "text/plain" );
     	
       resp.getWriter().print( "Hello hello again " );
   }
}
