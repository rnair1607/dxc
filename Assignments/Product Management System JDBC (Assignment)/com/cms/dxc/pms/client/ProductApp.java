package com.cms.dxc.pms.client;
import java.util.*;
import com.cms.dxc.pms.dao.*;
import com.cms.dxc.pms.model.*;

public class ProductApp 
{
	
	ProductDAO productDAO;
	int choice = 0;
	int productId;
	String productName;
	int quantityOnHand;
	int price;
	
	public ProductApp() 
	{
		
		this.productDAO = new ProductDAOImpl();
	}
	
	public void launchProductApp() 
	{
	
ProductDAO productDAO = new ProductDAOImpl();
		
		while(true) {
			
			System.out.println("M E N U");
			System.out.println("1. Add a Product.");
			System.out.println("2. Get all the Products.");
			System.out.println("3. Get Product by ID");
			System.out.println("4. Delete Product by ID");
			System.out.println("5. Update Product by ID");
			System.out.println("6. EXIT");
			
			Scanner sc = new Scanner(System.in);
			int choice = 0;
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) 
			{
			
			case 1:
				
				Product product = productInput();
				productDAO.addProduct(product);
				break;
				
			case 2:
				
				System.out.println(productDAO.getAllProducts());
				break;
				
			case 3:
				
				System.out.println("Enter the Product ID: ");
				productId = sc.nextInt();		
				Product searchedProduct = productDAO.getProduct(productId);
				System.out.println(searchedProduct);
				break;
				
			case 4:
				System.out.println("Enter the Product ID: ");
				productId = sc.nextInt();
				productDAO.deleteProduct(productId);
				System.out.println("Deleted successfully.");
				break;
				
			case 5:
				Product productToUpdate = productInput();
				productDAO.updateProduct(productToUpdate);
				System.out.println("Updated!");
				
			case 6:
				System.out.println("Thanks!");
				System.exit(0);
				
				
					
				
			default:
				
				System.out.println("Invalid option selected.");
				
				
				
			}
			
		}
		

	}

	private Product productInput()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product ID: ");
		int productId = sc.nextInt();
		System.out.println("Enter the Product Name: ");
		String productName = sc.next();
		System.out.println("Enter the quantity: ");
		int quantityOnHand = sc.nextInt();
		System.out.println("Enter the price: ");
		int price = sc.nextInt();
		
		Product product = new Product(productId,productName,quantityOnHand,price);
		return product;
	}
}
