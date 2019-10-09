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


@WebServlet("/productForm")
public class productForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public productForm() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int productId = Integer.parseInt(request.getParameter("productId"));
		String productName = request.getParameter("productName");
		int quantityOnHand = Integer.parseInt(request.getParameter("quantityOnHand"));
		int price = Integer.parseInt(request.getParameter("price"));
		
		response.getWriter().println("<h1><center>Your Product Details</center><h1><br>");
		response.getWriter().println("<h3><center>Product ID: "+productId+"</center><h3><br>");
		response.getWriter().println("<h3><center>Product Name: "+productName+"</center><h3><br>");
		response.getWriter().println("<h3><center>Quantity: "+quantityOnHand+"</center><h3><br>");
		response.getWriter().println("<h3><center>Price: "+price+"</center><h3><br>");
		
		Product product = new Product(productId,productName,quantityOnHand,price);
		ProductDAO productDAO = new ProductDAOImpl();
		productDAO.addProduct(product);
		
	}

}
