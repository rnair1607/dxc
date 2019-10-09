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
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductDAO productDAO = new ProductDAOImpl();
		
		int productId = Integer.parseInt(request.getParameter("productId"));
		String productName = request.getParameter("productName");
		int quantityOnHand = Integer.parseInt(request.getParameter("quantityOnHand"));
		int price = Integer.parseInt(request.getParameter("price"));
		
		Product product = new Product(productId,productName,quantityOnHand,price);
		productDAO.updateProduct(product);
		response.getWriter().println("Updated Successfully!");
	}

}
