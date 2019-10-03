package com.cms.dxc.pms.client;
import java.util.*;

import com.cms.dxc.pms.dao.*;

import com.cms.dxc.pms.model.*;

public class Main 
{
	
	public Main() 
	{
		
	}

	public static void main(String[] args)
	{
		
		ProductDAO productDAO = new ProductDAOImpl();
		
		while(true) {
			
			System.out.println("M E N U");
			System.out.println("1. Add the Products.");
			System.out.println("2. Get all the Products.");
			System.out.println("3. EXIT");
			
			Scanner sc = new Scanner(System.in);
			int choice = 0;
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) 
			{
			
			case 1:
				
				System.out.println("Enter the Product ID: ");
				int productId = sc.nextInt();
				System.out.println("Enter the Product Name: ");
				String productName = sc.next();
				System.out.println("Enter the quantity: ");
				int quantityOnHand = sc.nextInt();
				System.out.println("Enter the price: ");
				int price = sc.nextInt();
				
				Product product = new Product(productId,productName,quantityOnHand,price);
				productDAO.addProduct(product);
				break;
				
			case 2:
				
				System.out.println(productDAO.getAllProducts());
				break;
				
			case 3:
				
				System.out.println("Thanks for using our app!");
				System.exit(0);
				
			default:
				
				System.out.println("Invalid option selected.");
				
				
				
			}
			
		}
		

	}

}
