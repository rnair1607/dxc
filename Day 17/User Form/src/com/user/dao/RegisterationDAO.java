package com.user.dao;
import java.util.*;

import com.user.model.*;

public interface RegisterationDAO 
{
	
	public Product getProduct(int productId);
	public List<Product> getAllProducts();
	public void addProduct(Product product);
	public void deleteProduct(int productId);
	public void updateProduct(Product product);

}
