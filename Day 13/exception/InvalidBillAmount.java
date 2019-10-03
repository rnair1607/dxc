package com.cms.dxc.exception;

public class InvalidBillAmount extends RuntimeException 
{

	public InvalidBillAmount() 
	{
		
	}

	public InvalidBillAmount(String message) 
	{
		super(message);
		
	}

	public InvalidBillAmount(Throwable cause) 
	{
		super(cause);
		
	}

	public InvalidBillAmount(String message, Throwable cause) 
	{
		super(message, cause);
		
	}

	public InvalidBillAmount(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) 
	{
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
