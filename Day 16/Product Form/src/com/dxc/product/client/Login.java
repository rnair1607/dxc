package com.dxc.product.client;
import com.dxc.product.dao.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		UsersDAO usersDAO = new UsersDAOImpl();
		
		if(usersDAO.validate(userName, password)) {
			response.getWriter().println("<a href='Welcome.html'>Proceed</a>");
		}
		else {
			response.getWriter().println("<h1><center><b><i><font color='red'>Incorrect Credentials</font></i></b></center></h1>");
		}
				
	}

}
