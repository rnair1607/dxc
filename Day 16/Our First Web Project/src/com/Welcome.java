package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int counter = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
       
    }
 
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		counter++;
		
		String name = request.getParameter("name");
		response.getWriter().println("<h1><center>Welcome to DXC, "+name+"</center></h1>");
		response.getWriter().println("<h2>Your user number: </h2>"+counter);
		response.getWriter().println("<h3><a href='tc.html'>T&C</a></h3>");	
		
	}

}
