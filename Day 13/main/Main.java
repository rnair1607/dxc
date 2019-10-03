package com.cms.dxc.main;
import com.cms.dxc.model.Customer;
import com.cms.dxc.exception.*;

public class Main 
{

	public static void main(String[] args) 
	{
		Customer customer = null;
		
		try 
		{
			customer = new Customer(101,"Anu","Pune",123);
			customer.setBillAmount(-9);
		}
		catch(InvalidBillAmount e) 
		{
		
			System.out.println(e.getMessage());
			
		}
		catch(InvalidCustomerIdException e) 
		{
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(customer);
	}

}
