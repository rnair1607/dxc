package com.cms.dxc.pms.dao;

import java.util.ArrayList;
import java.util.List;

import com.cms.dxc.pms.model.Product;

public class ProductDAOImpl implements ProductDAO 
{

	public ProductDAOImpl() 
	{
		
	}
	
	List<Product> allProduct = new ArrayList<Product>();

	@Override
	public Product getProduct(int productId) 
	{
		
		return null;
	}

	@Override
	public List<Product> getAllProducts() 
	{
		
		return allProduct;
	}

	@Override
	public void addProduct(Product product) 
	{
		
		allProduct.add(product);
	}

	@Override
	public Product deleteProduct(int productId) 
	{
		
		return null;
	}

	@Override
	public void updateProduct(Product product) 
	{
		

	}
}
