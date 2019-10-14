package com.user.dao;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.*;

import com.user.dbcon.*;
import com.user.model.Product;

import java.util.List;


public class RegisterationDAOImpl implements RegisterationDAO 
{
	
	Connection connection = DBConnection.getConnection();
	private static final String FETCH_PRODUCT_ALL = "select* from product";
	
	public RegisterationDAOImpl() 
	{
		
	}
	
	List<Product> allProduct = new ArrayList<Product>();

	@Override
	public Product getProduct(int productId) 
	{
		List<Product> allProduct = new ArrayList<Product>();
		try {
			Statement stat = connection.createStatement();
			ResultSet res = stat.executeQuery(FETCH_PRODUCT_ALL);
			while(res.next()) {
				
				Product product = new Product();
				product.setProductId(res.getInt(1));
				product.setProductName(res.getString(2));
				product.setQuantityOnHand(res.getInt(3));
				product.setPrice(res.getInt(4));
				allProduct.add(product);
			}
		}
		catch(SQLException e){
			
			e.printStackTrace();
		}
		Product product = allProduct.stream().filter(n->n.getProductId()==productId).findFirst().get();
		return product;
	}

	@Override
	public List<Product> getAllProducts() 
	{
		List<Product> allProduct = new ArrayList<Product>();
		try {
			Statement stat = connection.createStatement();
			ResultSet res = stat.executeQuery(FETCH_PRODUCT_ALL);
			while(res.next()) {
				
				Product product = new Product();
				product.setProductId(res.getInt(1));
				product.setProductName(res.getString(2));
				product.setQuantityOnHand(res.getInt(3));
				product.setPrice(res.getInt(4));
				allProduct.add(product);
			}
		}
		catch(SQLException e){
			
			e.printStackTrace();
		}
		
		return allProduct;
	}

	@Override
	public void addProduct(Product product) 
	{
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("insert into product values(?,?,?,?)");
			
			preparedStatement.setInt(1, product.getProductId());
			preparedStatement.setString(2, product.getProductName());
			preparedStatement.setInt(3, product.getQuantityOnHand());
			preparedStatement.setInt(4, product.getPrice());
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteProduct(int productId) 
	{
		List<Product> allProduct = new ArrayList<Product>();
		try {
			Statement stat = connection.createStatement();
			ResultSet res = stat.executeQuery(FETCH_PRODUCT_ALL);
			while(res.next()) {
				
				Product product = new Product();
				product.setProductId(res.getInt(1));
				product.setProductName(res.getString(2));
				product.setQuantityOnHand(res.getInt(3));
				product.setPrice(res.getInt(4));
				allProduct.add(product);
			}
		}
		catch(SQLException e){
			
			e.printStackTrace();
		}
		
		allProduct.removeIf(g->g.getProductId() == productId);
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("delete from product where productId = ?");
			preparedStatement.setInt(1, productId);
			preparedStatement.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		try {
			Statement stat = connection.createStatement();
			ResultSet res = stat.executeQuery(FETCH_PRODUCT_ALL);
			while(res.next()) {
				
				Product product = new Product();
				product.setProductId(res.getInt(1));
				product.setProductName(res.getString(2));
				product.setQuantityOnHand(res.getInt(3));
				product.setPrice(res.getInt(4));
				allProduct.add(product);
			}
		}
		catch(SQLException e){
			
			e.printStackTrace();
		}
		System.out.println("The updated Database:");
		System.out.println(allProduct);
		
	}

	@Override
	public void updateProduct(Product product) 
	{
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("update product set productName=?, quantityOnHand=?, price=? where productId=? ");
			
			preparedStatement.setInt(4, product.getProductId());
			preparedStatement.setString(1, product.getProductName());
			preparedStatement.setInt(2, product.getQuantityOnHand());
			preparedStatement.setInt(3, product.getPrice());
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
