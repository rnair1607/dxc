package com.cms.dxc.pms.dao;
import com.cms.dxc.pms.model.*;
import java.util.*;

public interface ProductDAO 
{
	
	public Product getProduct(int productId);
	public List<Product> getAllProducts();
	public void addProduct(Product product);
	public void deleteProduct(int productId);
	public void updateProduct(Product product);

}
