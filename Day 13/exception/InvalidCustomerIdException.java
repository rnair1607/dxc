package com.cms.dxc.exception;

public class InvalidCustomerIdException extends RuntimeException 
{

	public InvalidCustomerIdException() 
	{
		
	}

	public InvalidCustomerIdException(String arg0) 
	{
		super(arg0);
		
	}

	public InvalidCustomerIdException(Throwable arg0) 
	{
		super(arg0);
		
	}

	public InvalidCustomerIdException(String arg0, Throwable arg1) 
	{
		super(arg0, arg1);
		
	}

	public InvalidCustomerIdException(String arg0, Throwable arg1, boolean arg2, boolean arg3) 
	{
		super(arg0, arg1, arg2, arg3);
		
	}

}
