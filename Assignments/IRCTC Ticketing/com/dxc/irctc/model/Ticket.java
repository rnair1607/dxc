package com.dxc.irctc.model;

public class Ticket 
{
	
	private int pnr;
	private String passengerName;
	private String preferredBerth;
	private int fare;
	
	public Ticket() 
	{
		super();
	}

	public Ticket(int pnr, String passengerName, String preferredBerth, int fare) 
	{
		super();
		this.pnr = pnr;
		this.passengerName = passengerName;
		this.preferredBerth = preferredBerth;
		this.fare = fare;
	}

	public int getPnr()
	{
		return pnr;
	}

	public void setPnr(int pnr)
	{
		this.pnr = pnr;
	}

	public String getPassengerName() 
	{
		return passengerName;
	}

	public void setPassengerName(String passengerName)
	{
		this.passengerName = passengerName;
	}

	public String getPreferredBerth() 
	{
		return preferredBerth;
	}

	public void setPreferredBerth(String preferredBerth) 
	{
		this.preferredBerth = preferredBerth;
	}

	public int getFare() 
	{
		return fare;
	}

	public void setFare(int fare) 
	{
		this.fare = fare;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + fare;
		result = prime * result + ((passengerName == null) ? 0 : passengerName.hashCode());
		result = prime * result + pnr;
		result = prime * result + ((preferredBerth == null) ? 0 : preferredBerth.hashCode());
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
		Ticket other = (Ticket) obj;
		if (fare != other.fare)
			return false;
		if (passengerName == null) {
			if (other.passengerName != null)
				return false;
		} else if (!passengerName.equals(other.passengerName))
			return false;
		if (pnr != other.pnr)
			return false;
		if (preferredBerth == null) {
			if (other.preferredBerth != null)
				return false;
		} else if (!preferredBerth.equals(other.preferredBerth))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nTicket: \nPNR: " + pnr + "\nPassenger Name: " + passengerName + "\nPreferred Berth: " + preferredBerth
				+ "\nFare : " + fare+"\n" ;
	}
	
	
	

}
