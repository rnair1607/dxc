package com.cms.dxc.model;
import com.cms.dxc.exception.*;

public class Customer 
{

	private int customerId;
	private String customerAddress;
	private String customerName;
	private int billAmount;
	
	public Customer() 
	{
		super();
	}
	
	public Customer(int customerId, String customerAddress, String customerName, int billAmount) 
	{
		
		super();
		
		checkCustomerId(customerId);
		this.customerAddress = customerAddress;
		this.customerName = customerName;
		checkBillAmount(billAmount);
		
	}

	private void checkCustomerId(int customerId) {
		if(customerId < 0) 
		{
			
			throw new InvalidCustomerIdException("Customer ID can not be negative!");
		}
		else
		{
			this.customerId = customerId;
		}
	}

	private void checkBillAmount(int billAmount) 
	{
		
		if(billAmount<0) 
		{
			
			
			throw new InvalidBillAmount("Bill amount can't be negative.");
			
		}
		else
		{
			
			this.billAmount = billAmount;
		}
	}

	
	public int getCustomerId()
	{
		return customerId;
	}

	public void setCustomerId(int customerId) 
	{
		checkCustomerId(customerId);
	}

	public String getCustomerAddress() 
	{
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) 
	{
		this.customerAddress = customerAddress;
	}

	public String getCustomerName() 
	{
		return customerName;
	}

	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}

	public int getBillAmount() 
	{
		return billAmount;
	}

	public void setBillAmount(int billAmount) 
	{
		checkBillAmount(billAmount);
	}

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + billAmount;
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (billAmount != other.billAmount)
			return false;
		if (customerAddress == null) 
		{
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerName == null)
		{
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}

	@Override
	public String toString() 
	{
		return "Customer [customerId=" + customerId + ", customerAddress=" + customerAddress + ", customerName="
				+ customerName + ", billAmount=" + billAmount + "]";
	}
	
	
	
	
	
	
	
	
}
