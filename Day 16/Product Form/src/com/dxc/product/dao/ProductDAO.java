package com.dxc.product.dao;
import java.util.*;

import com.cms.dxc.product.model.*;

public interface ProductDAO 
{
	
	public Product getProduct(int productId);
	public List<Product> getAllProducts();
	public void addProduct(Product product);
	public void deleteProduct(int productId);
	public void updateProduct(Product product);

}
