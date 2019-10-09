package com.dxc.product.client;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cms.dxc.product.model.Product;
import com.dxc.product.dao.ProductDAO;
import com.dxc.product.dao.ProductDAOImpl;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
        super();
        
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product product = new Product();
		ProductDAO productDAO = new ProductDAOImpl();
		
		int productId = Integer.parseInt(request.getParameter("productId"));
		productDAO.deleteProduct(productId);
		response.getWriter().println("<h2><center>Deleted Successfully!</center></h2>");
	}

}
