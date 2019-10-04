package com.dxc.irctc.dao;

import java.util.*;

import com.dxc.irctc.model.Ticket;

public class TicketDAOImpl implements TicketDAO 
{

	public TicketDAOImpl() 
	{
		
	}
	
	List<Ticket> allTicket = new ArrayList<Ticket>();

	@Override
	public Ticket getTicket(int pnr) 
	{
		
		return null;
	}

	@Override
	public List<Ticket> getAllTickets() 
	{
		
		return allTicket;
	}

	@Override
	public void addTicket(Ticket ticket) 
	{
		allTicket.add(ticket);

	}

	@Override
	public Ticket cancelTicket(int pnr) 
	{
		
		return null;
	}

	@Override
	public void updateTicket(Ticket ticket) 
	{
		

	}

}
